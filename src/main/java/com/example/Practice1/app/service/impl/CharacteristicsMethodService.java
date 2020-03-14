package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.CharacteristicsMethodRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface CharacteristicsMethodService {

    ResponseEntity createMethod(CharacteristicsMethodRequestDto characteristicsMethodRequestDto) throws ParseException;
    ResponseEntity getMethod(int methodId);
    ResponseEntity deleteMethod(int methodId);

}
