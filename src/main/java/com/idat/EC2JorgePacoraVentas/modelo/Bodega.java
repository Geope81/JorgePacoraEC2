package com.idat.EC2JorgePacoraVentas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "bodegas")
@Entity
public class Bodega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String nombre;
	private String direccion;
	
	@ManyToOne
	private Cliente cliente;	
	
	public Integer getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Bodega() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bodega(Integer idBodega, String nombre, String direccion) {
		super();
		this.idBodega = idBodega;
		this.nombre = nombre;
		this.direccion = direccion;
	}
}
