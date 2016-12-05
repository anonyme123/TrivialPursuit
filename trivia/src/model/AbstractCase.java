//AUTEUR : Gael Venin

//DESCRIPTION: 
//Classe abstraite AbstractCase , propose des attributs et méthodes communes à CaseCam et CaseNormale
//Sert à déclarer des objets de type Case (avec ou sans camembert)

//INFO : 
//PAR DEFAUT TOUTES LES CASES SONT DESELECTIONNEES
//
package model;


public abstract class AbstractCase {
	
	public boolean isCamembert=false; //Par defaut une case n'a pas de camembert
	boolean isSelected = false; //Par defaut une case n'est pas selectionee, seul un joueur avec choisirCaseDest passe a true
	public Couleur couleur;//Une couleur est liee a une categorie
	public int posX; // Position x,y 
	public int posY; 

	public AbstractCase(Couleur couleur, int posX, int posY, boolean isCamembert) {
				super();
				this.isCamembert = isCamembert;
				this.couleur = couleur;
				this.posX = posX;
				this.posY = posY;
			}
		
			@Override
			public String toString() {
				return "AbstractCase [" + "isCamembert=" + isCamembert + ", isSelected=" 
						+ isSelected+ ", couleur=" + couleur + ", posX=" + posX + ", posY=" + posY
						+ "] \n";
			}
			
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
	public void isSelected()
	{
		this.isSelected = true;
	}
		
	//Methode a utiliser lorsque le joueur quitte la case pour revenir à l'état initial
	public void isNotSelected()
	{
		this.isSelected = false;
	}

	}
	