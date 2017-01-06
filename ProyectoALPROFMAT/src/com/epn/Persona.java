package com.epn;



public abstract class Persona {
	
	private String id;
	private String nombre1;
	private String apellido1;
	

	public Persona(String id, String nombre1, String apellido1) {
		this.id = id;
		this.nombre1 = nombre1;
		this.apellido1 = apellido1;
	}


	public Persona() {
	id = "1";
	nombre1 ="Anderson";
	apellido1 = "Revelo";
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	

	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	

	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	
	public abstract String toString();
}

