package it.uniroma3.facade;


import it.uniroma3.model.TipologiaEsame;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class TipologiaEsameFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public TipologiaEsame createTipologiaEsame(String name, String code, Float price, String description) {
		TipologiaEsame tipologia = new TipologiaEsame(name, price, description, code);
		em.persist(tipologia);
		return tipologia;
	}
	
	public TipologiaEsame getTipologiaEsame(Long id) {
	    TipologiaEsame product = em.find(TipologiaEsame.class, id);
		return product;
	}
	
	public List<TipologiaEsame> getAllTipologieEsami() {
        CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
        cq.select(cq.from(TipologiaEsame.class));
        List<TipologiaEsame> tipologie = em.createQuery(cq).getResultList();
		return tipologie;
	}

	public void updateTipologiaEsame(TipologiaEsame product) {
        em.merge(product);
	}
	
    private void deleteTipologiaEsame(TipologiaEsame product) {
        em.remove(product);
    }

	public void deleteTipologiaEsame(Long id) {
        TipologiaEsame tipologia = em.find(TipologiaEsame.class, id);
        deleteTipologiaEsame(tipologia);
	}
}