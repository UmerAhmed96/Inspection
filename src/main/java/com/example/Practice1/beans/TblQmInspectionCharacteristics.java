package com.example.Practice1.beans;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_qm_inspection_characteristics")
@EntityListeners(AuditingEntityListener.class)
public class TblQmInspectionCharacteristics {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "inspection_characteristic_id")
    private Integer inspectionCharacteristicId;

    @Column(name = "inspection_characteristic_code")
    private String inspectionCharacteristicCode;

    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name="inspection_characteristic_name")
    private String inspectionCharacteristicName;

    @Column(name = "inspection_characteristic_status")
    private String inspectionCharacteristicStatus;


    @Column(name = "inspection_characteristic_short_text")
    private String inspectionCharacteristicShortText;

    @Column(name = "inspection_characteristic_type_id")
    private Integer inspectionCharacteristicTypeId;

    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
    private Date updateDate;

    public Integer getInspectionCharacteristicId() {
        return inspectionCharacteristicId;
    }

    public void setInspectionCharacteristicId(Integer inspectionCharacteristicId) {
        this.inspectionCharacteristicId = inspectionCharacteristicId;
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

    public String getInspectionCharacteristicStatus() {
        return inspectionCharacteristicStatus;
    }

    public void setInspectionCharacteristicStatus(String inspectionCharacteristicStatus) {
        this.inspectionCharacteristicStatus = inspectionCharacteristicStatus;
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
