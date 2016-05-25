package it.clickinica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Esame {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@OneToOne
	private Paziente paziente;
	@OneToOne
	private Dottore dottore;
	@Temporal(TemporalType.DATE)
	private Date dataPrenotazione;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEsame;
	@OneToOne
	private TipologiaEsame tipologia;
	@Column(nullable=true)
	private String risultati;

	public Esame() {}
	
	public Esame(Long id,TipologiaEsame tipologia, Paziente paziente,Dottore d){
		this.id=id;
		this.paziente=paziente;
		this.tipologia=tipologia;
		this.dottore=d;

	}
	
	public Long getId() {
		return this.id;
		
	}
	
	public void setId(Long a) {
		this.id=a;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome=n;
	}
	
	public String getRisultati() {
		return this.risultati;
	}
	
	public void setRisultati(String r) {
		this.risultati=r;
	}
	
	
	public Paziente getPaziente() {
		return this.paziente;
	}
	
	public void setPaziente(Paziente p) {
		this.paziente=p;
	}
	
	public Dottore getDottore() {
		return this.dottore;
	}
	
	public void setDottore(Dottore d) {
		this.dottore=d;
	}
	
	public TipologiaEsame getTipologiaEsame() {
		return this.tipologia;
	}
	
	public void setTipologiaEsame(TipologiaEsame t) {
		this.tipologia=t;
	}
	
	public Date getDataPrenotazione() {
		return this.dataPrenotazione;
	}
	
	public void SetDataPrenotazione(Date d) {
		this.dataPrenotazione=d;
	}
	
	public Date getDataEsame() {
		return this.dataEsame;
	}
	
	public void SetDataEsame(Date d) {
		this.dataEsame=d;
	}
}
