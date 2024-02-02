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
	
	public void agregarItem(ArticulosDTO articuloDTO);

}
