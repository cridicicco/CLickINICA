package it.uniroma3.facade;


import it.uniroma3.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class UtenteFacade {
	
    @PersistenceContext(unitName = "unit-jee-es2")
    private EntityManager em;
    
	public Utente createUtente(String nome,String cognome, String userName,String password,String email) {
		Utente utente = new Utente(nome, cognome, userName, password,email);
		em.persist(utente);
		return utente;
	}
	
	 public Utente validate (String userName, String password){
			Query q = em.createQuery("SELECT a FROM Utente a WHERE a.userName='"+ userName + "' AND a.password='"+password+"'");
			Utente c = (Utente)q.getSingleResult();
			return c;
		}
		
	
	public Utente getUtente(Long id) {
	    Utente utente = em.find(Utente.class, id);
		return utente;
	}
	
	public List<Utente> getAllUtenti() {
        CriteriaQuery<Utente> cq = em.getCriteriaBuilder().createQuery(Utente.class);
        cq.select(cq.from(Utente.class));
        List<Utente> utenti = em.createQuery(cq).getResultList();
		return utenti;
	}

	public void updateUtente(Utente utente) {
        em.merge(utente);
	}
	
    private void deleteUtente(Utente utente) {
        em.remove(utente);
    }

	public void deleteUtente(Long id) {
        Utente utente = em.find(Utente.class, id);
        deleteUtente(utente);
	}

}