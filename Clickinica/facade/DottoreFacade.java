package it.uniroma3.facade;


import it.uniroma3.model.Dottore;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class DottoreFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public Dottore createDottore(String nome,String cognome,String specializzazione) {
		Dottore dottore = new Dottore(nome, cognome,specializzazione);
		em.persist(dottore);
		return dottore;
	}
	

	public Dottore getDottore(Long id) {
	    Dottore dottore = em.find(Dottore.class, id);
		return dottore;
	}
	
	public List<Dottore> getAllDottori() {
        CriteriaQuery<Dottore> cq = em.getCriteriaBuilder().createQuery(Dottore.class);
        cq.select(cq.from(Dottore.class));
        List<Dottore> dottori = em.createQuery(cq).getResultList();
		return dottori;
	}

	public void updateDottore(Dottore dottore) {
        em.merge(dottore);
	}
	
    private void deleteDottore(Dottore dottore) {
        em.remove(dottore);
    }

	public void deleteDottore(Long id) {
        Dottore dottore = em.find(Dottore.class, id);
        deleteDottore(dottore);
	}

}