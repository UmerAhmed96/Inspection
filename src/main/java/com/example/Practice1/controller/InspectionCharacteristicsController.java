package com.example.Practice1.controller;


import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.InspectionCharacteristicsService;
import com.example.Practice1.dto.RequestDto.InspectionCharacteristicsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;


@RestController
@RequestMapping("/inspection")
public class InspectionCharacteristicsController {


    @Autowired
    private InspectionCharacteristicsService inspectionCharacteristicsService;

    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;


    /**
     * Create Inspection Characterstics
     *
     * @param inspectionDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create")
    public ResponseEntity createInspectionCharacterstics(@RequestBody @Valid InspectionCharacteristicsRequestDto inspectionDto,
                                                         BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = inspectionCharacteristicsService.createInspectionCharacteristics(inspectionDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    /**
     * Get Inspection Characterstics
     *
     * @param inspectionId
     * @return ResponseDto of Inspection
     */

    @GetMapping(value = "/get/{inspectionId}")
    public ResponseEntity getRecord(@PathVariable("inspectionId") int inspectionId){
        ResponseEntity responseEntity = inspectionCharacteristicsService.getRecord(inspectionId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @DeleteMapping(value = "/delete/{inspectionId}")
    public ResponseEntity deleteRecord(@PathVariable("inspectionId") int inspectionId){
        ResponseEntity responseEntity = inspectionCharacteristicsService.deleteRecord(inspectionId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }


    @PostMapping(value = "/update")
    public ResponseEntity updateRecord(@RequestBody InspectionCharacteristicsRequestDto inspectionDto)  {

        ResponseEntity responseEntity = inspectionCharacteristicsService.updateRecord(inspectionDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }
}