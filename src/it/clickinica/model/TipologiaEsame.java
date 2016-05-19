package it.clickinica.model;

import java.util.List;
import java.util.Map;

public class TipologiaEsame {

	private String nome;
	private String codice;
	private String descrizione;
	private Double costo;
	private Map<String,String> prerequisiti;
	private List<String> indicatori;

	public TipologiaEsame(String nome, String codice, String descrizione, Double costo, Map<String,String> prerequisiti){
	this.nome=nome;
	this.codice=codice;
	this.descrizione=descrizione;
	this.costo=costo;
    this.prerequisiti=prerequisiti;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Map<String,String> getPrerequisiti() {
		return prerequisiti;
	}
	public void setPrerequisiti(Map<String,String> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	public List getIndicatori() {
		return indicatori;
	}
	public void setIndicatori(List indicatori) {
		this.indicatori = indicatori;
	}






}
