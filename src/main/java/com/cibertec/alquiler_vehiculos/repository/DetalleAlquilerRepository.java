package com.cibertec.alquiler_vehiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.alquiler_vehiculos.model.DetalleAlquiler;

public interface DetalleAlquilerRepository extends JpaRepository<DetalleAlquiler, Integer> {
	List<DetalleAlquiler> findByAlquilerIdAlquiler(Integer idAlquiler);
}
