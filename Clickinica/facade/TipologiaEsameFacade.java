package it.uniroma3.facade;

import it.uniroma3.model.Product;
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
/*
	
		
	    private EntityManager entityManager;
	    private EntityManagerFactory emf;

		public ProductFacade()  {
			emf = Persistence.createEntityManagerFactory("product-unit");
			entityManager = emf.createEntityManager();
		}

		public Product createProduct(String name, String code, Float price, String description) {
			Product product = new Product(name, price, description, code);
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(product);
			tx.commit();
			entityManager.close();
			emf.close();
			return product;
		}
		
		public Product getProduct(Long id) {
		    Product product = entityManager.find(Product.class, id);
			entityManager.close();
			emf.close();
			return product;
		}
		
		public List<Product> getAllProducts() {
	        CriteriaQuery<Product> cq = entityManager.getCriteriaBuilder().createQuery(Product.class);
	        cq.select(cq.from(Product.class));
	        List<Product> products = entityManager.createQuery(cq).getResultList();
			entityManager.close();
			emf.close();
			return products;
		}

		public void updateProduct(Product product) {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
	        entityManager.merge(product);
			tx.commit();
			entityManager.close();
			emf.close();	}
		
	    private void deleteProduct(Product product) {
	        entityManager.remove(product);
	    }

		public void deleteProduct(Long id) {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
	        Product product = entityManager.find(Product.class, id);
	        deleteProduct(product);
			tx.commit();
			entityManager.close();
			emf.close();	
		}
*/
}
