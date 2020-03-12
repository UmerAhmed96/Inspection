package com.example.Practice1.dto.RequestDto;

public class CharacteristicsTypeRequestDto {



    private String inspectionCharacteristicTypeCode;

    private String inspectionCharacteristicTypeText;

    private Integer active;

    private String createDate;

    private String updateDate;

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
