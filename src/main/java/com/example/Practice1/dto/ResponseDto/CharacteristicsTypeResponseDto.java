package com.example.Practice1.dto.ResponseDto;

import java.util.Date;

public class CharacteristicsTypeResponseDto {

    private Integer inspectionCharacteristicTypeId;
    private String inspectionCharacteristicTypeCode;
    private String inspectionCharacteristicTypeText;
    private Integer active;
    private Date createDate;
    private Date updateDate;

    public Integer getInspectionCharacteristicTypeId() {
        return inspectionCharacteristicTypeId;
    }

    public void setInspectionCharacteristicTypeId(Integer inspectionCharacteristicTypeId) {
        this.inspectionCharacteristicTypeId = inspectionCharacteristicTypeId;
    }

    public String getInspectionCharacteristicTypeCode() {
        return inspectionCharacteristicTypeCode;
    }

    public void setInspectionCharacteristicTypeCode(String inspectionCharacteristicTypeCode) {
        this.inspectionCharacteristicTypeCode = inspectionCharacteristicTypeCode;
    }

    public String getInspectionCharacteristicTypeText() {
        return inspectionCharacteristicTypeText;
    }

    public void setInspectionCharacteristicTypeText(String inspectionCharacteristicTypeText) {
        this.inspectionCharacteristicTypeText = inspectionCharacteristicTypeText;
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
