package com.halfBuchon.mx.FuzzTiendaApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.halfBuchon.mx.FuzzTiendaApp.DTO.ArticulosDTO;
import com.halfBuchon.mx.FuzzTiendaApp.entities.ArticulosEntity;
import com.halfBuchon.mx.FuzzTiendaApp.repositories.ArticulosRepository;
import com.halfBuchon.mx.FuzzTiendaApp.services.ArticulosService;

@Service
public class ArticulosServiceImpl implements ArticulosService {

	@Autowired
	private ArticulosRepository articulosRepository;

	@Override
	public List<ArticulosEntity> obtenerItems() {
		List<ArticulosEntity> respuesta = articulosRepository.findAll();
		return respuesta;
	}

	@Override
	public Optional<ArticulosEntity> obtenerItem(Long idItem) {
		Optional<ArticulosEntity> respuesta = articulosRepository.findById(idItem);
		return respuesta;
	}

	@Override
	public void agregarItem(ArticulosDTO articuloDTO) {
		ArticulosEntity respuesta = new ArticulosEntity();
		respuesta.setIdItem(articuloDTO.getIdItem());
		respuesta.setNombre(articuloDTO.getNombre());
		respuesta.setTipoItem(articuloDTO.getTipoItem());
		respuesta.setColor(articuloDTO.getColor());
		respuesta.setPrecioCompra(articuloDTO.getPrecioCompra());
		respuesta.setPrecioVenta(articuloDTO.getPrecioVenta());
		respuesta.setFechaCompra(articuloDTO.getFechaCompra());
		respuesta.setFechaVenta(articuloDTO.getFechaVenta());
		respuesta.setUploadedIg(articuloDTO.getUploadedIg());
		respuesta.setUploadedFb(articuloDTO.getUploadedFb());
		respuesta.setUploadedWs(articuloDTO.getUploadedWs());
		respuesta.setCelVendedor(articuloDTO.getCelVendedor());
		respuesta.setCostoReparacion(articuloDTO.getCostoReparacion());
		respuesta.setTimeConsumed(articuloDTO.getTimeConsumed());
		respuesta.setEstatus(articuloDTO.getEstatus());
		respuesta.setComentarios(articuloDTO.getComentarios());
		respuesta.setDescripcionVenta(articuloDTO.getDescripcionVenta());

		articulosRepository.save(respuesta);

	}

}
