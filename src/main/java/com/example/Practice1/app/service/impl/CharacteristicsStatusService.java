package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.CharacteristicsStatusRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface CharacteristicsStatusService {

    ResponseEntity createStatus(CharacteristicsStatusRequestDto characteristicsStatusRequestDto) throws ParseException;
    ResponseEntity getStatus(int statusId);
    ResponseEntity deleteStatus(int statusId);

}
