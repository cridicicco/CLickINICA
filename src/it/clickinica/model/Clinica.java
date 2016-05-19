package it.clickinica.model;

import java.util.List;
import java.util.Map;

public class Clinica {
private Map<String,TipologiaEsame> tipologieEsami;
private Map<String,Esame> esamiInCorso;
private Map<String,Paziente> pazienti;
private Map<String,Dottore> dottori;
private Amministrazione amministrazione;

public Map<String,TipologiaEsame> getTipologieEsami() {
	return tipologieEsami;
}

public void setTipologieEsami(Map<String,TipologiaEsame> tipologieEsami) {
	this.tipologieEsami = tipologieEsami;
}

public Paziente getPaziente(String id){
	return pazienti.get(id);
}


public Map<String,Esame> getEsamiInCorso() {
	return esamiInCorso;
}

public void setEsamiInCorso(Map<String,Esame> esamiInProgramma) {
	this.esamiInCorso = esamiInProgramma;
}

public Amministrazione getAmministrazione() {
	return amministrazione;
}

public void setAmministrazione(Amministrazione amministrazione) {
	this.amministrazione = amministrazione;
}

public Map<String,Dottore> getDottori() {
	return dottori;
}

public void setDottori(Map<String,Dottore> dottori) {
	this.dottori = dottori;
}
}
