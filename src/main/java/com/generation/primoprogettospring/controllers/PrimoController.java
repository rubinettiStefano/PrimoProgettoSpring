package com.generation.primoprogettospring.controllers;

import com.generation.primoprogettospring.model.Persona;
import com.generation.primoprogettospring.model.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String es1(Model m)
	{
		return "es1";
	}

	@GetMapping("/esempio1")
	public String esempio1(Model m)
	{
		//							usato con Optional per decidere cosa restituire se è vuoto
		Persona p = dao.findById(1L).orElse(null);
		//Optional<Persona>, un oggetto che può contenere o no una persona
		//se trovi la persona restituiscila, altrimenti metti dentro p null
		//posso passarla alla pagina web grazie al model
		m.addAttribute("pers",p);//sto inserendo la persona
		//all'interno del Model, che è una MAPPA
		//la sua chiave è pers, il valore è l'oggetto di p
		//pers sarà utilizzabile nella pagina web

		//Il model contiene tutte le variabili passate alla pagina web
		return "esempio1";
	}
}
