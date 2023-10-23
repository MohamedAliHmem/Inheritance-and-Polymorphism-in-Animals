package iset.dsi2.animalerie;

public class TestHeritage {

	public static void main(String[] args) {
		Animal[] an = new Animal[3];
		an[0]= new Animal() ;
		an[1]=new Chat() ;
		an[2]= new Chien() ;
		for(int i=0;i<3;i++) {
			an[i].decrisToi();
			an[i].manger();
			an[i].boire();
			an[i].crier();
			
			if(an[i] instanceof Animal) {
				System.out.println("L’espèce de cet animal est inconnue");
			}
		}

	}

}