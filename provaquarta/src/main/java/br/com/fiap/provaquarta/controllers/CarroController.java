package br.com.fiap.provaquarta.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.provaquarta.model.Carros;

@Controller
public class CarroController {
	
	@GetMapping("/carros")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("Carros/index");
		
		Carros carro1 = new Carros("Hyundai", "HB20", "ABC-1234", "Azul", 2014, 1.6);
		Carros carro2 = new Carros("Volkswagem", "Gol", "DFG-1234", "Prata", 2013, 1.0);
		Carros carro3 = new Carros("Audi", "A3", "HIJ-1234", "Preto", 2010, 2.0);
		
		List<Carros> carros = Arrays.asList(carro1,carro2, carro3);
		modelView.addObject("listarCarros", carros);
		
		return modelView;
	}
	
	
	
	
}
