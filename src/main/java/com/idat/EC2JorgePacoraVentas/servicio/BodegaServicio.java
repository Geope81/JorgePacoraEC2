package com.idat.EC2JorgePacoraVentas.servicio;

import java.util.List;

import com.idat.EC2JorgePacoraVentas.dto.BodegaDTORequest;
import com.idat.EC2JorgePacoraVentas.dto.BodegaDTOResponse;

public interface BodegaServicio {
	
	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	public void eliminarBodega(Integer id);
	public List<BodegaDTOResponse> listarBodega();
	public BodegaDTOResponse obtenerBodegaxId(Integer id);

}
