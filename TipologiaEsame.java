package it.clickinica.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TipologiaEsame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;
	@Column
	private String nome;
	@Column
	private String descrizione;
	@Column
	private Double costo;
	@ManyToMany(mappedBy= "esami")
	private List<Prerequisito> prerequisiti;
	@ManyToMany
	private List<Prerequisito> indicatori;
	
	public TipologiaEsame() {}

	public TipologiaEsame(Long codice, String nome, String descrizione, Double costo){
	
	this.codice=codice;
	this.nome=nome;
	this.descrizione=descrizione;
	this.costo=costo;
    this.prerequisiti=new ArrayList<>();
    this.indicatori=new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCodice() {
		return codice;
	}
	public void setCodice(Long codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}
	
	public void aggiungiPrerequisito(Prerequisito p) {
		this.prerequisiti.add(p);
	}
	
	public void rimuoviPrerequisito(Prerequisito p) {
		this.prerequisiti.remove(p);
	}
	public List<Prerequisito> getIndicatori() {
		return indicatori;
	}
	
	public void aggiungiIndicatore(Prerequisito i) {
		this.indicatori.add(i);
	}
	
	public void rimuoviIndicatore(String i) {
		this.indicatori.remove(i);
	}
	
	






}
