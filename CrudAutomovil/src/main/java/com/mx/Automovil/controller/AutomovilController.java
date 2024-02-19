package com.mx.Automovil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.Automovil.dominio.Automovil;
import com.mx.Automovil.service.AutomovilService;

@Controller
@RequestMapping(path = "/")
public class AutomovilController {
	@Autowired
	AutomovilService autoServ;

	// Listar Automoviles
	@GetMapping
	public String index(Model model) {
		var lista = autoServ.listar();
		model.addAttribute("lista", lista);
		return "index";
	}

	// Save Auto
	@GetMapping("new")
	public String newAuto(Automovil auto) {
		return "save";
	}

	@PostMapping("save")
	public String save(Automovil auto) {
		autoServ.guardar(auto);
		return "redirect:/";
	}

	// Edit Auto
	@GetMapping("/openEdit/{idAutomovil}")
	public String openEdit(Automovil auto, Model model) {
		auto = autoServ.buscar(auto);
		model.addAttribute("auto", auto);
		return "edit";
	}
 
	@PostMapping("edit")
	public String edit(Automovil auto) {
		autoServ.editar(auto);
		return "redirect:/";
	}

	// Delete Auto
	@GetMapping("/openDelete/{idAutomovil}")
	public String openDelete(Automovil auto, Model model) {
		auto = autoServ.buscar(auto);
		model.addAttribute("auto", auto);
		return "delete";
	}

	@PostMapping("delete")
	public String delete(Automovil auto) {
		autoServ.eliminar(auto);
		return "redirect:/";
	}

}
