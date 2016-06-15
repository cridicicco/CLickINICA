package it.uniroma3.facade;


import it.uniroma3.model.Esame;
import it.uniroma3.model.Prerequisito;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class PrerequisitoFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public Prerequisito createPrerequisito(String nome,String valore) {
		Prerequisito prerequisito = new Prerequisito(nome, valore);
		em.persist(prerequisito);
		return prerequisito;
	}

		
	
	public Prerequisito getPrerequisito(Long id) {
	    Prerequisito prerequisito = em.find(Prerequisito.class, id);
		return prerequisito;
	}
	
	public List<Prerequisito> getAllPrerequisitiTipologia(long id){
		Query q = em.createQuery("SELECT * FROM Prerequisito e WHERE e.tipologia_id="+id);
		List<Prerequisito> lr = q.getResultList();
		return lr;
	}

	public void updatePrerequisito(Prerequisito prerequisito) {
        em.merge(prerequisito);
	}
	
    private void deletePrerequisito(Prerequisito prerequisito) {
        em.remove(prerequisito);
    }

	public void deletePrerequisito(Long id) {
        Prerequisito prerequisito = em.find(Prerequisito.class, id);
        deletePrerequisito(prerequisito);
	}

}
