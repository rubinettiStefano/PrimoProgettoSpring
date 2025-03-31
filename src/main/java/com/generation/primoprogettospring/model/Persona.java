package com.generation.primoprogettospring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Persona
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome,cognome,presentazione,indirizzo;


	public Persona()
	{
	}

	public Persona(Long id, String nome, String cognome, String presentazione, String indirizzo)
	{
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.presentazione = presentazione;
		this.indirizzo = indirizzo;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public String getPresentazione()
	{
		return presentazione;
	}

	public void setPresentazione(String presentazione)
	{
		this.presentazione = presentazione;
	}

	public String getIndirizzo()
	{
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo)
	{
		this.indirizzo = indirizzo;
	}
}
