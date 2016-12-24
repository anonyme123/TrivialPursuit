//AUTEUR : Gael Venin

//DESCRIPTION: 
//Enumeration des couleurs de cases, elles sont liees aux categories 

//INFO : 
//
package model;
public enum Couleur {
	
	VERTE(Categorie.INFORMATIQUE),	//0 
	ROUGE(Categorie.LYONBYNIGHT),	//1
	BLEU(Categorie.DIVERTISSEMENT), //2
	VIOLET(Categorie.SPORT),		//3
	ORANGE(Categorie.VOYAGE),		//4
	JAUNE(Categorie.MUSIQUE),		//5
	NOIR(Categorie.BONUS); 			//6 => case BONUS
	
	Categorie theme;
	
	public Categorie getTheme() {
		return theme;
	}
	
	Couleur(Categorie theme) {
		this.theme = theme;
	}
	
	public static Couleur getCouleur(int pos) {
		return Couleur.values()[pos];
	}
}