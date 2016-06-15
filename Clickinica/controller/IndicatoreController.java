package it.uniroma3.controller;

import java.util.List;











import it.uniroma3.facade.IndicatoreFacade;
import it.uniroma3.facade.PrerequisitoFacade;
import it.uniroma3.facade.RisultatoFacade;
import it.uniroma3.facade.UtenteFacade;
import it.uniroma3.model.Esame;
import it.uniroma3.model.Indicatore;
import it.uniroma3.model.Prerequisito;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.enterprise.context.SessionScoped;


@ManagedBean
public class IndicatoreController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private Indicatore indicatore;
	private List<Indicatore> indicatori;

	
	@EJB
	private IndicatoreFacade indicatoreFacade;
	
	public String createIndicatore() {
		this.indicatore = indicatoreFacade.createIndicatore(nome);
		return "indicatore";
		
	}
	

	
	public String listIndicatoriTipologia(long id) {
		this.indicatori = indicatoreFacade.getAllIndicatoriTipologia( id);
		return "indicatori"; 
	}

	public String findIndicatore() {
		this.indicatore = indicatoreFacade.getIndicatore(id);
		return "indicatore";
	}
	       
	public String findIndicatore(long id) {
		this.indicatore = indicatoreFacade.getIndicatore(id);
		return "indicatore";
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

