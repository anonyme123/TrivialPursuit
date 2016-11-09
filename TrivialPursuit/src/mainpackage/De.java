package mainpackage;

import java.util.Random;

public class De {
	
	int nbAleatoire;
	
	public De(){
		
	
		
	}
	
	public int lancer(){
		Random rand = new Random();
		nbAleatoire = rand.nextInt(6)+1;
		
		return nbAleatoire;	
	}

	public int getNbAleatoire() {
		return nbAleatoire;
	}

	public void setNbAleatoire(int nbAleatoire) {
		this.nbAleatoire = nbAleatoire;
	}

	@Override
	public String toString() {
		return "Vous avez fait " + nbAleatoire;
	}
	
	
	

}
