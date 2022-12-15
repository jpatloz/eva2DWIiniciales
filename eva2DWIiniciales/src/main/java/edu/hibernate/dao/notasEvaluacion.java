package edu.hibernate.dao;

/**
 * DAO para la entidad eva_tch_notas_evaluacion
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//ATRIBUTOS

@Entity //Indica cual es nuestra entidad
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion") //Con la etiqueta @table se puede indicar la tabla y el esquema
public class notasEvaluacion {
	@Column
	public String md_uuid;
	@Column
	public String md_fch;
	@Id		//Esta etiqueta indica nuestro primary key definido previamente en la base de datos
	@Column 	//Esta etiqueta indica que es una columna de la base de datos
	public int id_nota_evaluacion;
	@Column
	public String cod_alumno;
	@Column
	public int nota_evaluacion;
	@Column
	public String cod_evaluacion;
	
	//CONSTRUCTORES
	public notasEvaluacion(String md_uuid, String md_fch, int id_nota_evaluacion, String cod_alumno,
			int nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}

	//GETTERS Y SETTERS
	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public String getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(String md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getNota_evaluacion() {
		return nota_evaluacion;
	}

	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	//TO STRING
	@Override
	public String toString() {
		return "notasEvaluacion [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_nota_evaluacion="
				+ id_nota_evaluacion + ", cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion
				+ ", cod_evaluacion=" + cod_evaluacion + "]";
	}
	
}
