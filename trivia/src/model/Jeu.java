
package model;

import java.util.List;
import java.util.Map;
/**
 * Peut changer le Joueur Actif, Afficher le vainqueur si quelqu'un a 6 camembert, et pose une question à un joueur
 * @author Sébastien
 *
 */
public class Jeu {
	

	private static int largeur;
	private static int hauteur;
	private List<AbstractCase> listeCases; //TODO remplacer par une map
	private Map<Coord,AbstractCase> mapCases;
	private static int nbreCases;
	private int nbreJoueurs;
	private List<Joueur> listeJoueurs;
	private Joueur joueurActif;
	private int idJoueurActif;
	
	//Constructeur par default 
	
	
	public Jeu(int largeur, int hauteur, int nbreCase, Map<Coord,AbstractCase> mapCases, int nbreJoueurs, List<Joueur> listeJoueurs, Joueur joueurActif) {
		this.largeur=largeur;/* a voir si utile */
		this.hauteur=hauteur;
		this.nbreCases=nbreCases; //est-ce que c'est pas toujours le même ?
		this.nbreJoueurs=nbreJoueurs;
		this.joueurActif = joueurActif;
		this.listeJoueurs = listeJoueurs;
		this.idJoueurActif = joueurActif.getNumero();
		this.listeCases = listeCases;
		this.mapCases = mapCases;
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
				s="Vous n'avez pas encore gagne, plus que "+ camembertRestants+" camemberts :) \n";
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
	
//Recupere la couleur de la Case pour renvoyer la bonne question
public Question poseQuestion(Coord coord){
		Question question = null;
		AbstractCase laCase = mapCases.get(coord);
		if (laCase != null) {
			Couleur couleur = laCase.couleur;
			question = new Question(couleur);
		}
		
		return question;
}

	public Question poseQuestion(int i, int j) {
	
		return poseQuestion(new Coord(i,j));
	}
	
	//Repond � la question et attribut un camembert si case CaseCamembert
	public void repondreQuestion(Joueur joueurActif, Question q, Coord coord,int reponse){
		AbstractCase laCase = mapCases.get(coord);
		if(laCase.isCamembert==false)
		{
			joueurActif.repondreQuestion(q, reponse);
		}
		else
		{
			joueurActif.repondreQuestionCam(q, reponse);
		}
	}



	public static Coord conversion(int nbreCase){
		Coord coord=new Coord(0,0);
		
		if(nbreCase<=7)
		{
			//1er ligne 
			coord.y=6;
			coord.x=(nbreCase-1);
		}
		
		if(nbreCase>7&&nbreCase<=14)
		{
			//2eme ligne 
			coord.y=5;
			coord.x=((nbreCase-7)-1);
		}
		
		if(nbreCase>14&&nbreCase<=21)
		{
			//3eme ligne 
			coord.y=4;
			coord.x=((nbreCase-7*2)-1);
		}
		
		if(nbreCase>21&&nbreCase<=28)
		{
			//4eme ligne 
			coord.y=3;
			coord.x=((nbreCase-7*3)-1);
		}
		
		if(nbreCase>28&&nbreCase<=35)
		{
			//5eme ligne 
			coord.y=2;
			coord.x=((nbreCase-7*4)-1);
		}
		
		if(nbreCase>35&&nbreCase<=42)
		{
			//6eme ligne 
			coord.y=1;
			coord.x=((nbreCase-7*5)-1);
		}
		
		if(nbreCase>42&&nbreCase<=49)
		{
			//7eme ligne 
			coord.y=0;
			coord.x=((nbreCase-7*6)-1);
		}
		return coord;//BLAblab
	}
}

