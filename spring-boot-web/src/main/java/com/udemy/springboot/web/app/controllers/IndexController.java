package com.udemy.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	// Forma completa de hacer el llamado al modulo de peticiones
	// @RequestMapping(path = "/index", method=RequestMethod.GET)
	// Llamado al modulo de peticiones por alias
	// @GetMapping("/index")
	// En caso de requerir el mapeo de un metodo para varias rutas
	
	@GetMapping({"/index", "/", "home"})
	// Model permite la implementacion de atributos clave - valor de thymeleaf
	// Otra forma practicamente igual es usar ModelMap en lugar de Model y los metodos son iguales
	public String index(Model model) {		
		model.addAttribute("titulo", "Hello Spring!");
		return "index";
	}
	
	/*
	// Usando la interfaz propia de Java llamada Map, se emplean otros metodos pero para la misma funcionalidad
	@GetMapping({"/index", "/", "home"})
	public String index(Map<String, Object> map) {
		// Model permite la implementacion de atributos clave - valor de thymeleaf
		map.put("titulo", "Hello Spring con Map!");
		return "index";
	}
	*/
	/*
	// Con ModelAndView
	@GetMapping({"/index", "/", "home"})
	public ModelAndView index(ModelAndView mv) {
		// Model permite la implementacion de atributos clave - valor de thymeleaf
		mv.addObject("titulo", "Hello Spring con ModelAndView!");
		// Se puede cargar el nombre de la vista
		mv.setViewName("index");
		return mv;
	}
	*/

}
