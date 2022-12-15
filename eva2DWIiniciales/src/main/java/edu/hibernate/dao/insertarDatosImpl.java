package edu.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class insertarDatosImpl {
	@PersistenceContext
	private EntityManager em;

	public void insertarDatosEvaluacion(catalogoEvaluacion datosEva) {
		em.persist(datosEva);
	}
	
	public List<catalogoEvaluacion> seleccionarDatos(){
		return em.createQuery("SELECT desc_evaluacion FROM catalogoEvaluacion datos").getResultList();
	}
}
