package com.cibertec.alquiler_vehiculos.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_vehiculo")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vehiculo")
	private Integer idVehiculo;
	
	@Column(name="placa", unique=true)
	private String placa;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="precio_diario")
	private BigDecimal precioDiario;

	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria Categoria;
}
