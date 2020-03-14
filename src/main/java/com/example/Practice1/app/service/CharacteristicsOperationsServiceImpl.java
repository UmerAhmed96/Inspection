package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.CharacteristicsOperationsService;
import com.example.Practice1.beans.TblQmInspectionCharacteristicOperations;
import com.example.Practice1.beans.TblQmInspectionCharacteristics;
import com.example.Practice1.dto.RequestDto.CharacteristicsOperationsRequestDto;
import com.example.Practice1.dto.ResponseDto.CharacteristicsOperationResponseDto;
import com.example.Practice1.repository.CharacteristicsOperationRepository;
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
public class CharacteristicsOperationsServiceImpl implements CharacteristicsOperationsService {

    @Autowired
    InspectionRepository inspectionRepository;

    @Autowired
    CharacteristicsOperationRepository characteristicsOperationRepository;

    @Override
    public ResponseEntity createCharacteristicsOperation(CharacteristicsOperationsRequestDto operationDto) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


        Optional<TblQmInspectionCharacteristics> tblQmInspectionCharacteristics = inspectionRepository.findById(operationDto.getCharacteristicsId());

        TblQmInspectionCharacteristicOperations operationsBean = new TblQmInspectionCharacteristicOperations();

        operationsBean.setActive(operationDto.getActive());
        operationsBean.setInspectionCharacteristicPlanOperationId(operationDto.getCharacteristicsPlanOperationId());
        operationsBean.setSamplingProcedureId(operationDto.getSamplingProcedureId());
        operationsBean.setTblQmInspectionCharacteristics(tblQmInspectionCharacteristics.get());
        operationsBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));
        operationsBean.setTblQmInspectionCharacteristicMethods(operationDto.getCharacteristicsMethodId());

        characteristicsOperationRepository.save(operationsBean);
        return ResponseEntity.ok().body("Created");
    }

    @Override
    public ResponseEntity getOperation(int operationId) {

        Optional<TblQmInspectionCharacteristicOperations> operationRecord = characteristicsOperationRepository.findById(operationId);

        CharacteristicsOperationResponseDto operationResponseDto = new CharacteristicsOperationResponseDto();
        operationResponseDto.setActive(operationRecord.get().getActive());
        operationResponseDto.setCharacteristicsId(operationRecord.get().getTblQmInspectionCharacteristics());
        operationResponseDto.setCharacteristicsMethodId(operationRecord.get().getTblQmInspectionCharacteristicMethods());
        operationResponseDto.setCharacteristicsPlanOperationId(operationRecord.get().getInspectionCharacteristicPlanOperationId());
        operationResponseDto.setSamplingProcedureId(operationRecord.get().getSamplingProcedureId());
        operationResponseDto.setCreateDate(operationRecord.get().getCreateDate());
        operationResponseDto.setUpdateDate(operationRecord.get().getUpdateDate());


        return ResponseEntity.ok().body(operationResponseDto);
    }


}
