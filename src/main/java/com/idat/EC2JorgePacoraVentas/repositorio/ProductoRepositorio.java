package com.idat.EC2JorgePacoraVentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2JorgePacoraVentas.modelo.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer>{

}
