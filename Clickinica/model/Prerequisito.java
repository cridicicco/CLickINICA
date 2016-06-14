package it.uniroma3.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Prerequisito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String valore;
	
	@ManyToMany
	private List<TipologiaEsame> tipologieEsami;
	
	public Prerequisito() {}
	
	public Prerequisito (String n,String v) {
		
		this.nome=n;
		this.valore=v;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome=n;
	}
	
	
	public String getValore() {
		return this.valore;
	}
	
	public void setValore(String v) {
		this.valore=v;
	}

	
       public List<TipologiaEsame> getTipologiaesame() {
		return this.tipologieEsami;
	}
	
	public void setTipologiaesame(List<TipologiaEsame> e) {
		this.tipologieEsami=e;
	}
	}



