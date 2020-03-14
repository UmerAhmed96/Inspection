package com.example.Practice1.controller;

import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.CharacteristicsMethodService;
import com.example.Practice1.app.service.impl.CharacteristicsOperationsService;
import com.example.Practice1.dto.RequestDto.CharacteristicsMethodRequestDto;
import com.example.Practice1.dto.RequestDto.CharacteristicsOperationsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;



@RestController
@RequestMapping("/inspection")
public class CharacteristicsMethodController {

    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;

    @Autowired
    CharacteristicsMethodService characteristicsMethodService;
    /**
     * Create Inspection Characterstics
     *
     * @param characteristicsMethodRequestDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create/method")
    public ResponseEntity createCharacteristicsType(@RequestBody @Valid CharacteristicsMethodRequestDto characteristicsMethodRequestDto,
                                                    BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = characteristicsMethodService.createMethod(characteristicsMethodRequestDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }


    @GetMapping(value = "/get/method/{methodId}")
    public ResponseEntity getRecord(@PathVariable("methodId") int methodId){
        ResponseEntity responseEntity = characteristicsMethodService.getMethod(methodId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @DeleteMapping(value = "/delete/method/{methodId}")
    public ResponseEntity deleteRecord(@PathVariable("methodId") int methodId){
        ResponseEntity responseEntity = characteristicsMethodService.deleteMethod(methodId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }
}
