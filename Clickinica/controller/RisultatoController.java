package it.uniroma3.controller;

import java.util.List;







import it.uniroma3.facade.RisultatoFacade;
import it.uniroma3.facade.UtenteFacade;
import it.uniroma3.model.Esame;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.enterprise.context.SessionScoped;


@ManagedBean
public class RisultatoController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String valore;
	private Risultato risultato;
	private List<Risultato> risultati;

	
	@EJB
	private RisultatoFacade risultatoFacade;
	
	public String createRisultato() {
		this.risultato = risultatoFacade.createRisultato(nome,valore);
		return "risultato";
		
	}
	

	
	public String getValore() {
		return valore;
	}



	public void setValore(String valore) {
		this.valore = valore;
	}



	public Risultato getRisultato() {
		return risultato;
	}



	public void setRisultato(Risultato risultato) {
		this.risultato = risultato;
	}



	public List<Risultato> getRisultati() {
		return risultati;
	}



	public void setRisultati(List<Risultato> risultati) {
		this.risultati = risultati;
	}



	public String listRisultati(long id) {
		this.risultati = risultatoFacade.getAllRisultatiEsame( id);
		return "risultati"; 
	}

	public String findRisultato() {
		this.risultato = risultatoFacade.getRisultato(id);
		return "utente";
	}
	       
	public String findRisultato(long id) {
		this.risultato = risultatoFacade.getRisultato(id);
		return "utente";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	


}

