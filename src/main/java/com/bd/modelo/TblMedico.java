package com.bd.modelo;

import java.sql.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_medicot3")
public class TblMedico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmedico;
	private String nombre;
	private String apellido;
	private String email;
	private double dni;
	private String estadocivil;
	@Temporal (TemporalType.DATE)
	@DateTimeFormat (iso=ISO.DATE)
	private Date fechanaci;
	
	
	public TblMedico() {
	} 


	public TblMedico(int idmedico, String nombre, String apellido, String email, double dni, String estadocivil, Date fechanaci) {
		this.idmedico = idmedico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.estadocivil = estadocivil;
		this.fechanaci = fechanaci;
	} 

	
	public int getIdmedico() {
		return idmedico;
	}
	public void setIdmedico(int idmedico) {
		this.idmedico = idmedico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getDni() {
		return dni;
	}
	public void setDni(double dni) {
		this.dni = dni;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public Date getFechanaci() {
		return fechanaci;
	}
	public void setFechanaci(Date fechanaci) {
		this.fechanaci = fechanaci;
	}
	
}
