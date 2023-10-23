package iset.dsi2.animalerie;

public class Chat extends Animal{
	boolean sauvage ;
	
	Chat(){
		
	}
	
	Chat(boolean sauvage, String c,int p){
		super(c,p);
		this.sauvage = sauvage ;
	}

}
