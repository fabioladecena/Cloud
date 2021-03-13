package com.example.concesionariotemplate.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.concesionariotemplate.modelo.entidad.Coche;

@Repository
	public interface DaoCoche extends JpaRepository<Coche, Integer>{
		public Optional<Coche> findByMarca(String marca);
	}

