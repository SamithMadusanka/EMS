package com.samith.employeems.response;

import java.io.Serializable;
import java.util.Date;


/**
 * @author - Samith Madusanka on 2020-06-27
 * @project - employee-ms
 **/
public class EMPResponse implements Serializable {
    private String language = "en";
    private String statusInfo;
    private String entityType;
    private Date lastModified;
    private Object data;
    private boolean success = true;
    private String errorMessage;
    private String requestedURI;

    public EMPResponse() {
        lastModified = new Date();
    }

    public EMPResponse(Object data) {
        this.data = data;
        lastModified = new Date();
        entityType = data.getClass().toString();
    }

    public EMPResponse(Object data, String statusInfo) {
        this.data = data;
        this.statusInfo = statusInfo;
        lastModified = new Date();
        entityType = data.getClass().toString();
    }

    public EMPResponse(String language, String statusInfo, String entityType, Date lastModified, Object data) {
        this.language = language;
        this.statusInfo = statusInfo;
        this.entityType = entityType;
        this.lastModified = lastModified;
        this.data = data;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequestedURI() {
        return requestedURI;
    }

    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    @Override
    public String toString() {
        return "bgkResponse{" +
                "data=" + data +
                '}';
    }
}



