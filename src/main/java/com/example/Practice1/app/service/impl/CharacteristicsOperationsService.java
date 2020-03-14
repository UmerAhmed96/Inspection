package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.CharacteristicsOperationsRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface CharacteristicsOperationsService {

    ResponseEntity createCharacteristicsOperation(CharacteristicsOperationsRequestDto opeartionDto) throws ParseException;
    ResponseEntity getOperation(int operationId);
}
