package com.idat.EC2JorgePacoraVentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2JorgePacoraVentas.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);
	Usuario findByPassword(String password);
	Usuario findByrol(String rol);

}
