package com.halfBuchon.mx.FuzzTiendaApp.util;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meta {

    private String transactionID;
    private String status;
    private int statusCode;
    private String timestamp;

    @JsonInclude(value = Include.NON_NULL)
    private String devMessage;

    @JsonInclude(value = Include.NON_NULL)
    private String message;

    public Meta() {
    }

    public Meta(String transactionID, String status, int statusCode) {
        this.transactionID = transactionID;
        this.status = status;
        this.statusCode = statusCode;
        this.timestamp = LocalDateTime.now().toString();
    }

    public Meta(String transactionID, String status, int statusCode, String message) {
        this.transactionID = transactionID;
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = LocalDateTime.now().toString();
    }

}
