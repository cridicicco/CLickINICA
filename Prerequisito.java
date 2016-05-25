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
public class Prerequisito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private String valore;
	@ManyToMany
	private List<TipologiaEsame> esami;
	
	public Prerequisito(Long i,String n, String v) {
		this.id=i;
		this.nome=n;
		this.valore=v;
		this.esami= new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
		
	}
	
	public void setNome(String a) {
		this.nome=a;
	}
	
	public Long getId() {
		return this.id;
		
	}
	
	public void setId(Long a) {
		this.id=a;
	}
	
	public String getValore() {
		return this.nome;
		
	}
	
	public void setValore(String a) {
		this.valore=a;
	}
}

