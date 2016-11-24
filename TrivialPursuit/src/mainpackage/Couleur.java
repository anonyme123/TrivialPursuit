package mainpackage;

public enum Couleur {
	
	VERTE(Categorie.INFORMATIQUE),	//0 
	ROUGE(Categorie.LYONBYNIGHT),	//1
	BLEU(Categorie.DIVERTISSEMENT), // 2
	VIOLET(Categorie.SPORT),		// 3
	ORANGE(Categorie.VOYAGE),		// 4
	JAUNE(Categorie.MUSIQUE);		// 5
	
	Categorie theme;
	
	public Categorie getTheme() {
		return theme;
	}

		
	
	Couleur(Categorie theme) {
		this.theme = theme;//lalala
	}
	
	public static Couleur getCouleur(int pos) {
		return Couleur.values()[pos];
		// return Couleur.VERTE;
	}
}
