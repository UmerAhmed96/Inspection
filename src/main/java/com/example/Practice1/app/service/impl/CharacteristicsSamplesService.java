package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.CharacteristicsSamplesRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface CharacteristicsSamplesService {

    ResponseEntity createSamples(CharacteristicsSamplesRequestDto characteristicsSamplesRequestDto) throws ParseException;
    ResponseEntity getSample(int sampleId);
    ResponseEntity deleteSample(int sampleId);

}
