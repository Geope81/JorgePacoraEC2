package com.idat.EC2JorgePacoraVentas.servicio;

import java.util.List;

import com.idat.EC2JorgePacoraVentas.dto.ProductosDTORequest;
import com.idat.EC2JorgePacoraVentas.dto.ProductosDTOResponse;

public interface ProductoServicio {
	
	public void guardarProducto(ProductosDTORequest producto);
	public void editarProducto(ProductosDTORequest producto);
	public void eliminarProducto(Integer id);
	public List<ProductosDTOResponse> listarProductos();
	public ProductosDTOResponse obtenerProductoxId(Integer id);

}
