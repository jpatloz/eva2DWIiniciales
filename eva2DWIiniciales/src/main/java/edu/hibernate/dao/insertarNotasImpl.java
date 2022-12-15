package edu.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class insertarNotasImpl {


	@PersistenceContext
	private EntityManager em;
	
	public void insertarNotas(notasEvaluacion notas) {
		em.persist(notas);
	}
	
	public List<notasEvaluacion> seleccionarNotas() {
		return em.createQuery("SELECT cod_alumno, nota_evaluacion FROM notasEvaluacion notas").getResultList();
	}


}
