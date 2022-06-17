package com.idat.EC2JorgePacoraVentas.dto;

public class ProductosDTOResponse {
	
	private Integer idProductoDTO;
	private String ProductoDTO;
	private String descripcionDTO;
	private Double precioDTO;
	private Integer stockDTO;
	public Integer getIdProductoDTO() {
		return idProductoDTO;
	}
	public void setIdProductoDTO(Integer idProductoDTO) {
		this.idProductoDTO = idProductoDTO;
	}
	public String getProductoDTO() {
		return ProductoDTO;
	}
	public void setProductoDTO(String productoDTO) {
		ProductoDTO = productoDTO;
	}
	public String getDescripcionDTO() {
		return descripcionDTO;
	}
	public void setDescripcionDTO(String descripcionDTO) {
		this.descripcionDTO = descripcionDTO;
	}
	public Double getPrecioDTO() {
		return precioDTO;
	}
	public void setPrecioDTO(Double precioDTO) {
		this.precioDTO = precioDTO;
	}
	public Integer getStockDTO() {
		return stockDTO;
	}
	public void setStockDTO(Integer stockDTO) {
		this.stockDTO = stockDTO;
	}
	
	

}
