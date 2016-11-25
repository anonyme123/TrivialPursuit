package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.AbstractCase;
import model.CaseBonus;
import model.CaseCam;
import model.CaseNormale;
import model.Coord;
import model.Couleur;
import model.Joueur;
import model.Pion;

public class Game {

	private Jeu jeu;
	private De de;
	
	
	//------------------Initialisation du jeu------------------//
	public void init(){ 
	
		//-----Création des 6 joueurs-----//
		Joueur j1 = new Joueur("URBE",1,new Pion("Bleue",1,new Coord(0,0)));
		Joueur j2 = new Joueur("TALBOT",2,new Pion("Rougz",1,new Coord(0,3)));
		Joueur j3 = new Joueur("VENIN",3,new Pion("Vert",1,new Coord(0,5)));
		Joueur j4 = new Joueur("DELORME",4,new Pion("Jaune",1,new Coord(5,0)));
		Joueur j5 = new Joueur("FAURIE",5,new Pion("Orange",1,new Coord(4,0)));
		Joueur j6 = new Joueur("GASCOIN",6,new Pion("Violet",1,new Coord(2,0)));
		
		//-----Création de la liste de joueur et ajout des joueurs-----//
		List<Joueur> listeJoueurs = new ArrayList<Joueur>();
		listeJoueurs.add(j1);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
		
		//-----DEBUT CREATION CASES-----//
		
		//Tableau des coordonnees de toutes les cases sauf camemberts et bonus // A REVERIFIER
		 int[][] in = { 
	          		{0,1,1},{0,2,3},
	          		{1,0,2},{1,3,2},{1,6,2},
	          		{2,0,5},{2,3,2},{2,6,0},
	          		{3,0,3},{3,1,4},{3,2,5},{3,4,0},{3,5,2},{3,6,1},
	          		{4,0,1},{4,3,4},{4,6,3},
	          		{5,0,0},{5,3,5},{5,6,5},
	          		{6,1,4},{6,2,5},{6,4,1},{6,5,0}	
	          };
		//Affichage longueur du tableau
		System.out.println(in.length); 
	          
	        
	     //-----Creation des CASES NORMALES-----//
		 Map<Coord,AbstractCase> cases = new HashMap<>();
	     	for (int x = 0 ; x <= 23 ; x++){
	          	cases.put(
	          			new Coord(in[x][0], in[x][1]), 
	          			new CaseNormale(
	          					Couleur.getCouleur(in[x][2]),	// couleur 
	          							in[x][0], 				// x		
	          							in[x][1]				// y
	          							)
	          	);
	          }
	     	
	     //-----Creation CASES CAMEMBERT + BONUS-----//
	      cases.put(new Coord(0,0), new CaseCam(Couleur.ROUGE, 0, 0)); 
	      cases.put(new Coord(0,3), new CaseCam(Couleur.BLEU, 0, 3));
	      cases.put(new Coord(0,6), new CaseCam(Couleur.JAUNE, 0, 6));
	      cases.put(new Coord(6,0), new CaseCam(Couleur.ORANGE, 6, 0));
	      cases.put(new Coord(6,3), new CaseCam(Couleur.VIOLET, 6, 3));
	      cases.put(new Coord(6,6), new CaseCam(Couleur.VERTE, 6, 6));
	      cases.put(new Coord(3,3), new CaseBonus(Couleur.NOIR, 3, 3)); //CASE BONUS
	      
	      System.out.println(" \n Affichage de toutes les cases : \n");
		 
		//----- FIN CREATION CASES -----//
		
		
		
		
	
		//-----Création du De-----//
		
		
		//-----Création du Jeu-----//
		//jeu = new Jeu(4,4,3,listeCases,6,listeJoueurs,j1);
		
	}


	private void creationCases() {
		// TODO Auto-generated method stub
		
	}
	
	/*public void lancerJeu(){
		if (jeu !=  null) {
			jeu.getJoueurActif();
			de.lancer();	
		}		
	}*/
	
}
