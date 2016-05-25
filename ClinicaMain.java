package it.clickinica.model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ClinicaMain {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		TipologiaEsame t= new TipologiaEsame((long)2, "analisi", "blablabla", 24.5);
    	
    	
    	EntityTransaction tx = em.getTransaction();
    	 tx.begin();
         
   
    	 em.merge(t);
         
         
         tx.commit();
         em.close();
 		emf.close();

}
}
