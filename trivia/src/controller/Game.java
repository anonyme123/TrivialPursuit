package controller;

import java.util.ArrayList;
import java.util.List;

import model.De;
import model.Jeu;
import model.*;

public class Game {

	private Jeu jeu;
	private De de;
	
	public void init(){ //Initialisation du jeu
		//Création des 6 joueurs
		Joueur j1 = new Joueur("URBE",1,new Pion("Bleue",1,new Coord(0,0)));
		Joueur j2 = new Joueur("TALBOT",2,new Pion("Rougz",1,new Coord(0,3)));
		Joueur j3 = new Joueur("VENIN",3,new Pion("Vert",1,new Coord(0,5)));
		Joueur j4 = new Joueur("DELORME",4,new Pion("Jaune",1,new Coord(5,0)));
		Joueur j5 = new Joueur("FAURIE",5,new Pion("Orange",1,new Coord(4,0)));
		Joueur j6 = new Joueur("GASCOIN",6,new Pion("Violet",1,new Coord(2,0)));
		//Création de la liste de joueur et ajout des joueurs
		List<Joueur> listeJoueurs = new ArrayList<Joueur>();
		listeJoueurs.add(j1);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
		
		//Création Case
		CaseNormale case1 = new CaseNormale(Couleur.BLEU,1,1);
		CaseNormale case2 = new CaseNormale(Couleur.VERTE,2,2);
		CaseNormale case3 = new CaseNormale(Couleur.ROUGE,1,1);
		//Création list et ajout des cases
		List<AbstractCase> listeCases = new ArrayList<AbstractCase>();
		//Création du De
		
		
		
		//Création du Jeu
		jeu = new Jeu(4,4,3,listeCases,6,listeJoueurs,j1);
		
	}
	
	public void lancerJeu(){
		if (jeu !=  null) {
			jeu.getJoueurActif();
			de.lancer();
			
			
		}
	}
	
}
