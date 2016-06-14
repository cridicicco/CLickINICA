package it.uniroma3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Esame {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Column(nullable = false)
private String nome;

@Column(nullable=false)
private Float price;

@Column(length = 2000)
private String description;


@OneToOne
private TipologiaEsame tipEsame;

@ManyToOne
private Utente paziente;

@ManyToOne
private Dottore medico;

@Temporal (TemporalType.DATE)
private Date dataEsame;

@OneToMany
@JoinColumn(name= "esame_id")
private List<Risultato> risultati;

public Esame() {
}

public Esame(TipologiaEsame tip, Utente paziente, Dottore medico,Date data) {
    this.tipEsame = tip;
     this.paziente = paziente;
    this.medico = medico;
    this.dataEsame=data;
   
}

//          Getters & Setters        

public Long getId() {
    return id;
}


public String getName() {
    return this.nome;
}

public List<Risultato> getRisultati() {
	return risultati;
}

public void setRisultati(List<Risultato> risultati) {
this.risultati=risultati;
}

public void setName(String nome) {
    this.nome = nome;
}


public String getDescription() {
    return this.description;
}

public void setDescription(String description) {
    this.description = description;
}

public Float getPrice() {
    return price;
}

public void setPrice(Float price) {
    this.price = price;
}

public boolean equals(Object obj) {
    TipologiaEsame tip = (TipologiaEsame)obj;
    return this.getId().equals(tip.getId());
}


public void setId(Long id) {
	this.id = id;
}

public TipologiaEsame getTipologiaEsame() {
	return this.tipEsame;
}

public void setTipologiaEsame(TipologiaEsame t) {
	this.tipEsame=t;
}

public Utente getPaziente() {
	return this.paziente;
}

public void setPaziente (Utente u) {
	this.paziente=u;
}

public Dottore getDottore() {
	return this.medico;
}

public void  setDottore(Dottore d) {
	this.medico=d;
}

public Date getData() {
	return this.dataEsame;
}

public void setData(Date d) {
	this.dataEsame=d;
}

//public void addRisultato(Risultato r) {
	//this.risultati.add(r);
//}
}
