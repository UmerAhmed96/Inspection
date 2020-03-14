package com.example.Practice1.beans;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_qm_inspection_characteristic_statuses")
@EntityListeners(AuditingEntityListener.class)
public class TblQmInspectionCharacteristicStatuses {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "inspection_characteristic_status_id")
    private Integer inspectionCharacteristicStatusId;

    @Column(name = "inspection_characteristic_status_code")
    private String inspectionCharacteristicStatusCode;

    @Column(name="inspection_characteristic_status_text")
    private String inspectionCharacteristicStatusText;

    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
    private Date updateDate;

    public Integer getInspectionCharacteristicStatusId() {
        return inspectionCharacteristicStatusId;
    }

    public void setInspectionCharacteristicStatusId(Integer inspectionCharacteristicStatusId) {
        this.inspectionCharacteristicStatusId = inspectionCharacteristicStatusId;
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
