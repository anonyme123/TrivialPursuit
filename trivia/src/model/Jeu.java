package model;

import java.util.List;
////
public class Jeu {
	

	private static int largeur;
	private static int hauteur;
	private List<AbstractCase> listeCases;
	private static int nbreCases;
	private int nbreJoueurs;
	private List<Joueur> listeJoueurs;
	private Joueur joueurActif;
	private int idJoueurActif;
	
	//Constructeur par default 
	public Jeu(int largeur, int hauteur, int nbreCase, List<AbstractCase> listeCases, int nbreJoueurs, List<Joueur> listeJoueurs, Joueur joueurActif)
	{
		this.largeur=largeur;/* a voir si utile */
		this.hauteur=hauteur;
		this.nbreCases=nbreCases; //est-ce que c'est pas toujours le même ?
		this.nbreJoueurs=nbreJoueurs;
		this.joueurActif = joueurActif;
		this.listeJoueurs = listeJoueurs;
		this.idJoueurActif = joueurActif.getNumero();
		this.listeCases = listeCases;
	}	
	
	public 	Joueur afficheJoueurActif (){
		return joueurActif;
	}
	
	public void changeJoueurActif() {
		
		if (idJoueurActif==6){
			idJoueurActif=1;
		}
		else{
			idJoueurActif++;
		}
		
		for (Joueur j : listeJoueurs) {
			if (j.getNumero() == idJoueurActif) {
				joueurActif = j;
			}
		}
	}
	
		/*if(joueurActif == 1)
			joueurActif = 2;
		else if (joueurActif==2)
			joueurActif =3;
		else if (joueurActif)*/

	
	public String afficheVainqueur()
	{
		int camembertRestants = 6-joueurActif.getNb_camembert();
		String s = "";
		for (Joueur j : listeJoueurs) {
			if (j.getNb_camembert() == 6) {
				 s ="Nous avons un Vainqueur " + joueurActif;
			}
			else{
				s="Vous n'avez pas encore gagné, plus que "+ camembertRestants+" camemberts :) \n";
			}
		}
		return s;
	}
	
	public static int getLargeur() {
		return largeur;
	}

	public static void setLargeur(int largeur) {
		Jeu.largeur = largeur;
	}

	public static int getHauteur() {
		return hauteur;
	}

	public static void setHauteur(int hauteur) {
		Jeu.hauteur = hauteur;
	}

	public static int getNbreCases() {
		return nbreCases;
	}

	public static void setNbreCases(int nbreCases) {
		Jeu.nbreCases = nbreCases;
	}

	public int getNbreJoueurs() {
		return nbreJoueurs;
	}

	public void setNbreJoueurs(int nbreJoueurs) {
		this.nbreJoueurs = nbreJoueurs;
	}
	
	public int lancerJeu()
	{
		int i = 0;
		return i;
	}

	public List<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}

	public void setListeJoueurs(List<Joueur> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}

	public Joueur getJoueurActif() {
		return joueurActif;
	}

	public void setJoueurActif(Joueur joueurActif) {
		this.joueurActif = joueurActif;
	}

}
