package com.epn;

public class Profesor  extends Persona  {
	
	
	public Profesor() {
	
		
	}

	public Profesor(String id, String nombre1, String apellido1) {
		
		super(id, nombre1, apellido1);
		
	}

	public String toString() {
		
		return "\n[Profesor]" + this.getId()+" , "+ this.getNombre1()+"  "+ this.getApellido1()+"\n";
	

	}
	
	
}




