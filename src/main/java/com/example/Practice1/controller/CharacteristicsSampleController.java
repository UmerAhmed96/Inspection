package com.example.Practice1.controller;


import com.example.Practice1.Validator.ValidatorErrorCodeService;
import com.example.Practice1.app.service.impl.CharacteristicsMethodService;
import com.example.Practice1.app.service.impl.CharacteristicsSamplesService;
import com.example.Practice1.dto.RequestDto.CharacteristicsMethodRequestDto;
import com.example.Practice1.dto.RequestDto.CharacteristicsSamplesRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;



@RestController
@RequestMapping("/inspection")
public class CharacteristicsSampleController {

    @Autowired
    private ValidatorErrorCodeService validatorErrorCodeService;

    @Autowired
    CharacteristicsSamplesService characteristicsSamplesService;

    /**
     * Create Inspection Characterstics
     *
     * @param characteristicsSamplesRequestDto
     * @return Response message {created}
     */

    @PostMapping(value = "/create/sample")
    public ResponseEntity createCharacteristicsType(@RequestBody @Valid CharacteristicsSamplesRequestDto characteristicsSamplesRequestDto,
                                                    BindingResult bindingResult) throws ParseException {

        if (bindingResult.hasErrors()) {
            return validatorErrorCodeService.checkErrorMessages(bindingResult);
        }

        ResponseEntity responseEntity = characteristicsSamplesService.createSamples(characteristicsSamplesRequestDto);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @GetMapping(value = "/get/sample/{sampleId}")
    public ResponseEntity getRecord(@PathVariable("sampleId") int sampleId){
        ResponseEntity responseEntity = characteristicsSamplesService.getSample(sampleId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

    @DeleteMapping(value = "/delete/sample/{sampleId}")
    public ResponseEntity deleteRecord(@PathVariable("sampleId") int sampleId){
        ResponseEntity responseEntity = characteristicsSamplesService.deleteSample(sampleId);
        return ResponseEntity.ok().body(responseEntity.getBody());
    }

}
