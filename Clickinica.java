package it.clickinica.model;

import java.util.ArrayList;
import java.util.List;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//CONTROLLER

@Entity
public class Clickinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Clinica clinica;
	@OneToOne
	private Amministrazione ammCorrente;
	@OneToOne
	private Paziente pazCorrente;
	
	
public Clickinica(Long id, Clinica c) {
	this.id=id;
	this.clinica=c;
}

public Long getId() {
	return this.id;
}

public void setId(Long id) {
	this.id=id;
}

	public void mostraTipologieEsami(){
		this.clinica.getTipologieEsami(); //NON IMPLEMENTATO COMPLETAMENTE
	}

	public void mostraDettagliEsame(Long id){
		Esame e= this.clinica.getEsamiInCorso().get(id);
		
		System.out.print(e.getTipologiaEsame());
		System.out.print(e.getPaziente());
		System.out.print(e.getDataPrenotazione());
		System.out.print(e.getDataEsame());
		System.out.print(e.getDottore());
		
		
		
		//NON IMPLEMENTATO COMPLETAMENTE

	}
	
	public void mostraEsamiDottore(Long id){
		Dottore d=this.clinica.getDottori().get(id);
		List<Esame> esami= new ArrayList<>();
		esami= d.getEsami();
		
		for (Esame e: esami) {
			System.out.print(e.getNome());
			
			//NON IMPLEMENTATO COMPLETAMENTE
		}
	
	}
	
	public void mostraEsamiPaziente(Paziente paziente){//NON IMPLEMENTATO COMPLETAMENTE
						
		List<Esame> esamiTotali= new ArrayList<>();
		esamiTotali.addAll(paziente.getEsamiInProgramma());
		esamiTotali.addAll(paziente.getEsamiPassati());
		
		for (Esame e: esamiTotali) {
			System.out.print(e.getNome());
		}
		
	}

	public void creaEsame(Long codice,TipologiaEsame tipologia, Paziente paziente,Dottore dottore){
		Esame e= this.ammCorrente.creaEsame(codice,tipologia,paziente,dottore);
		this.clinica.getEsamiInCorso().put(codice,e);
	}
	
	public void creaTipologiaEsame(Long codice,String nome ,String descrizione, Double costo){
		TipologiaEsame e=this.ammCorrente.creaTipologiaEsame(codice,nome,descrizione,costo);
		this.clinica.getTipologieEsami().put(codice,e);
	}

	public boolean loginPaziente(Long id, String password){
		return clinica.getPaziente(id).checkPassword(password);
	}

	public boolean loginAmministrazione(String id, String password){
		return this.ammCorrente.checkCredenziali(id,password);
	}
	
	
	public void inserisciRisultatiEsame(Long codice,String risultati){
		Esame e= this.clinica.getEsamiInCorso().get(codice);
		e.setRisultati(risultati);
		
		//NON COMPLETO RELATIVO AL CASO 6
	}
	
}
