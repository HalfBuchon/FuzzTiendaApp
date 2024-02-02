package com.halfBuchon.mx.FuzzTiendaApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "articulos")
public class ArticulosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
