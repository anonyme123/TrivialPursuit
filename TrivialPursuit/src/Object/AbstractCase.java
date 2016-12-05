package Object;

public abstract class AbstractCase {
	
	
	public int largeur = 100;//Dimensions fixes en 
	public int hauteur = 100;// pixels pour chaque case
	public boolean isCamembert=false; //Par defaut une case n'a pas de camembert
	boolean isSelected = false; //par defaut une case n'est pas selectionee, seul un joueur avec choisirCaseDest passe a true
	
	public Couleur couleur;//couleur liee a une categorie
	public int posX; // position de la case par 
	public int posY; //rapport au plateau de jeu

	
	//------------------------------------
	//ACCESSEURS ET MUTATEURS
	public int getPos(int x,int y)
	{
		return this.posX + this.posY;
	}
			
	public void setPos(int x, int y)
	{
		this.posX=x;
		this.posY=y;
	}
		

	//------------------------------------	
	//Methodes a utiliser depuis Joueur lors de ChoisirCaseDestination
	//PAR DEFAUT TOUTES LES CASES SONT DESELECTIONNEES
	public void isSelected()
	{
		this.isSelected = true;
	}
		
	//methode a utiliser lorsque le joueur quitte la case pour revenir à l'état initial
	public void isNotSelected()
	{
		this.isSelected = false;
	}

	}
	

