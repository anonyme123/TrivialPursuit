package Object;

import java.util.Random;

public class De {
	int nbAleatoire;
	
	//Constructeur du De
	public De(){
		
	}
	
	//Generation du nombre aleatoire du de
	public int lancer(){
		Random rand = new Random();
		nbAleatoire = rand.nextInt(6)+1;
		return nbAleatoire;	
	}
	
	//Getters et Setters
	public int getNbAleatoire() {
		return nbAleatoire;
	}

	@Override // Affichage du nombre aléatoire
	public String toString() {
		return "Vous avez fait :" + nbAleatoire;
	}	
}
