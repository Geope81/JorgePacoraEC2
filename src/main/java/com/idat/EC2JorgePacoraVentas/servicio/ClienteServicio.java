package com.idat.EC2JorgePacoraVentas.servicio;

import java.util.List;

import com.idat.EC2JorgePacoraVentas.dto.ClienteDTORequest;
import com.idat.EC2JorgePacoraVentas.dto.ClienteDTOResponse;

public interface ClienteServicio {
	
	public void guardarcliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	public void eliminarCliente(Integer id);
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClientexId(Integer id);

}
