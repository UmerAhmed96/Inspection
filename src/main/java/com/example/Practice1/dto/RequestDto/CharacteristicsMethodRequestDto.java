package com.example.Practice1.dto.RequestDto;

public class CharacteristicsMethodRequestDto {

    private Integer inspectionCharacteristicId;
    private Integer inspectionMethodId;
    private Integer active;
    private String updateDate;

    public Integer getInspectionCharacteristicId() {
        return inspectionCharacteristicId;
    }

    public void setInspectionCharacteristicId(Integer inspectionCharacteristicId) {
        this.inspectionCharacteristicId = inspectionCharacteristicId;
    }

    public Integer getInspectionMethodId() {
        return inspectionMethodId;
    }

    public void setInspectionMethodId(Integer inspectionMethodId) {
        this.inspectionMethodId = inspectionMethodId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
