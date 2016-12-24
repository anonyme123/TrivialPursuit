//AUTEUR : Sebastien URBE- Claire DELORME


//DESCRIPTION:
//Creation d un dé utile au déplacement du joueur sur le plateau (nombre généré de maniere aléatoire)


//INFO :
//
//
package model;

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
	
	//Getter
	public int getNbAleatoire() {
		return nbAleatoire;
	}

	@Override // Affichage du nombre aléatoire
	public String toString() {
		return "Vous avez fait :" + nbAleatoire;
	}	
}
