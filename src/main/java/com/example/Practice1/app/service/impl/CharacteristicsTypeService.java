package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.CharacteristicsTypeRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface CharacteristicsTypeService {

    ResponseEntity createCharacteristicsType(CharacteristicsTypeRequestDto characteristicsTypeRequestDto) throws ParseException;
    ResponseEntity getType(int typeId);
    ResponseEntity deleteType(int typeId);

}
