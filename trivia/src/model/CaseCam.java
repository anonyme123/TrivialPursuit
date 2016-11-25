//AUTEUR : Gael Venin

//DESCRIPTION: 
//Classe CaseCam hérite des attributs de AbstractCase

//INFO : 
//Defini isCamembert a true pour les 6 cases à camemberts

package model;

public class CaseCam extends AbstractCase{

	//Constructeur par défaut, la couleur est liee a un theme et doit etre precise lors de la creation
	public CaseCam(Couleur couleur, int posX, int posY)
	{
		super(couleur,  posX,  posY, true);
		this.couleur.getTheme();
		this.isCamembert = true;
	}

}