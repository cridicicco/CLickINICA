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
public class Paziente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private String password;
	@OneToMany
	@JoinColumn(name = "Paziente_id")
	private List<Esame> esamiInProgramma;

	@OneToMany
	@JoinColumn(name = "Paziente_id")
	private List<Esame> esamiPassati;


	public boolean checkPassword(String password){
		return this.password.equals(password);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome=n;
	}
	
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


	public List<Esame> getEsamiInProgramma() {
		return esamiInProgramma;
	}


	public void setEsamiInProgramma(List<Esame> esamiInProgramma) {
		this.esamiInProgramma = esamiInProgramma;
	}


	public List<Esame> getEsamiPassati() {
		return esamiPassati;
	}


	public void setEsamiPassati(List<Esame> esamiPassati) {
		this.esamiPassati = esamiPassati;
	}



}
