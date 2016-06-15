package it.uniroma3.facade;


import it.uniroma3.model.Esame;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class RisultatoFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public Risultato createRisultato(String nome,String valore) {
		Risultato risultato = new Risultato(nome, valore);
		em.persist(risultato);
		return risultato;
	}

		
	
	public Risultato getRisultato(Long id) {
	    Risultato risultato = em.find(Risultato.class, id);
		return risultato;
	}
	
	public List<Risultato> getAllRisultatiEsame(long id){
		Query q = em.createQuery("SELECT * FROM Risultato e WHERE e.esame="+id);
		List<Risultato> lr = q.getResultList();
		return lr;
	}

	public void updateRisultato(Risultato risultato) {
        em.merge(risultato);
	}
	
    private void deleteRisultato(Risultato risultato) {
        em.remove(risultato);
    }

	public void deleteRisultato(Long id) {
        Risultato utente = em.find(Risultato.class, id);
        deleteRisultato(utente);
	}

}
