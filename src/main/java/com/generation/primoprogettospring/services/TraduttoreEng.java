package com.generation.primoprogettospring.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//metti un oggetto di questa classe all'interno dell'APPLICATION CONTEXT
@Component
@Qualifier("eng")
public class TraduttoreEng implements Traduttore
{
	@Override
	public String traduci(String chiave)
	{
		switch (chiave)
		{
			case "s"-> {return "hello";}
			case "a"-> {return "bye";}
			default -> {return "idk";}
		}
	}
}
