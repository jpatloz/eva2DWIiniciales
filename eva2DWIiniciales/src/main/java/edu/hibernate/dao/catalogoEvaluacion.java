package edu.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //Indica cual es nuestra entidad
@Table(name="eva_cat_evaluacion", schema="sc_evaluacion") //Con la etiqueta @table se puede indicar la tabla y el esquema
public class catalogoEvaluacion {

	@Id 	//Esta etiqueta indica nuestro primary key definido previamente en la base de datos
	@Column 	//Esta etiqueta indica que es una columna de la base de datos
	public String cod_evaluacion;
	@Column
	public String desc_evaluacion;
	
	//CONSTRUCTORES
	public catalogoEvaluacion(String cod_evaluacion, String desc_evaluacion) {
		super();
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}
	
	public catalogoEvaluacion() {
		super();
	}

	//GETTERS Y SETTERS
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}
	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}
	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}
	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "catalogoEvaluacion [cod_evaluacion=" + cod_evaluacion + ", desc_evaluacion=" + desc_evaluacion + "]";
	}
	
}
