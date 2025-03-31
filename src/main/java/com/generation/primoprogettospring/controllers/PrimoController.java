package com.generation.primoprogettospring.controllers;

import com.generation.primoprogettospring.model.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimoController
{
	//@Controller -> pezzo del programma che comunica con il web

	//spring prenditi tu un oggetto e mettilo in questa variabile
	@Autowired
	PersonaDAO dao;

	//sto dicendo che se entri nel mio sito, all'url /homepage
	//ti viene restituita una pagina chiamata homepagebrutta  .html
	@GetMapping("/homepage")
	public String home()
	{
		return "homepagebrutta";
	}

	@GetMapping("/es1")
	public String es1()
	{
		return "es1";
	}
}
