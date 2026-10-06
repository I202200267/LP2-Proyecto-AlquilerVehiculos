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
@Table(name="tb_detalle_alquiler")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetalleAlquiler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_detalle")
	private Integer idDetalle;
	
	@ManyToOne
	@JoinColumn(name="id_alquiler")
	private Alquiler alquier;
	
	@ManyToOne
	@JoinColumn(name="id_vehiculo")
	private Vehiculo vehiculo;
	
	@Column(name="dias")
	private Integer dias;
	
	@Column(name="precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name="subtotal")
	private BigDecimal subtotal;
}
