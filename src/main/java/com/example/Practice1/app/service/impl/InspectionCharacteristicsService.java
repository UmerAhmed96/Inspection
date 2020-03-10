package com.example.Practice1.app.service.impl;

import com.example.Practice1.dto.RequestDto.InspectionCharacteristicsRequestDto;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;

public interface InspectionCharacteristicsService {

    ResponseEntity createInspectionCharacteristics(InspectionCharacteristicsRequestDto inspectionDto) throws ParseException;
    ResponseEntity getRecord(int inspectionId);
    ResponseEntity updateRecord(InspectionCharacteristicsRequestDto inspectionCharacteristicsRequestDto);
    ResponseEntity deleteRecord(int inspectionId);

}
