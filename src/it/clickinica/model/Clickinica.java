package it.clickinica.model;

import java.util.List;
import java.util.Map;

//CONTROLLER
public class Clickinica {
	private Clinica clinica;
	
	


	public void mostraTipologieEsami(){
		this.clinica.getTipologieEsami(); //NON IMPLEMENTATO COMPLETAMENTE
	}

	public void mostraDettagliEsame(Esame esame){//NON IMPLEMENTATO COMPLETAMENTE

	}
	
	public void mostraEsamiDottore(String id){
		this.clinica.getDottori().get(id).getEsami();//NON IMPLEMENTATO COMPLETAMENTE
	
	}
	
	public void mostraEsamiPaziente(Paziente paziente){//NON IMPLEMENTATO COMPLETAMENTE
		paziente.getEsamiInProgramma();
		paziente.getEsamiPassati();
	}

	public void creaEsame(TipologiaEsame tipologia, Paziente paziente,Dottore dottore, String codice){
		this.clinica.getEsamiInCorso().put(codice,this.clinica.getAmministrazione().creaEsame(tipologia,paziente,dottore));

	}
	
	public void creaTipologiaEsame(String nome, String codice, String descrizione, Double costo, Map<String,String> prerequisiti){
		this.clinica.getTipologieEsami().put(codice,this.clinica.getAmministrazione().creaTipologiaEsame(nome,codice,descrizione,costo,prerequisiti));
	}

	public boolean loginPaziente(String id, String password){
		return clinica.getPaziente(id).checkPassword(password);
	}

	public boolean loginAmministrazione(String id, String password){
		return this.clinica.getAmministrazione().checkCredenziali(id,password);
	}
	
	
	public void inserisciRisultatiEsame(String codice){
		Esame e= this.clinica.getEsamiInCorso().get(codice); //NON COMPLETO RELATIVO AL CASO 6
	}
	
}
