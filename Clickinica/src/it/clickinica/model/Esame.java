package it.clickinica.model;

import java.sql.Date;

public class Esame {
private TipologiaEsame tipologia;
private Paziente paziente;
private Date data;

public Esame(TipologiaEsame tipologia, Paziente paziente){
	this.paziente=paziente;
	this.tipologia=tipologia;
	
	
}
}
