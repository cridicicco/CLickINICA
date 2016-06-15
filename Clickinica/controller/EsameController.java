package it.uniroma3.controller;

import it.uniroma3.model.Dottore;
import it.uniroma3.facade.EsameFacade;
import it.uniroma3.facade.TipologiaEsameFacade;
import it.uniroma3.model.Esame;
import it.uniroma3.model.Dottore;
import it.uniroma3.model.TipologiaEsame;
import it.uniroma3.model.Utente;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class EsameController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	

	private TipologiaEsame tipologiaEsame;
	private Utente paziente;
	private Dottore dottore;
	private Esame esame;
	private Date data;
	private long paziente_id;

	private long dottore_id;
	private long tipologiaEsame_id;

	private List<Esame> esami;

	
	@EJB
	private EsameFacade esameFacade;
	
	public String createEsame() {
		this.data=new Date();
		this.esame = esameFacade.createEsame(tipologiaEsame_id,dottore_id,paziente_id,data);
		return "esame"; 
	}
	
	public String listEsamiUtente(long id){
		this.esami = esameFacade.getAllEsamiUtente(id);
		return "esami"; 
	}

	public String listEsamiDottore(long id){
		this.esami = esameFacade.getAllEsamiDottore(id);
		return "esami"; 
	}

	
	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public String findEsame(){
		this.esame = esameFacade.getEsame(id);
		return "esame";
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}



	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}



	public Utente getPaziente() {
		return paziente;
	}



	public void setPaziente(Utente paziente) {
		this.paziente = paziente;
	}



	public Dottore getDottore() {
		return dottore;
	}



	public void setDottore(Dottore dottore) {
		this.dottore = dottore;
	}



	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public long getPaziente_id() {
		return paziente_id;
	}

	public void setPaziente_id(long paziente_id) {
		this.paziente_id = paziente_id;
	}

	public long getDottore_id() {
		return dottore_id;
	}

	public void setDottore_id(long dottore_id) {
		this.dottore_id = dottore_id;
	}

	public long getTipologiaEsame_id() {
		return tipologiaEsame_id;
	}

	public void setTipologiaEsame_id(long tipologiaEsame_id) {
		this.tipologiaEsame_id = tipologiaEsame_id;
	}
	
}