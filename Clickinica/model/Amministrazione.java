package it.uniroma3.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

		@Entity
	@NamedQuery(name = "findAllAmministrazioni", query = "SELECT a FROM Amministrazione a")
	public class Amministrazione {
        
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;

	
	
	public Amministrazione() {
    }
	

	public Amministrazione(String name, String password) {
        this.name = name;
        this.password=password;
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
    
   public String getPassword(){
	   return this.password;
   }
   
   public void setPassword(String password){
	   this.password=password;
   }
	public void setId(Long id) {
		this.id = id;
	}
	

}
