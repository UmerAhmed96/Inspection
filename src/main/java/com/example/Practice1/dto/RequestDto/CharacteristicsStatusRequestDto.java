package com.example.Practice1.dto.RequestDto;

import javax.persistence.Column;
import java.util.Date;

public class CharacteristicsStatusRequestDto {

    private String inspectionCharacteristicStatusCode;

    private String inspectionCharacteristicStatusText;

    private Integer active;

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
