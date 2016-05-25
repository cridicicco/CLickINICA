package it.clickinica.model;


import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Clinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	@JoinColumn(name = "Clinica_id")
private Map<Long,TipologiaEsame> tipologieEsami;

	@OneToMany
	@JoinColumn(name = "Clinica_id")
	private Map<Long,Esame> esamiInCorso;
	
	@OneToMany
	@JoinColumn(name = "Clinica_id")
private Map<Long,Paziente> pazienti;
	
	@OneToMany
	@JoinColumn(name = "Clinica_id")
private Map<Long,Dottore> dottori;


public Map<Long,TipologiaEsame> getTipologieEsami() {
	return tipologieEsami;
}

public void setTipologieEsami(Map<Long,TipologiaEsame> tipologieEsami) {
	this.tipologieEsami = tipologieEsami;
}

public Paziente getPaziente(Long id){
	return pazienti.get(id);
}


public Map<Long,Esame> getEsamiInCorso() {
	return esamiInCorso;
}

public void setEsamiInCorso(Map<Long,Esame> esamiInProgramma) {
	this.esamiInCorso = esamiInProgramma;
}



public Map<Long,Dottore> getDottori() {
	return dottori;
}

public void setDottori(Map<Long,Dottore> dottori) {
	this.dottori = dottori;
}
}
