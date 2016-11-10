package mainpackage;

import java.util.Random;

public class De {
	
	int nbAleatoire;
	
	//Constructeur du Dé
	public De(){
		
	
		
	}
	
	//Génération du nombre aléatoire du dé
	public int lancer(){
		Random rand = new Random();
		nbAleatoire = rand.nextInt(6)+1;
		
		return nbAleatoire;	
	}
	
	//Getters et Setters

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
