package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JLabel;

import model.AbstractCase;
import model.CaseBonus;
import model.CaseCam;
import model.CaseNormale;
import model.Coord;
import model.Couleur;
import model.De;
import model.Joueur;
import model.Pion;
import model.Jeu;

public class Game {

	private static Jeu jeu;
	private De de;
	
	
	//-----Création de la liste de joueur-----//
	private static List<Joueur> listeJoueurs = new ArrayList<Joueur>();
	
	public static List<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}

	//------------------Initialisation du jeu------------------//
	public static void initJoueurs(String joueur1, String joueur2, String joueur3, String joueur4, String joueur5, String joueur6){ 
	
		
				
		if(!joueur1.trim().isEmpty() && !joueur1.equals("Joueur 1")) {
			Joueur j1 = new Joueur(joueur1,1,new Pion("Bleu",1,new Coord(3,3)));
			listeJoueurs.add(j1);
			// TODO Auto-generated method stub
			
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
			//System.out.println(in.length); 
		          
		        
		     //-----Creation des CASES NORMALES-----//
			 Map<Coord,AbstractCase> cases = new HashMap<>();
		     	for (int x = 0 ; x <= 23 ; x++){
		          	cases.put(
		          			new Coord(in[x][0], in[x][1]), 
		          			new CaseNormale(Couleur.getCouleur(in[x][2]),in[x][0],in[x][1])); //couleur,x,y
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
		  	//-----Création du Jeu-----//
			 jeu = new Jeu(4,4,3,cases,6,listeJoueurs,j1);
		}
		if(!joueur2.trim().isEmpty() && !joueur2.equals("Joueur 2")) {
			Joueur j2 = new Joueur(joueur2,2,new Pion("Rouge",1,new Coord(3,3)));
			listeJoueurs.add(j2);
		}
		if(!joueur3.trim().isEmpty() && !joueur3.equals("Joueur 3")) {
			Joueur j3 = new Joueur(joueur3,3,new Pion("Vert",1,new Coord(3,3)));
			listeJoueurs.add(j3);
		}
		if(!joueur4.trim().isEmpty() && !joueur4.equals("Joueur 4")) {
			Joueur j4 = new Joueur(joueur4,4,new Pion("Jaune",1,new Coord(3,3)));
			listeJoueurs.add(j4);
		}
		if(!joueur5.trim().isEmpty() && !joueur5.equals("Joueur 5")) {
			Joueur j5 = new Joueur(joueur5,5,new Pion("Orange",1,new Coord(3,3)));
			listeJoueurs.add(j5);
		}
		if(!joueur6.trim().isEmpty() && !joueur6.equals("Joueur 6")) {
			Joueur j6 = new Joueur(joueur6,6,new Pion("Violet",1,new Coord(3,3)));
			listeJoueurs.add(j6);
		}

		System.out.println(listeJoueurs);
		
		
	
	}
	
	//Lance le De
	public static int De(){
		 System.out.println(jeu.getJoueurActif().lancerDe());
		return jeu.getJoueurActif().lancerDe();
		
	}
	
	//Il faut les créer avant elles sont crées dans la création des joueurs, peut être à supprimer je pense
	private void creationCases() {
		
	}
	
	public void init(){ 
		 //------ DECLARATION DES VOISINS DE CHAQUE CASE ------ //
		 Set <Coord> setMod = new HashSet<>();
		 Map<Coord,Set<Coord>> modele = new HashMap<>();
		 setMod.add(new Coord(0, 1));
		 setMod.add(new Coord(1, 0));
		 modele.put(new Coord(0,0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 0));
		 setMod.add(new Coord(0, 2));
		 modele.put(new Coord(0,1), setMod);
		 setMod.clear();
				 						
		 setMod.add(new Coord(0, 1));
		 setMod.add(new Coord(0, 3));
		 modele.put(new Coord(0,2), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 2));
		 setMod.add(new Coord(0, 4));
		 setMod.add(new Coord(1, 3));
		 modele.put(new Coord(0,3), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 3));
		 setMod.add(new Coord(0, 5));
		 modele.put(new Coord(0,4), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 4));
		 setMod.add(new Coord(0, 6));
		 modele.put(new Coord(0,5), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 5));
		 setMod.add(new Coord(1, 6));
		 modele.put(new Coord(0,6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 6));
		 setMod.add(new Coord(2, 6));
		 modele.put(new Coord(1,6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(1, 6));
		 setMod.add(new Coord(3, 6));
		 modele.put(new Coord(2,6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(2, 6));
		 setMod.add(new Coord(4, 6));
		 setMod.add(new Coord(3, 5));
		 modele.put(new Coord(3,6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(3, 6));
		 setMod.add(new Coord(5, 6));
		 modele.put(new Coord(4, 6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(4, 6));
		 setMod.add(new Coord(6, 6));
		 modele.put(new Coord(5,6), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(5, 6));
		 setMod.add(new Coord(6, 5));
		 modele.put(new Coord(6, 6), setMod);
		 setMod.clear();
				 	
		 setMod.add(new Coord(6, 6));
		 setMod.add(new Coord(6, 4));
		 modele.put(new Coord(6, 5), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(6, 5));
		 setMod.add(new Coord(6, 3));
		 modele.put(new Coord(6, 4), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(6, 4));
		 setMod.add(new Coord(5, 3));
		 setMod.add(new Coord(6, 2));
		 modele.put(new Coord(6, 3), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(6, 3));
		 setMod.add(new Coord(6, 1));
		 modele.put(new Coord(6,2), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(6, 2));
		 setMod.add(new Coord(6, 0));
		 modele.put(new Coord(6, 1), setMod);
		 setMod.clear();
				 	
		 setMod.add(new Coord(6, 1));
		 setMod.add(new Coord(5, 0));
		 modele.put(new Coord(6, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(6, 0));
		 setMod.add(new Coord(4, 0));
		 modele.put(new Coord(5, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(3, 0));
		 setMod.add(new Coord(5, 0));
		 modele.put(new Coord(4, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(2, 0));
		 setMod.add(new Coord(4, 0));
		 setMod.add(new Coord(3, 1));
		 modele.put(new Coord(3, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(1, 0));
		 setMod.add(new Coord(3, 0));
		 modele.put(new Coord(2, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 0));
		 setMod.add(new Coord(2, 0));
		 modele.put(new Coord(1, 0), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(0, 3));
		 setMod.add(new Coord(2, 3));
		 modele.put(new Coord(1, 3), setMod);
		 setMod.clear();
		 
		 setMod.add(new Coord(1, 3));
		 setMod.add(new Coord(3, 3));
		 modele.put(new Coord(2, 3), setMod);
		 setMod.clear();	
		 
		 setMod.add(new Coord(3, 3));
		 setMod.add(new Coord(5, 3));
		 modele.put(new Coord(4, 3), setMod);
		 setMod.clear();	 
		 
		 setMod.add(new Coord(4, 3));
		 setMod.add(new Coord(6, 3));
		 modele.put(new Coord(5, 3), setMod);
		 setMod.clear();	
		
		 setMod.add(new Coord(3, 6));
		 setMod.add(new Coord(3, 4));
		 modele.put(new Coord(3, 5), setMod);
		 setMod.clear(); 
		 
		 setMod.add(new Coord(3, 3));
		 setMod.add(new Coord(3, 5));
		 modele.put(new Coord(3, 4), setMod);
		 setMod.clear(); 
		 
		 setMod.add(new Coord(3, 1));
		 setMod.add(new Coord(3, 3));
		 modele.put(new Coord(3, 2), setMod);
		 setMod.clear(); 
		 
		 setMod.add(new Coord(3, 0));
		 setMod.add(new Coord(3, 2));
		 modele.put(new Coord(3, 1), setMod);
		 setMod.clear(); 
		 
		 setMod.add(new Coord(3, 4));
		 setMod.add(new Coord(3, 2));
		 setMod.add(new Coord(2, 3));
		 setMod.add(new Coord(4, 3));
		 modele.put(new Coord(3, 3), setMod);
		 setMod.clear();
		 
		 Pion monPion = new Pion("ROUGE", 1, new Coord(0,4));
		 monPion.setModele(modele); // --> pour envoyer la map à la classe Pion
	}

		
	
	
	/*public void lancerJeu(){
		if (jeu !=  null) {
			jeu.getJoueurActif();
			de.lancer();	
		}		
	}*/
	
}