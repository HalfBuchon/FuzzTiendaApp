package com.halfBuchon.mx.FuzzTiendaApp.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Setter
@Getter
public class ArticulosDTO {
	private Long 	idItem;
	private String 	nombre;
	private Short 	tipoItem;
	private String 	color;
	private Integer precioCompra;
	private Integer precioVenta;
	private String 	fechaCompra;
	private String 	fechaVenta;
	private Short 	uploadedIg;
	private Short 	uploadedFb;
	private Short 	uploadedWs;
	private String 	celVendedor;
	private Integer costoReparacion;
	private Integer timeConsumed;
	private Short 	estatus;
	private String 	comentarios;
	private String 	descripcionVenta;
}
