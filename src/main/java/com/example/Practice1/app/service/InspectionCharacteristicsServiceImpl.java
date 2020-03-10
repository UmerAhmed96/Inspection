package com.example.Practice1.app.service;

import com.example.Practice1.app.service.impl.InspectionCharacteristicsService;
import com.example.Practice1.beans.TblQmInspectionCharacteristics;
import com.example.Practice1.dto.RequestDto.InspectionCharacteristicsRequestDto;
import com.example.Practice1.dto.ResponseDto.InspectionCharacteristicsResponseDto;
import com.example.Practice1.enums.InspectionStatus;
import com.example.Practice1.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import org.apache.log4j.Logger;

@Service
public class InspectionCharacteristicsServiceImpl implements InspectionCharacteristicsService {

    private static final Logger logger = Logger.getLogger(InspectionCharacteristicsServiceImpl.class);

    @Autowired
    InspectionRepository inspectionRepository;


    @Override
    public ResponseEntity createInspectionCharacteristics(InspectionCharacteristicsRequestDto inspectionDto) throws ParseException {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


            TblQmInspectionCharacteristics tblQmInspectionCharacteristicsBean = new TblQmInspectionCharacteristics();

            tblQmInspectionCharacteristicsBean.setActive(inspectionDto.getActive());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicCode(inspectionDto.getInspectionCharacteristicCode());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicName(inspectionDto.getInspectionCharacteristicName());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicShortText(inspectionDto.getInspectionCharacteristicShortText());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicStatus(InspectionStatus.ENABLE.getValue());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicTypeId(inspectionDto.getInspectionCharacteristicTypeId());
            tblQmInspectionCharacteristicsBean.setPlantId(inspectionDto.getPlantId());
            tblQmInspectionCharacteristicsBean.setCreateDate(dateTimeFormat.parse(dateTimeFormat.format(date)));

            if (!StringUtils.isEmpty(inspectionDto.getUpdateDate())) {
                Date lastUpdate = dateFormat.parse(inspectionDto.getUpdateDate());
                tblQmInspectionCharacteristicsBean.setUpdateDate(lastUpdate);
            }

            logger.info("Creating inspection Record");
            inspectionRepository.save(tblQmInspectionCharacteristicsBean);

            return ResponseEntity.ok().body("Created");
        }catch (Exception ex){

            logger.error("Error in creation of inspection characteristic");
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Override
    public ResponseEntity getRecord(int inspectionId) {

        try {

            InspectionCharacteristicsResponseDto inspectionCharacteristicsResponseDto = new InspectionCharacteristicsResponseDto();
            Optional<TblQmInspectionCharacteristics> record = inspectionRepository.findById(inspectionId);

            if (!record.isPresent()) {

                logger.error(String.format("No record found against %s ", inspectionId));
                return ResponseEntity.badRequest().body(String.format("No record found against %s ", inspectionId));
            }

            inspectionCharacteristicsResponseDto.setActive(record.get().getActive());
            inspectionCharacteristicsResponseDto.setInspectionCharacteristicCode(record.get().getInspectionCharacteristicCode());
            inspectionCharacteristicsResponseDto.setInspectionCharacteristicName(record.get().getInspectionCharacteristicName());
            inspectionCharacteristicsResponseDto.setInspectionCharacteristicShortText(record.get().getInspectionCharacteristicShortText());
            inspectionCharacteristicsResponseDto.setInspectionCharacteristicStatus(record.get().getInspectionCharacteristicStatus());
            inspectionCharacteristicsResponseDto.setInspectionCharacteristicTypeId(record.get().getInspectionCharacteristicTypeId());
            inspectionCharacteristicsResponseDto.setPlantId(record.get().getPlantId());
            inspectionCharacteristicsResponseDto.setCreateDate(record.get().getCreateDate());
            inspectionCharacteristicsResponseDto.setUpdateDate(record.get().getUpdateDate());

            logger.info(String.format("Getting inspection record of %s",inspectionId));
            return ResponseEntity.ok().body(inspectionCharacteristicsResponseDto);
        }catch (Exception ex){

            logger.error("Error in getting  inspection characteristic");
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Override
    public ResponseEntity updateRecord(InspectionCharacteristicsRequestDto inspectionDto) {


        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


            TblQmInspectionCharacteristics tblQmInspectionCharacteristicsBean = new TblQmInspectionCharacteristics();

            tblQmInspectionCharacteristicsBean.setActive(inspectionDto.getActive());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicCode(inspectionDto.getInspectionCharacteristicCode());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicName(inspectionDto.getInspectionCharacteristicName());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicShortText(inspectionDto.getInspectionCharacteristicShortText());
            tblQmInspectionCharacteristicsBean.setInspectionCharacteristicTypeId(inspectionDto.getInspectionCharacteristicTypeId());
            tblQmInspectionCharacteristicsBean.setPlantId(inspectionDto.getPlantId());

            if (!StringUtils.isEmpty(inspectionDto.getUpdateDate())) {
                Date lastUpdate = dateFormat.parse(inspectionDto.getUpdateDate());
                tblQmInspectionCharacteristicsBean.setUpdateDate(lastUpdate);
            }

            logger.info("Updating inspection Record");

            //save method can use for updating the record in jpa same id will update the record
            inspectionRepository.save(tblQmInspectionCharacteristicsBean);

            return ResponseEntity.ok().body("Updated");
        }catch (Exception ex){

            logger.error("Error in Updating the record of inspection characteristic");
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Override
    public ResponseEntity deleteRecord(int inspectionId) {

        Optional<TblQmInspectionCharacteristics> record = inspectionRepository.findById(inspectionId);

        if (!record.isPresent()) {
            logger.error(String.format("No record found against %s ", inspectionId));
            return ResponseEntity.badRequest().body(String.format("No record found against %s ", inspectionId));
        }

        inspectionRepository.deleteById(inspectionId);
        logger.info("Inspection Record deleted");

        return ResponseEntity.ok().body("Deleted");
    }
}
