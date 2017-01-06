package com.epn;



public class Alumno  extends Persona  {
	private int edad;

	
	public Alumno(String id, String nombre1, String apellido1, int edad) {
		super(id, nombre1, apellido1);
		this.edad = edad;
	}



	public Alumno() {
		super();
		edad=14;
	}
	

	public String getNombre1() {
		return super.getNombre1().substring(0,1 );
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String toString() {
		return this.getNombre1()+","+ this.getApellido1()+","+edad;
	
	}
}
	
