//AUTEUR : Gael Venin

//DESCRIPTION: 
//Enumeration des categories, elles sont utiles pour les enums Couleur

//INFO : 
//
//
package model;

public enum Categorie {
	
	INFORMATIQUE("Informatique"),
	LYONBYNIGHT("LyonByNight"),
	DIVERTISSEMENT("Divertissement"),
	SPORT("Sport"),
	VOYAGE("Voyage"),
	MUSIQUE("Musique"),
	BONUS("Bonus");
	
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}
	
	Categorie(String categoryName) {
		this.categoryName = categoryName;
	}
}