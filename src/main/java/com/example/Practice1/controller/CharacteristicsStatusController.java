package com.example.Practice1.controller;

import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.CharacteristicsOperationsService;
import com.example.Practice1.app.service.impl.CharacteristicsStatusService;
import com.example.Practice1.dto.RequestDto.CharacteristicsOperationsRequestDto;
import com.example.Practice1.dto.RequestDto.CharacteristicsStatusRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

public class CharacteristicsStatusController {


    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;

    @Autowired
    CharacteristicsStatusService characteristicsStatusService;

    /**
     * Create Inspection Characterstics
     *
     * @param characteristicsStatusRequestDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create/status")
    public ResponseEntity createCharacteristicsType(@RequestBody @Valid CharacteristicsStatusRequestDto characteristicsStatusRequestDto ,
                                                    BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = characteristicsStatusService.createStatus(characteristicsStatusRequestDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }


    @GetMapping(value = "/get/status/{statusId}")
    public ResponseEntity getRecord(@PathVariable("statusId") int statusId){
        ResponseEntity responseEntity = characteristicsStatusService.getStatus(statusId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }


    @DeleteMapping(value = "/delete/status/{statusId}")
    public ResponseEntity deleteRecord(@PathVariable("statusId") int statusId){
        ResponseEntity responseEntity = characteristicsStatusService.deleteStatus(statusId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }
}
