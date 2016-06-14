package it.uniroma3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

		@Entity
	@NamedQuery(name = "findAllTipologie", query = "SELECT t FROM TipologiaEsame t")
	public class TipologiaEsame {
        
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable=false)
	private Float price;
	
	@ManyToMany(mappedBy= "tipologieEsami")
	private List<Prerequisito> prerequisiti;
	

     @ManyToMany(mappedBy="tipologie")
	private List<Indicatore> indicatori;


	


	
	public TipologiaEsame() {
    }
	
    public List<Prerequisito> getPrerequisiti() {
		return this.prerequisiti;
	}
	
	public void setPrerequisiti(List<Prerequisito> e) {
		this.prerequisiti=e;
	}
	
    public List<Indicatore> getIndicatori() {
		return this.indicatori;
	}
	
	public void setIndicatori(List<Indicatore> e) {
		this.indicatori=e;
	}
	

	public TipologiaEsame(Long id,String name, Float price) {
       this.id=id;
		this.name = name;
        this.price = price;
        
        
}

    //          Getters & Setters        
    
   public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
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
	
    public boolean equals(Object obj) {
        TipologiaEsame t = (TipologiaEsame)obj;
        return this.getId().equals(t.getId());
    }

    public int hashCode() {
         return this.id.hashCode();
    }

	public void setId(Long id) {
		this.id = id;
	}
	

}
