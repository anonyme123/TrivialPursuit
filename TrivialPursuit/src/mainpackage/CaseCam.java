package mainpackage;

public class CaseCam extends AbstractCase{

	//Constructeur par défaut, la couleur est liee a un theme et doit etre precisee
	public CaseCam() {
		super();
		this.couleur.getTheme();
		this.isCamembert = true;
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
		//Par defaut toutes les cases sont déselectionnées
		public void isSelected()
		{
			this.selected = true;
		}
		
		//methode a utiliser lorsque le joueur quitte la case pour revenir à l'état initial
		public void isNotSelected()
		{
			this.selected = false;
		}
	//------------------------------------
}
