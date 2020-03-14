package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.CharacteristicsMethodService;
import com.example.Practice1.beans.TblQmInspectionCharacteristicMethods;
import com.example.Practice1.beans.TblQmInspectionCharacteristicTypes;
import com.example.Practice1.beans.TblQmInspectionCharacteristics;
import com.example.Practice1.dto.RequestDto.CharacteristicsMethodRequestDto;
import com.example.Practice1.dto.ResponseDto.CharacteristicsMethodResponseDt;
import com.example.Practice1.repository.CharacteristicsMethodRepository;
import com.example.Practice1.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class CharateristicsMethodServiceImpl implements CharacteristicsMethodService {

    @Autowired
    CharacteristicsMethodRepository characteristicsMethodRepository;

    @Autowired
    InspectionRepository inspectionRepository;
    @Override
    public ResponseEntity createMethod(CharacteristicsMethodRequestDto methodDto) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Optional<TblQmInspectionCharacteristics> tblQmInspectionCharacteristics = inspectionRepository.findById(methodDto.getInspectionCharacteristicId());
        TblQmInspectionCharacteristicMethods methodBean = new TblQmInspectionCharacteristicMethods();

        methodBean.setActive(methodDto.getActive());
        methodBean.setInspectionCharacteristicMethodId(methodDto.getInspectionMethodId());
        methodBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));
        methodBean.setInspectionCharacteristicId(tblQmInspectionCharacteristics.get());
        characteristicsMethodRepository.save(methodBean);

        return ResponseEntity.ok().body("Created");
    }

    @Override
    public ResponseEntity getMethod(int methodId) {

        CharacteristicsMethodResponseDt methodDto = new CharacteristicsMethodResponseDt();

        Optional<TblQmInspectionCharacteristicMethods> methodRecord = characteristicsMethodRepository.findById(methodId);

        methodDto.setActive(methodRecord.get().getActive());
        methodDto.setCreateDate(methodRecord.get().getCreateDate());
        methodDto.setInspectionCharacteristicId(methodRecord.get().getInspectionCharacteristicId());
        methodDto.setUpdateDate(methodRecord.get().getUpdateDate());

        return ResponseEntity.ok().body(methodDto);
    }

    @Override
    public ResponseEntity deleteMethod(int methodId) {

        Optional<TblQmInspectionCharacteristicMethods> method =characteristicsMethodRepository.findById(methodId);

        if (!method.isPresent()){
            return ResponseEntity.badRequest().body(String.format("Does not found Method %s",methodId));
        }

        characteristicsMethodRepository.deleteById(methodId);

        return ResponseEntity.ok().body("Deleted");
    }


}
