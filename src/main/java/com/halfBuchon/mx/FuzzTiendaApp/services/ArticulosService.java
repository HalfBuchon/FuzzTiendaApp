package com.halfBuchon.mx.FuzzTiendaApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.halfBuchon.mx.FuzzTiendaApp.DTO.ArticulosDTO;
import com.halfBuchon.mx.FuzzTiendaApp.entities.ArticulosEntity;

@Service
public interface ArticulosService {
	
	public List<ArticulosEntity> obtenerItems();
	
	public Optional<ArticulosEntity> obtenerItem(Long iditem);
	
	public List<ArticulosEntity> obtenerItemsPorTipo(Short tipoItem);
	
	public List<ArticulosEntity> obtenerItemsPorEstatus(Short estatus);
	
	public void agregarItem(ArticulosDTO articuloDTO);
	
	public void actualizarItem(ArticulosDTO articulosDTO);
	
	public void borrarItem(Long idItem);

}
