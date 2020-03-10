package com.example.Practice1.dto.ResponseDto;

import java.util.Date;

public class InspectionCharacteristicsResponseDto {

    private String inspectionCharacteristicCode;
    private Integer plantId;
    private String inspectionCharacteristicName;
    private String inspectionCharacteristicShortText;
    private Integer inspectionCharacteristicTypeId;
    private Integer active;
    private Date createDate;
    private Date updateDate;
    private String inspectionCharacteristicStatus;

    public String getInspectionCharacteristicStatus() {
        return inspectionCharacteristicStatus;
    }

    public void setInspectionCharacteristicStatus(String inspectionCharacteristicStatus) {
        this.inspectionCharacteristicStatus = inspectionCharacteristicStatus;
    }

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
