package com.bbva.egpi.server.log.beans;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogData {

	private final String path;
	private final String componente;
	private final String texto;
		
	/*
	"path": "F:/Varios/",
	"timestamp": "28/09/2017",
	"componente": "EGPIT013",
	"texto": "Error en comprobación de abono"
	 */
	
	public LogData(
	        @JsonProperty("path") String path, 
			@JsonProperty("componente") String componente, 
			@JsonProperty("texto") String texto) {
		
		this.path = path;
		this.componente = componente;
		this.texto = texto;
	}
	
	public String getComponente() {
		return componente;
	}
	public String getTexto() {
		return texto;
	}
	
	@Override
	public String toString() {
		return this.componente + " : " + this.texto;
	}

	public File getFile(String timestamp) {
		return new File(this.path + "/" + timestamp + "_" + this.componente + ".txt");
	}
	
	public String getPath() {
		return path;
	}
}