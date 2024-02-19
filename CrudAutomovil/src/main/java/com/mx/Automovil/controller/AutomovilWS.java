package com.mx.Automovil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Automovil.dominio.Automovil;
import com.mx.Automovil.service.AutomovilService;

@RestController
@RequestMapping(path = "api/Automovil")
@CrossOrigin
public class AutomovilWS {

	@Autowired
	AutomovilService autoServ;

	@GetMapping("listar")
	public List<Automovil> listar() {
		return autoServ.listar();
	}

	@PostMapping("buscar")
	public Automovil buscar(@RequestBody Automovil auto) {
		return autoServ.buscar(auto);
	}

	@PostMapping("guardar")
	public void guardar(@RequestBody Automovil auto) {
		autoServ.guardar(auto);
	}

	@PostMapping("editar")
	public void editar(@RequestBody Automovil auto) {
		autoServ.editar(auto);
	}

	@PostMapping("eliminar")
	public void eliminar(@RequestBody Automovil auto) {
		autoServ.eliminar(auto);
	}

}
