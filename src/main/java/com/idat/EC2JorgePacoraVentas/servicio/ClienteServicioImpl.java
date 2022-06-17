package com.idat.EC2JorgePacoraVentas.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2JorgePacoraVentas.dto.ClienteDTORequest;
import com.idat.EC2JorgePacoraVentas.dto.ClienteDTOResponse;
import com.idat.EC2JorgePacoraVentas.modelo.Cliente;
import com.idat.EC2JorgePacoraVentas.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	public ClienteRepositorio repositorio;
	
	
	@Override
	public void guardarcliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		repositorio.save(c);
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		repositorio.saveAndFlush(c);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null;
		
		for (Cliente cliente : repositorio.findAll()) {
			c = new ClienteDTOResponse();
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setNombreDTO(cliente.getNombre());
			c.setDireccionDTO(cliente.getDireccion());
			c.setDniDTO(cliente.getDni());
			lista.add(c);					
		}		
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClientexId(Integer id) {
Cliente cliente = repositorio.findById(id).orElse(null);
		
		ClienteDTOResponse c = new ClienteDTOResponse();
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		return c;	
	}
	
	

}
