package com.mx.Automovil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Automovil.dominio.Automovil;

public interface AutomovilDao extends JpaRepository<Automovil, Integer>{

}
