package com.idat.EC2JorgePacoraVentas.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JorgePacoraVentas.dto.ProductosDTORequest;
import com.idat.EC2JorgePacoraVentas.dto.ProductosDTOResponse;
import com.idat.EC2JorgePacoraVentas.modelo.Productos;
import com.idat.EC2JorgePacoraVentas.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio{

	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setIdProducto(producto.getIdProductoDTO());
		p.setProducto(producto.getProductoDTO());
		p.setDescripcion(producto.getDescripcionDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.save(p);
		
	}

	@Override
	public void editarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setIdProducto(producto.getIdProductoDTO());
		p.setProducto(producto.getProductoDTO());
		p.setDescripcion(producto.getDescripcionDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.saveAndFlush(p);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<ProductosDTOResponse> listarProductos() {
		List<ProductosDTOResponse> lista = new ArrayList<ProductosDTOResponse>();
		ProductosDTOResponse p = null; 
		
		for (Productos producto : repositorio.findAll()) {
			p = new ProductosDTOResponse();			
			p.setIdProductoDTO(producto.getIdProducto());
			p.setProductoDTO(producto.getProducto());
			p.setDescripcionDTO(producto.getDescripcion());
			p.setPrecioDTO(producto.getPrecio());
			p.setStockDTO(producto.getStock());
			lista.add(p);
		}		
		return lista;
	}

	@Override
	public ProductosDTOResponse obtenerProductoxId(Integer id) {
Productos producto = repositorio.findById(id).orElse(null);
		
		ProductosDTOResponse p = new ProductosDTOResponse();
		p.setIdProductoDTO(producto.getIdProducto());
		p.setProductoDTO(producto.getProducto());
		p.setDescripcionDTO(producto.getDescripcion());
		p.setPrecioDTO(producto.getPrecio());
		p.setStockDTO(producto.getStock());
		return p;
	}

}
