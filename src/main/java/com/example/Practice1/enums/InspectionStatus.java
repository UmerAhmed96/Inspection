package com.example.Practice1.enums;

public enum InspectionStatus {

    ENABLE("ENABLE"),DISABLE("DISABLE");

    String value;

    InspectionStatus(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
