package it.clickinica.model;

import java.util.Map;

public class Amministrazione {
	private String id;
	private String password;



	public Esame creaEsame(TipologiaEsame tipologia, Paziente paziente,Dottore dottore){
		Esame e = new Esame(tipologia,paziente);
		return e;

	}
	
	public boolean checkCredenziali(String id,String password){
		return this.password.equals(password) && this.id.equals(id);
	}
	
	public TipologiaEsame creaTipologiaEsame(String nome, String codice, String descrizione, Double costo, Map<String,String> prerequisiti){
		TipologiaEsame t= new TipologiaEsame(nome,codice,descrizione,costo,prerequisiti);
		return t;
	}

}
