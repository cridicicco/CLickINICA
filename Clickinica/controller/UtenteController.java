package it.uniroma3.controller;

import java.util.List;


import it.uniroma3.facade.UtenteFacade;
import it.uniroma3.model.Utente;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class UtenteController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String cognome;
	private String userName;
	private String password;
	private String email;
	private Utente utente;
	private List<Utente> utenti;
	
	@EJB
	private UtenteFacade utenteFacade;
	
	public String createUtente() {
		this.utente = utenteFacade.createUtente(nome, cognome, userName, password,email);
		return "utente"; 
	}
	
	public String listUtenti() {
		this.utenti = utenteFacade.getAllUtenti();
		return "utenti"; 
	}

	public String findUtente() {
		this.utente = utenteFacade.getUtente(id);
		return "product";
	}
	
	public String findUtente(Long id) {
		this.utente = utenteFacade.getUtente(id);
		return "product";
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
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}
}


