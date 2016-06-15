package it.uniroma3.controller;

import java.util.List;









import it.uniroma3.facade.PrerequisitoFacade;
import it.uniroma3.facade.RisultatoFacade;
import it.uniroma3.facade.UtenteFacade;
import it.uniroma3.model.Esame;
import it.uniroma3.model.Prerequisito;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.enterprise.context.SessionScoped;


@ManagedBean
public class PrerequisitoController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String valore;
	

	private long esameId;
	private Prerequisito prerequisito;
	private List<Prerequisito> prerequisiti;

	
	@EJB
	private PrerequisitoFacade prerequisitoFacade;
	
	public String createPrerequisito() {
		this.prerequisito = prerequisitoFacade.createPrerequisito(nome,valore);
		return "prerequisito";
		
	}
	

	
	public String listPrerequisitiTipologia(long id) {
		this.prerequisiti = prerequisitoFacade.getAllPrerequisitiTipologia( id);
		return "prerequisiti"; 
	}

	public String findPrerequisito() {
		this.prerequisito = prerequisitoFacade.getPrerequisito(id);
		return "prerequisito";
	}
	       
	public String findPrerequisito(long id) {
		this.prerequisito = prerequisitoFacade.getPrerequisito(id);
		return "prerequisito";
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
	
	public String getValore() {
		return valore;
	}



	public void setValore(String valore) {
		this.valore = valore;
	}

}

