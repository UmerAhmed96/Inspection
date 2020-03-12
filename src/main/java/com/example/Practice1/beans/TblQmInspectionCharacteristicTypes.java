package com.example.Practice1.beans;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_qm_inspection_characteristic_types")
@EntityListeners(AuditingEntityListener.class)
public class TblQmInspectionCharacteristicTypes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "inspection_characteristic_type_id")
    private Integer inspectionCharacteristicTypeId;

    @Column(name = "inspection_characteristic_type_code")
    private String inspectionCharacteristicTypeCode;

    @Column(name = "inspection_characteristic_type_text")
    private String inspectionTharacteristicTypeText;

    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
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

    public String getInspectionTharacteristicTypeText() {
        return inspectionTharacteristicTypeText;
    }

    public void setInspectionTharacteristicTypeText(String inspectionTharacteristicTypeText) {
        this.inspectionTharacteristicTypeText = inspectionTharacteristicTypeText;
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
