package mainpackage;

public abstract class AbstractCase {
	
	//Dimensions fixes pour chaque case
	public int largeur = 10;
	public int hauteur = 10;
	public boolean isCamembert=false;
	boolean selected = false; //par defaut une case n'est pas selecitonné, seul un joueur avec choisirCaseDest passe a true
	public Couleur couleur;
	public int posX;
	public int posY;
	
	
	

}
