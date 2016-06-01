package it.uniroma3.controller;


import java.util.List;

import it.uniroma3.facade.ProductFacade;
import it.uniroma3.facade.TipologiaEsameFacade;
import it.uniroma3.model.Product;
import it.uniroma3.model.TipologiaEsame;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class TipologiaEsameController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private Float price;
	private String description;
	private String code;
	private TipologiaEsame tipologiaEsame;
	private List<TipologiaEsame> tipologieEsami;
	
	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;
	
	public String createTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.createTipologiaEsame(name, code, price, description);
		return "tipologiaEsame"; 
	}
	
	public String listTipologieEsami() {
		this.tipologieEsami = tipologiaEsameFacade.getAllTipologieEsami();
		return "tipologieEsami"; 
	}

	public String findTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
	}
	
	public String findTipologiaEsame(Long id) {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologia) {
		this.tipologiaEsame = tipologia;
	}

	public List<TipologiaEsame> getTipologieEsami() {
		return tipologieEsami;
	}

	public void setTipologieEsami(List<TipologiaEsame> tipologie) {
		this.tipologieEsami = tipologie;
	}
}


