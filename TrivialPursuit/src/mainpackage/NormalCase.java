package mainpackage;

public class NormalCase extends AbstractCase {

	//------------------------------------
	//Constructeur par defaut, preciser la couleur
	public NormalCase(Couleur couleur)
	{ //par defaut isCamembert = false
		super();
		this.couleur.getTheme();
		
	}
	
	//recuperer la position
	public int getPos(int x,int y)
	{
		return this.posX + this.posY;
	}

	//set la position de la case
	public void setPos(int x, int y)
	{
		this.posX=x;
		this.posY=y;
	}
	
	//definir si case a un camembert ou non
	public void setCamembert(boolean cam) //par defaut init a false
	{
		this.isCamembert = cam;
	}
	
	//init a false, change si un joueur la selectionne (dans JOueur => CHoisirCaseDestination
	
	//Gerer le cas quand le joueur n'est plus dessus donc déselectionner la case
	public void isSelected()
	{
		this.selected = true;
	}
}
