package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.CharacteristicsStatusService;
import com.example.Practice1.beans.TblQmIndicatorCharacteristicSamples;
import com.example.Practice1.beans.TblQmInspectionCharacteristicStatuses;
import com.example.Practice1.dto.RequestDto.CharacteristicsStatusRequestDto;
import com.example.Practice1.dto.ResponseDto.CharacteristicsStatusResponseDto;
import com.example.Practice1.repository.CharacteristicsStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class CharacteristicsStatusServiceImpl implements CharacteristicsStatusService {

    @Autowired
    CharacteristicsStatusRepository characteristicsStatusRepository;

    @Override
    public ResponseEntity createStatus(CharacteristicsStatusRequestDto statusDto) throws ParseException {

        TblQmInspectionCharacteristicStatuses statusBean = new TblQmInspectionCharacteristicStatuses();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        statusBean.setActive(statusDto.getActive());
        statusBean.setInspectionCharacteristicStatusCode(statusDto.getInspectionCharacteristicStatusCode());
        statusBean.setInspectionCharacteristicStatusText(statusDto.getInspectionCharacteristicStatusText());
        statusBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));
        characteristicsStatusRepository.save(statusBean);

        return ResponseEntity.ok().body("Created");
    }

    @Override
    public ResponseEntity getStatus(int statusId) {

        CharacteristicsStatusResponseDto statusDto = new CharacteristicsStatusResponseDto();
        Optional<TblQmInspectionCharacteristicStatuses> statuseRecord = characteristicsStatusRepository.findById(statusId);

        statusDto.setActive(statuseRecord.get().getActive());
        statusDto.setCreateDate(statuseRecord.get().getCreateDate());
        statusDto.setInspectionCharacteristicStatusCode(statuseRecord.get().getInspectionCharacteristicStatusCode());
        statusDto.setInspectionCharacteristicStatusText(statuseRecord.get().getInspectionCharacteristicStatusText());

        return ResponseEntity.ok().body(statusDto);
    }

    @Override
    public ResponseEntity deleteStatus(int statusId) {


        Optional<TblQmInspectionCharacteristicStatuses> method =characteristicsStatusRepository.findById(statusId);

        if (!method.isPresent()){
            return ResponseEntity.badRequest().body(String.format("Does not found status %s",statusId));
        }

        characteristicsStatusRepository.deleteById(statusId);


        return null;
    }


}
