package com.example.Practice1.dto.RequestDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties
public class InspectionCharacteristicsRequestDto {

    //Assuming this is the required field
    @NotEmpty(message = "Enter inspection characteristics code")
    private String inspectionCharacteristicCode;

    //Assuming this is the required field
    @NotNull(message = "Enter plant Id")
    private Integer plantId;

    private String inspectionCharacteristicName;
    private String inspectionCharacteristicShortText;
    private Integer inspectionCharacteristicTypeId;
    private Integer active;
    private String createDate;
    private String updateDate;


    public String getInspectionCharacteristicCode() {
        return inspectionCharacteristicCode;
    }

    public void setInspectionCharacteristicCode(String inspectionCharacteristicCode) {
        this.inspectionCharacteristicCode = inspectionCharacteristicCode;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getInspectionCharacteristicName() {
        return inspectionCharacteristicName;
    }

    public void setInspectionCharacteristicName(String inspectionCharacteristicName) {
        this.inspectionCharacteristicName = inspectionCharacteristicName;
    }

    public String getInspectionCharacteristicShortText() {
        return inspectionCharacteristicShortText;
    }

    public void setInspectionCharacteristicShortText(String inspectionCharacteristicShortText) {
        this.inspectionCharacteristicShortText = inspectionCharacteristicShortText;
    }

    public Integer getInspectionCharacteristicTypeId() {
        return inspectionCharacteristicTypeId;
    }

    public void setInspectionCharacteristicTypeId(Integer inspectionCharacteristicTypeId) {
        this.inspectionCharacteristicTypeId = inspectionCharacteristicTypeId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
