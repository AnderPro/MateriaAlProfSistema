package com.epn;



public class Sistema {
	
	
	private Materia[] materias;

	public Sistema(Materia[] materias) {
	super();
	this.materias = materias;
	}

	public Sistema() {
	super();
	this.materias= new Materia[]{new Materia(),new Materia()};
	}	

	public Materia[] getMaterias() {
	return materias;
	}

	public void setMaterias(Materia[] materias) {
	this.materias = materias;
	}


	public String materiaPorProfesor(String idProf){
	
		String matProf="";
		
		
		for(int i=0;i<this.materias.length;i++){
			
			if(materias[i].buscarProfesor(idProf)==true){
				
				matProf+= materias[i].toString()+"\n";
				
			}
		}
		if(matProf==""){
		
			return   idProf+ " no existen en la lista de profesores";
		}else{
			
			return "Las materias del profesor "  +" " +idProf+   " son las siguientes:\n"+matProf;
			}
		}



}

