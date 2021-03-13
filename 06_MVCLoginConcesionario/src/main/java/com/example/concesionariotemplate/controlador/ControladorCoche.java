package com.example.concesionariotemplate.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.concesionariotemplate.modelo.entidad.Coche;
import com.example.concesionariotemplate.modelo.negocio.GestorCoche;

@Controller
public class ControladorCoche {
	@Autowired
	private GestorCoche gestorCoche;

	@PostMapping("/doCoche")
	public String coche(@RequestParam("marca") String marca, @RequestParam("modelo") String modelo, Model model) {

		System.out.println("Entrando Coche");
		Coche coche = new Coche();
		coche.setMarca(marca);
		coche.setModelo(modelo);

		boolean validado = gestorCoche.validar(coche);
		if (validado) {
			model.addAttribute("fecha", new Date());
			List<String> lista = new ArrayList<String>();
			lista.add(marca);
			lista.add(modelo);
			model.addAttribute("lista", lista);
			return "inicio";
		} else {
			return "errorCoche";
		}
	}

}
