package com.example.Practice1.dto.ResponseDto;

import java.util.Date;

public class CharacteristicsStatusResponseDto {

    private String inspectionCharacteristicStatusCode;

    private String inspectionCharacteristicStatusText;

    private Integer active;
    private Date createDate;
    private Date updateDate;

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

    public String getInspectionCharacteristicStatusCode() {
        return inspectionCharacteristicStatusCode;
    }

    public void setInspectionCharacteristicStatusCode(String inspectionCharacteristicStatusCode) {
        this.inspectionCharacteristicStatusCode = inspectionCharacteristicStatusCode;
    }

    public String getInspectionCharacteristicStatusText() {
        return inspectionCharacteristicStatusText;
    }

    public void setInspectionCharacteristicStatusText(String inspectionCharacteristicStatusText) {
        this.inspectionCharacteristicStatusText = inspectionCharacteristicStatusText;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
