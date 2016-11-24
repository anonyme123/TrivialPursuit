package mainpackage;

public enum Couleur {
	
	VERTE(Categorie.INFORMATIQUE),
	ROUGE(Categorie.LYONBYNIGHT),
	BLEU(Categorie.DIVERTISSEMENT),
	VIOLET(Categorie.SPORT),
	ORANGE(Categorie.VOYAGE),
	JAUNE(Categorie.MUSIQUE);
	
	Categorie theme;
	
	public Categorie getTheme() {
		return theme;
	}

		
	
	Couleur(Categorie theme) {
		this.theme = theme;//lalala
	}
}
