package it.uniroma3.facade;

import java.util.Date;






import java.util.List;

import it.uniroma3.model.Dottore;
import it.uniroma3.model.Esame;


import it.uniroma3.model.TipologiaEsame;
import it.uniroma3.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EsameFacade {
	
	@PersistenceContext(unitName = "unit-jee-es2")
	private EntityManager em;
	
	public Esame createEsame(long tipologia_id,long dottore_id,long paziente_id, Date data) {
		Dottore dottore= (Dottore)em.createQuery("SELECT * FROM dottore d WHERE d.id="+dottore_id).getSingleResult();
		Utente paziente= (Utente)em.createQuery("SELECT * FROM utente u WHERE u.id="+paziente_id).getSingleResult();
		TipologiaEsame tipologia= (TipologiaEsame)em.createQuery("SELECT * FROM tipologiaEsame t WHERE t.id="+tipologia_id).getSingleResult();
		
		Esame esame= new Esame(tipologia,paziente,dottore,data);
		em.persist(esame);
		return esame;
	}
	
	public Esame getEsame(Long id) {
		Esame esame= em.find(Esame.class, id);
		return esame;
	}
	

	public List<Esame> getAllEsamiUtente(long id){
		Query q = em.createQuery("SELECT * FROM Esame e WHERE e.paziente="+id);
		List<Esame> le = q.getResultList();
		return le;
	}
	
	public List<Esame> getAllEsamiDottore(long id){
		Query q = em.createQuery("SELECT * FROM Esame e WHERE e.dottore="+id);
		List<Esame> le = q.getResultList();
		return le;
	}
}
