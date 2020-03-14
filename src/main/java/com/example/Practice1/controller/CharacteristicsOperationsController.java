package com.example.Practice1.controller;

import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.CharacteristicsOperationsService;
import com.example.Practice1.dto.RequestDto.CharacteristicsOperationsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;


@RestController
@RequestMapping("/inspection")
public class CharacteristicsOperationsController {

    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;

    @Autowired
    CharacteristicsOperationsService characteristicsOperationsService;

    /**
     * Create Inspection Characterstics
     *
     * @param characteristicsOperationsRequestDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create/operations")
    public ResponseEntity createCharacteristicsType(@RequestBody @Valid CharacteristicsOperationsRequestDto  characteristicsOperationsRequestDto,
                                                    BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = characteristicsOperationsService.createCharacteristicsOperation(characteristicsOperationsRequestDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }


        @GetMapping(value = "/get/operation/{operationId}")
        public ResponseEntity getRecord(@PathVariable("operationId") int operationId){
            ResponseEntity responseEntity = characteristicsOperationsService.getOperation(operationId);
            return ResponseEntity.ok().body(responseEntity.getBody());
        }



}
