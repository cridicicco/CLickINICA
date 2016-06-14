package it.uniroma3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Risultato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String valore;
	
	@ManyToOne
	private Esame esame;
	
	public Risultato() {}
	
	public Risultato (Long id,String n,String v) {
		this.id=id;
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

	
       public Esame getEsame() {
		return this.esame;
	}
	
	public void setEsame(Esame e) {
		this.esame=e;
	}
	}


