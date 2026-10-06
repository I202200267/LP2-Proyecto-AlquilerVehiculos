package com.cibertec.alquiler_vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.alquiler_vehiculos.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Cliente findByDni(String dni);
}
