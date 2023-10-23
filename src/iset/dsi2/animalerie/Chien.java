package iset.dsi2.animalerie;

public class Chien extends Animal{
	String race ;
	
	Chien(){
		
	}
	
	Chien(String race, String c,int p){
		super(c,p);
		this.race = race ;
	}

}
