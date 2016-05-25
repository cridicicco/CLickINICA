package it.clickinica.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dottore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String specializzazione;
	@OneToMany
	@JoinColumn(name = "Dottore_id")
    private List<Esame> esami;

	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
   public String getNome() {
	   return this.nome;
   }
   
   public void setNome(String n) {
	   this.nome=n;
   }
   
   public String getCognome() {
	   return this.cognome;
   }
   
   public void setCognome(String c) {
	   this.cognome=c;
   }
   
   
   public String getSpecializzazione() {
	   return this.specializzazione;
   }
   
   public void setSpecializzazione(String s) {
	   this.specializzazione=s;
   }
   
   
   
public List<Esame> getEsami() {
	return esami;
}

public void setEsami(List<Esame> esami) {
	this.esami = esami;
}


}
