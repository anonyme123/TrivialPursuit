//AUTEUR : Gael Venin



//DESCRIPTION: 
//Classe CaseNormale hérite des attributs de AbstractCase

//INFO : 
//Defini isCamembert a true pour les 6 cases à camemberts
//
package model;
//
public class CaseNormale extends AbstractCase {
	//Constructeur par défaut, la couleur est liee a un theme et doit etre precisee
	public CaseNormale(Couleur couleur, int posX, int posY)
		{ 
		super(couleur,posX,posY,false);		
		//this.couleur.getTheme();
		}	
}	
