package com.halfBuchon.mx.FuzzTiendaApp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.halfBuchon.mx.FuzzTiendaApp.DTO.ArticulosDTO;

public class ArticulosMapper implements RowMapper<ArticulosDTO> {

	public ArticulosDTO mapRow(ResultSet rs, int i) throws SQLException {
		ArticulosDTO respuesta = new ArticulosDTO();
		respuesta.setIdItem(rs.getLong("id_item"));
		respuesta.setNombre(rs.getString("nombre"));
		respuesta.setTipoItem(rs.getShort("tipo_item"));
		respuesta.setColor(rs.getString("color"));
		respuesta.setPrecioCompra(rs.getInt("precio_compra"));
		respuesta.setPrecioVenta(rs.getInt("precio_venta"));
		respuesta.setFechaCompra(rs.getString("fecha_compra"));
		respuesta.setFechaVenta(rs.getString("fecha_venta"));
		respuesta.setUploadedIg(rs.getShort("uploaded_ig"));
		respuesta.setUploadedFb(rs.getShort("uploaded_fb"));
		respuesta.setUploadedWs(rs.getShort("uploaded_ws"));
		respuesta.setCelVendedor(rs.getString("cel_vendedor"));
		respuesta.setCostoReparacion(rs.getInt("costo_reparacion"));
		respuesta.setTimeConsumed(rs.getInt("time_consumed"));
		respuesta.setEstatus(rs.getShort("estatus"));
		respuesta.setComentarios(rs.getString("comentarios"));
		respuesta.setDescripcionVenta(rs.getString("descripcion_venta"));

		return respuesta;

	}
}
