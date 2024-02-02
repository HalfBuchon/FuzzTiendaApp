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

	@PostMapping("/agregaritem")
	public Integer agregarItem(@RequestBody ArticulosDTO articulosDTO) {
		articulosService.agregarItem(articulosDTO);
		return 1;

	}
}
