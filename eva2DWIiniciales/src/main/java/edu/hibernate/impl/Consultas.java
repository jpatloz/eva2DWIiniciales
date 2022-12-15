package edu.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.hibernate.dao.catalogoEvaluacion;
import edu.hibernate.dao.insertarDatosImpl;
import edu.hibernate.dao.insertarNotasImpl;
import edu.hibernate.dao.notasEvaluacion;

//En esta clase se crean las transacciones a la base de datos

@Component
public class Consultas {
	
	@Autowired //Esta etiqueta nos permite hacer una inyección de dependencia de la clase importada
	private insertarNotasImpl ini;
	
	private insertarDatosImpl idi;
	
	//CONSULTAS PARA LAS NOTAS
	
	@Transactional
	public void insertarNota(notasEvaluacion notas) {
		ini.insertarNotas(notas);
	}
	
	@Transactional
	public void insertarListaNotas(Collection<notasEvaluacion> notasColeccion) {
		for (notasEvaluacion notas: notasColeccion) {
			ini.insertarNotas(notas);
		}
	}
	
	@Transactional
	public List<notasEvaluacion> seleccionarTodasNotas() {
		return ini.seleccionarNotas();
	}
	
	//CONSULTAS PARA LOS DATOS
	
	@Transactional
	public void insertarDato(catalogoEvaluacion datos) {
		idi.insertarDatosEvaluacion(datos);
	}
	
	@Transactional
	public void insertarListaDatos(Collection<catalogoEvaluacion> datosColeccion) {
		for (catalogoEvaluacion datos: datosColeccion) {
			idi.insertarDatosEvaluacion(datos);
		}
	}
	
	@Transactional
	public List<catalogoEvaluacion> seleccionarTodosDatos() {
		return idi.seleccionarDatos();
	}

}
