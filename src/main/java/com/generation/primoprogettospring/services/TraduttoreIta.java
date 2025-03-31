package com.generation.primoprogettospring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //di base vince lui, se qualcuno vuole un componente prende questo
public class TraduttoreIta implements Traduttore
{

	@Override
	public String traduci(String chiave)
	{
		switch (chiave)
		{
			case "s"-> {return "ciao";}
			case "a"-> {return "addio";}
			default -> {return "boh";}
		}
	}
}
