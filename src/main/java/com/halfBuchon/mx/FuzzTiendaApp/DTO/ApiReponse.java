package com.halfBuchon.mx.FuzzTiendaApp.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class ApiReponse<T> {
    private String timestamp;
    private int status;
    private String error;
    private String path;
    private T data;
}
