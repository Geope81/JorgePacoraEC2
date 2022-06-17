package com.idat.EC2JorgePacoraVentas.dto;

public class UsuarioDTORequest {
	
	private String usuario;
	private String contrasenia;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public UsuarioDTORequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuarioDTORequest(String usuario, String contrasenia) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
}
