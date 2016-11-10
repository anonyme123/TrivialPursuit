package mainpackage;

public class Jeu {
	
	private static final String NULL = null;
	private static int largeur;
	private static int hauteur;
	private static int nbreCases;
	private int nbreJoueurs;
	
	//Constructeur par default 
	public Jeu(int largeur, int hauteur, int nbreCase, int nbreJoueurs)
	{
		this.largeur=largeur;
		this.hauteur=hauteur;
		this.nbreCases=nbreCases; //est-ce que c'est pas toujours le même ?
		this.nbreJoueurs=nbreJoueurs;
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
	
	public String afficheVainqueur(Joueur joueur)
	{
		String nomjoueur =NULL;
		return nomjoueur;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
