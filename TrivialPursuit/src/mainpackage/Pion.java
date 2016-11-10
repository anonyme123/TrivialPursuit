package mainpackage;
public class Pion {

	public String couleur;
	public int idPion;
	public Coord coord;
	
	//Initialisation d'un pion
	public Pion(String couleur, int idPion, Coord coord){
		
		this.couleur = couleur;
		this.idPion = idPion;
		this.coord = coord;
		
	}
	
	public boolean seDeplacer(int x, int y){ // Fait se d�placer le pion
		if(coord.x == x && coord.y == y)
			return false;
		else
			coord.x = x;
			coord.y = y;
			return true;
	}

	// V�rifie si le mouvemement eput �tre effectu� par le joueur
	public boolean isMoveOk(int xFinal, int yFinal, De de){
		int reste=0, xFinalOk=0, yFinalOk=0;
		if(coord.x+de>6){
			xFinalOk=de-coord.x;
			reste=de-xFinalOk;
			if(y==0){
				yFinalOk=coord.y+reste;
			}elseif(coord.y==6){
				yFinalOk=coord.y-reste;
			}
		}
		
		
		if(xFinal == coord.x + de.getNbAleatoire() && yFinal == coord.y || yFinal == coord.y + de.getNbAleatoire() && xFinal == coord.x)
			return true;
		else 
			return false;

		
		
	}
	
	//Getters et Setters
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getIdPion() {
		return idPion;
	}

	public void setIdPion(int idPion) {
		this.idPion = idPion;
	}

	public int getX() {
		return coord.x;
	}
	
	public int getY() {
		return coord.y;
	}


	public void setX(int x) {
		this.coord.x= x;
	}
	
	public void setY(int y) {
		this.coord.y= y;
	}

	@Override
	public String toString() {
		return "Pion : couleur=" + couleur + ", idPion=" + idPion + ", coord=" + coord ;
	}


	
	
	
	


	
	
	
	
}
