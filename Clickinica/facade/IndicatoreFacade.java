package it.uniroma3.facade;


import it.uniroma3.model.Esame;
import it.uniroma3.model.Indicatore;
import it.uniroma3.model.Risultato;
import it.uniroma3.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class IndicatoreFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public Indicatore createIndicatore(String nome) {
		Indicatore risultato = new Indicatore(nome);
		em.persist(risultato);
		return risultato;
	}

		
	
	public Indicatore getIndicatore(Long id) {
		Indicatore risultato = em.find(Indicatore.class, id);
		return risultato;
	}
	
	public List<Indicatore> getAllIndicatoriTipologia(long id){
		Query q = em.createQuery("SELECT * FROM Indicatore e WHERE e.tipologieEsami_id="+id);
		List<Indicatore> lr = q.getResultList();
		return lr;
	}

	public void updateIndicatore(Indicatore indicatore) {
        em.merge(indicatore);
	}
	
    private void deleteIndicatore(Indicatore indicatore) {
        em.remove(indicatore);
    }

	public void deleteIndicatore(Long id) {
		Indicatore utente = em.find(Indicatore.class, id);
        deleteIndicatore(utente);
	}

}
