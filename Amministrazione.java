package it.clickinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Amministrazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String password;
	
public Long getId() {
	return this.id;
}

public void setId(Long id) {
	this.id=id;
}

public String getPassword() {
	return this.password;
}

public void setPassword(String p) {
	this.password=p;
}


	public Esame creaEsame(Long codice,TipologiaEsame tipologia, Paziente paziente,Dottore dottore){
		Esame e = new Esame(codice,tipologia,paziente,dottore);
		return e;

	}
	
	public boolean checkCredenziali(String id,String password){
		return this.password.equals(password) && this.id.equals(id);
	}
	
	public TipologiaEsame creaTipologiaEsame(Long codice, String nome,  String descrizione, Double costo){
		TipologiaEsame t= new TipologiaEsame(codice,nome,descrizione,costo);
		return t;
	}

}
