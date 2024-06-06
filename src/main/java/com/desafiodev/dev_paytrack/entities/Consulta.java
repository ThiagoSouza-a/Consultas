package com.desafiodev.dev_paytrack.entities;

import java.io.Serializable;
import java.util.Objects;

public class Consulta implements Serializable{

	
private static final long serialVersionUID = 1L;

	private String nomeAnimal;
	private String especie;
	private String nomeVeterinario;
	private Double valorConsulta;
	
	public Consulta () {
		
	}

	public Consulta(String nomeAnimal, String especie, String nomeVeterinario, Double valorConsulta) {
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.nomeVeterinario = nomeVeterinario;
		this.valorConsulta = valorConsulta;
	}
	
	

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nomeVeterinario, valorConsulta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(nomeVeterinario, other.nomeVeterinario)
				&& Objects.equals(valorConsulta, other.valorConsulta);
	}

	

	
}
