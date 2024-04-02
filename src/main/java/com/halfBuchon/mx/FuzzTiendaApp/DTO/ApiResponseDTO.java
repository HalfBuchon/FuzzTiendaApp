package com.halfBuchon.mx.FuzzTiendaApp.DTO;

import com.halfBuchon.mx.FuzzTiendaApp.util.Meta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDTO {
    private Meta meta;
    private Object data;

    public ApiResponseDTO() {
    }

    public ApiResponseDTO(Meta meta, Object data) {
        super();
        this.meta = meta;
        this.data = data;
    }

}
