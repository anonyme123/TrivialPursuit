package model;

//Classe CaseCam, recupere les attributs de AbstractCase
//defini isCamembert a true pour chaque case a camembert

//Auteur : Gael Venin

public class CaseCam extends AbstractCase{

	//Constructeur par défaut, la couleur est liee a un theme et doit etre precisee
	public CaseCam(Couleur couleur, int posX, int posY)
	
	{
		super(couleur,  posX,  posY, true);
		
		this.couleur.getTheme();
		this.isCamembert = true;
	}

}