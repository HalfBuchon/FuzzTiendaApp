package com.halfBuchon.mx.FuzzTiendaApp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormattedDTO {

    public class SpecsDTO{
        private Long idItem;
        private String nombre;
        private int tipoItem;
        private String color;
    }

    public class SbDataDTO{
        private int precioCompra;
        private int precioVenta;
        private String fechaCompra;
        private String fechaVenta;
    }

    public class VisibilityDTO{
        private int uploadedIg;
        private int uploadedFb;
        private int uploadedWs;
    }

    public class AdditionalDTO {
        private String celVendedor;
        private int costoReparacion;
        private int timeConsumed;
        private int estatus;
        private String comentarios;
        private String descripcionVenta;
    }

    public class ResponseDTO {
        private SpecsDTO specs;
        private SbDataDTO sbData;
        private VisibilityDTO visibility;
        private AdditionalDTO additional;
        public void setIdItem(Long idItem) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setIdItem'");
        }
    }


}
