package com.metadata.rest.dto;

public class RequestObject {

    private String ipackName;

    private String processName;

    private String processType;

    public String getIPackName(){
        return ipackName;
    }

    public void setIPackName(String ipackName){
        this.ipackName = ipackName;
    }

    public String getProcessName(){
        return processName;
    }

    public void setProcessName(String processName){
        this.processName = processName;
    }

    public String getProcessType(){
        return processType;
    }

    public void setProcessType(String processType){
        this.processType = processType;
    }

}
