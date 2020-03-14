package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.CharacteristicsSamplesService;
import com.example.Practice1.beans.TblQmIndicatorCharacteristicSamples;
import com.example.Practice1.beans.TblQmInspectionCharacteristicMethods;
import com.example.Practice1.beans.TblQmInspectionCharacteristics;
import com.example.Practice1.dto.RequestDto.CharacteristicsSamplesRequestDto;
import com.example.Practice1.dto.ResponseDto.CharacteristicsSamplesResponseDto;
import com.example.Practice1.repository.CharacteristicsSampleRepository;
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
public class CharacteristicsSamplesServiceImpl implements CharacteristicsSamplesService {

    @Autowired
    CharacteristicsSampleRepository characteristicsSampleRepository;

    @Autowired
    InspectionRepository inspectionRepository;


    @Override
    public ResponseEntity createSamples(CharacteristicsSamplesRequestDto sampleDto) throws ParseException {

        TblQmIndicatorCharacteristicSamples sampleBean = new TblQmIndicatorCharacteristicSamples();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Optional<TblQmInspectionCharacteristics> tblQmInspectionCharacteristics = inspectionRepository.findById(sampleDto.getInspectionCharacteristicId());

        sampleBean.setActive(sampleDto.getActive());
        sampleBean.setIndicatorCharacteristicSampleCode(sampleDto.getIndicatorCharacteristicSampleCode());
        sampleBean.setSamplingProcedureId(sampleDto.getSamplingProcedureId());
        sampleBean.setInspectionCharacteristicId(tblQmInspectionCharacteristics.get());
        sampleBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));

        characteristicsSampleRepository.save(sampleBean);

        return ResponseEntity.ok().body("Created");
    }

    @Override
    public ResponseEntity getSample(int sampleId) {

        Optional<TblQmIndicatorCharacteristicSamples> sampleRecord = characteristicsSampleRepository.findById(sampleId);

        CharacteristicsSamplesResponseDto sampleDto = new CharacteristicsSamplesResponseDto();

        sampleDto.setActive(sampleRecord.get().getActive());
        sampleDto.setCreateDate(sampleRecord.get().getCreateDate());
        sampleDto.setIndicatorCharacteristicSampleCode(sampleRecord.get().getIndicatorCharacteristicSampleCode());
        sampleDto.setInspectionCharacteristicId(sampleRecord.get().getInspectionCharacteristicId());
        sampleDto.setUpdateDate(sampleRecord.get().getUpdateDate());


        return ResponseEntity.ok().body(sampleDto);
    }

    @Override
    public ResponseEntity deleteSample(int sampleId) {


        Optional<TblQmIndicatorCharacteristicSamples> method =characteristicsSampleRepository.findById(sampleId);

        if (!method.isPresent()){
            return ResponseEntity.badRequest().body(String.format("Does not found Method %s",sampleId));
        }

        characteristicsSampleRepository.deleteById(sampleId);



        return ResponseEntity.ok().body("Deleted");
    }
}
