package edu.hibernate.dao;

import java.util.List;
import javax.persistence.EntityManagerFactory;

public interface insertarNotasEvaluacion {

	//Métodos que insertan datos en la base de datos.
	public void insertarNotas(notasEvaluacion notas);
	
	public void insertarDatosEvaluacion(catalogoEvaluacion datosEva);
	
	//Métodos que seleccionan los campos específicos de la tabla

	public List<notasEvaluacion> seleccionarNotas();
	
	public List<notasEvaluacion> seleccionarDatos();

}
