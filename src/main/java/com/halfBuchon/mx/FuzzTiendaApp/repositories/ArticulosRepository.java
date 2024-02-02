package com.halfBuchon.mx.FuzzTiendaApp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.halfBuchon.mx.FuzzTiendaApp.entities.ArticulosEntity;

@Repository
public interface ArticulosRepository extends JpaRepository<ArticulosEntity, Long>{

	List<ArticulosEntity> findByTipoItem(Short tipoItem);

	List<ArticulosEntity> findByEstatus(Short estatus);

}
