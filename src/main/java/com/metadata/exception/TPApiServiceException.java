package com.metadata.exception;

import org.springframework.http.HttpStatus;

public class TPApiServiceException extends RuntimeException {

    private static final long serialVersionUID = 15658756576465465L;
    private String responseMessage;
    private HttpStatus httpStatus;

    public TPApiServiceException(Throwable error) {
        super(error);
    }

    public TPApiServiceException(String errorMessage, HttpStatus httpStatus) {
        this.responseMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

