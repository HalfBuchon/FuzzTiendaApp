package com.halfBuchon.mx.FuzzTiendaApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.halfBuchon.mx.FuzzTiendaApp.DTO.ArticulosDTO;
import com.halfBuchon.mx.FuzzTiendaApp.entities.ArticulosEntity;
import com.halfBuchon.mx.FuzzTiendaApp.services.ArticulosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class MainController {

	@Autowired
	private ArticulosService articulosService;

	@GetMapping("/obteneritems")
	public List<ArticulosEntity> obtenerItems() {
		List<ArticulosEntity> respuesta = articulosService.obtenerItems();
		return respuesta;
	}

	@GetMapping("obteneritem/{id}")
	public Optional<ArticulosEntity> obtenerItem(@PathVariable(value = "id") Long idItem) {
		Optional<ArticulosEntity> respuesta = articulosService.obtenerItem(idItem);
		return respuesta;
	}
	
	@GetMapping("obteneritemsportipo/{tipoItem}")
	public List<ArticulosEntity> obtenerItemsPorTipo(@PathVariable(value = "tipoItem")Short tipoItem) {
		List<ArticulosEntity> respuesta = articulosService.obtenerItemsPorTipo(tipoItem);
		return respuesta;
	}
	
	@GetMapping("obteneritemsporestatus/{estatus}")
	public List<ArticulosEntity> obtenerItemsPorEstatus(@PathVariable(value = "estatus")Short estatus) {
		List<ArticulosEntity> respuesta = articulosService.obtenerItemsPorEstatus(estatus);
		return respuesta;
	}

	@PostMapping("/agregaritem")
	public Integer agregarItem(@RequestBody ArticulosDTO articulosDTO) {
		articulosService.agregarItem(articulosDTO);
		return 1;
	}
	
	@PostMapping("/actualizaritem")
	public Integer actualizarItem(@RequestBody ArticulosDTO articulosDTO) {
	articulosService.actualizarItem(articulosDTO);
	return 1;
	}
	
	@PostMapping("/borraritem/{id}")
	public Integer borrarItem(@PathVariable(value="id")Long idItem) {
		articulosService.borrarItem(idItem);
		return 1;
	}
	
}
