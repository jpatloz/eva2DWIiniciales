package edu.hibernate.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import edu.hibernate.dao.catalogoEvaluacion;
import edu.hibernate.dao.insertarNotasEvaluacion;
import edu.hibernate.dao.notasEvaluacion;
import edu.hibernate.impl.Consultas;

@Controller	//Esta etiqueta registra cual es el controlador de nuestro MVC
public class Controlador {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//CONSULTA PARA LAS NOTAS
		consulta.insertarNota(new notasEvaluacion("23ed","", 1, "23ed", 9, "PR"));
		System.out.println("Información de las notas: " + consulta.seleccionarTodasNotas());
		
		//CONSULTA PARA LODS DATOS
		consulta.insertarDato(new catalogoEvaluacion("23re", "Primera evaluación"));
		System.out.println("Datos de la evaluación: " + consulta.seleccionarTodosDatos());
	    
	}

}
