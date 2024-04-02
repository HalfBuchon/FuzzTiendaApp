package com.halfBuchon.mx.FuzzTiendaApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.halfBuchon.mx.FuzzTiendaApp.DTO.ApiResponseDTO;
import com.halfBuchon.mx.FuzzTiendaApp.DTO.ArticulosDTO;
import com.halfBuchon.mx.FuzzTiendaApp.entities.ArticulosEntity;
import com.halfBuchon.mx.FuzzTiendaApp.services.ArticulosService;
import com.halfBuchon.mx.FuzzTiendaApp.util.Meta;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api")
public class MainController {

	private final String MENSAJE_BAD_REQUEST = "La informacion que envio no tiene el formato correcto";
	private final Meta META = new Meta(UUID.randomUUID().toString(), "OK", 200);

	@Autowired
	private ArticulosService articulosService;

	@GetMapping("/obteneritems")
	public ApiResponseDTO obtenerItems() {
		List<ArticulosEntity> respuesta = articulosService.obtenerItems();
		return new ApiResponseDTO(META, respuesta);
	}

	@GetMapping("obteneritem/{id}")
	public ApiResponseDTO obtenerItem(@PathVariable(value = "id") Long idItem) {
		Optional<ArticulosEntity> respuesta = articulosService.obtenerItem(idItem);
		return new ApiResponseDTO(META, respuesta);
	}

	@GetMapping("obteneritemsportipo/{tipoItem}")
	public List<ArticulosEntity> obtenerItemsPorTipo(@PathVariable(value = "tipoItem") Short tipoItem) {
		List<ArticulosEntity> respuesta = articulosService.obtenerItemsPorTipo(tipoItem);
		return respuesta;
	}

	@GetMapping("obteneritemsporestatus/{estatus}")
	public ApiResponseDTO obtenerItemsPorEstatus(@PathVariable(value = "estatus") Short estatus) {
		List<ArticulosEntity> respuesta = articulosService.obtenerItemsPorEstatus(estatus);
		return new ApiResponseDTO(META, respuesta);
	}

	@PostMapping("/agregaritem")
	public ApiResponseDTO agregarItem(@RequestBody ArticulosDTO articulosDTO) {
		articulosService.agregarItem(articulosDTO);
		return new ApiResponseDTO(META, "Se agrego el item correctamente");
	}

	@PostMapping("/actualizaritem")
	public ApiResponseDTO actualizarItem(@RequestBody ArticulosDTO articulosDTO) {
		articulosService.actualizarItem(articulosDTO);
		return new ApiResponseDTO(META, "Se actualizo el item correctamente");
	}

	@PostMapping("/borraritem/{id}")
	public ApiResponseDTO borrarItem(@PathVariable(value = "id") Long idItem) {
		articulosService.borrarItem(idItem);
		return new ApiResponseDTO(META, "Se borro el item correctamente");
	}

}
