package com.mx.Automovil.service;

import java.util.List;

import com.mx.Automovil.dominio.Automovil;

public interface AutomovilService {

	public void guardar(Automovil auto);

	public void editar(Automovil auto);

	public void eliminar(Automovil auto);
	
	public Automovil buscar(Automovil auto);
	
	public List<Automovil> listar();
	
}
