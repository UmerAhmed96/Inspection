package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.CharacteristicsTypeService;
import com.example.Practice1.beans.TblQmInspectionCharacteristicTypes;
import com.example.Practice1.dto.RequestDto.CharacteristicsTypeRequestDto;
import com.example.Practice1.repository.CharacteristicsTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class CharacteristicsTypeServiceImpl implements CharacteristicsTypeService {

    @Autowired
    CharacteristicsTypeRepository characteristicsTypeRepository;

    @Override
    public ResponseEntity createCharacteristicsType(CharacteristicsTypeRequestDto characteristicsTypeRequestDto) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


        TblQmInspectionCharacteristicTypes typesBean = new TblQmInspectionCharacteristicTypes();

        typesBean.setActive(characteristicsTypeRequestDto.getActive());
        typesBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));
        typesBean.setInspectionCharacteristicTypeCode(characteristicsTypeRequestDto.getInspectionCharacteristicTypeCode());
        typesBean.setInspectionTharacteristicTypeText(characteristicsTypeRequestDto.getInspectionCharacteristicTypeText());


        if (!StringUtils.isEmpty(characteristicsTypeRequestDto.getUpdateDate())) {
            Date lastUpdate = dateFormat.parse(characteristicsTypeRequestDto.getUpdateDate());
            typesBean.setUpdateDate(lastUpdate);
        }

        characteristicsTypeRepository.save(typesBean);
        return ResponseEntity.ok().body("created");
    }

    @Override
    public ResponseEntity getType(int typeId) {

        Optional<TblQmInspectionCharacteristicTypes> type = characteristicsTypeRepository.findById(typeId);

        if (!type.isPresent()){
            return ResponseEntity.badRequest().body(String.format("Does not found Type %s",typeId));
        }

        return ResponseEntity.ok().body(type.get());
    }

    @Override
    public ResponseEntity deleteType(int typeId) {

        Optional<TblQmInspectionCharacteristicTypes> type =characteristicsTypeRepository.findById(typeId);

        if (!type.isPresent()){
            return ResponseEntity.badRequest().body(String.format("Does not found Type %s",typeId));
        }

        characteristicsTypeRepository.deleteById(typeId);
        return ResponseEntity.ok().body("Deleted");
    }
}
