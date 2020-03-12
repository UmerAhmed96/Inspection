package com.example.Practice1.controller;

import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.CharacteristicsTypeService;
import com.example.Practice1.dto.RequestDto.CharacteristicsTypeRequestDto;
import com.example.Practice1.dto.RequestDto.InspectionCharacteristicsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;



@RestController
@RequestMapping("/inspection")
public class CharacteristicsTypeController {


    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;

    @Autowired
    CharacteristicsTypeService characteristicsTypeService;


    /**
     * Create Inspection Characterstics
     *
     * @param characteristicsTypeRequestDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create/type")
    public ResponseEntity createCharacteristicsType(@RequestBody @Valid CharacteristicsTypeRequestDto characteristicsTypeRequestDto,
                                                         BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = characteristicsTypeService.createCharacteristicsType(characteristicsTypeRequestDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @GetMapping(value = "/get/{typeId}")
    public ResponseEntity getRecord(@PathVariable("typeId") int typeId){
        ResponseEntity responseEntity = characteristicsTypeService.getType(typeId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @DeleteMapping(value = "/delete/{typeId}")
    public ResponseEntity deleteRecord(@PathVariable("typeId") int typeId){
        ResponseEntity responseEntity = characteristicsTypeService.deleteType(typeId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }
}
