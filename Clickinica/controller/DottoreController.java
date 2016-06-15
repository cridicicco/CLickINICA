package it.uniroma3.controller;

import java.util.List;







import it.uniroma3.facade.DottoreFacade;
import it.uniroma3.facade.UtenteFacade;
import it.uniroma3.model.Dottore;
import it.uniroma3.model.Esame;
import it.uniroma3.model.Utente;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean
public class DottoreController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private String specializzazione;
	private Dottore dottore;
	private String loginErr;
	private List<Esame> esami;
	private List<Dottore> dottori;

	@EJB
	private DottoreFacade dottoreFacade;

	public String createDottore() {
		this.dottore = dottoreFacade.createDottore(nome, cognome, specializzazione);
		return "dottore"; 
	}

	public String listDottori() {
		this.dottori = dottoreFacade.getAllDottori();
		return "dottori"; 
	}

	public String findDottore() {
		this.dottore = dottoreFacade.getDottore(id);
		return "dottore";
	}

	public String findDottore(Long id) {
		this.dottore = dottoreFacade.getDottore(id);
		return "dottore";
	}
	
	public String findDottoreGestione() {
		this.dottore = dottoreFacade.getDottore(id);
		return "dottoreGestione";
	}

	public void addEsame(Esame esame){ 
		
		this.esami.add(esame);
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public Dottore getDottore() {
		return dottore;
	}

	public void setDottore(Dottore dottore) {
		this.dottore = dottore;
	}

	public List<Dottore> getDottori() {
		return dottori;
	}

	public void setDottori(List<Dottore> dottori) {
		this.dottori = dottori;
	}
}


