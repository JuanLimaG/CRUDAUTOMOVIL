package com.mx.Automovil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Automovil.dao.AutomovilDao;
import com.mx.Automovil.dominio.Automovil;

@Service
public class AutomovilImpServ implements AutomovilService {

	@Autowired
	AutomovilDao autoDao;
	
	@Override
	public void guardar(Automovil auto) {
		autoDao.save(auto);
	}

	@Override
	public void editar(Automovil auto) {
		autoDao.save(auto);		
	}

	@Override
	public void eliminar(Automovil auto) {
		autoDao.delete(auto);		
	}

	@Override
	public Automovil buscar(Automovil auto) {
		return autoDao.findById(auto.getIdAutomovil()).orElse(null);
	}

	@Override
	public List<Automovil> listar() {
		return autoDao.findAll(Sort.by(Sort.Direction.ASC,"idAutomovil"));
	}

}
