package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Aula.java
//  @ Date : 03/05/2022
//  @ Author : 
//
//




public class Aula implements IAula {
	private String nombreCentro;
	private String idInterno;
	private Integer aforo;
	private Integer tipoAula;
	public PDI PDI;
	public Observadores observador;
	public CAula c_Aula;
	public PAS PAS;
	public Elemento elemento;
	public void monitorizarSensores() {
	
	}



	@Override
	public void Aula(String nombreCentro, String idInterno, Integer aforo, Integer tipoAula) {
		this.nombreCentro = nombreCentro;
		this.idInterno = idInterno;
		this.aforo = aforo;
		this.tipoAula = tipoAula;
	}

	@Override
	public void destroy() {
	
	}
}
