package mainpackage;
public class Pion {

	public String couleur;
	public int idPion;
	public Coord coord;
	
	public Pion(String couleur, int idPion, Coord coord){
		
		this.couleur = couleur;
		this.idPion = idPion;
		this.coord = coord;
		
	}
	
	public boolean seDeplacer(int x, int y){
		if(coord.x == x && coord.y == y)
			return false;
		else
			coord.x = x;
			coord.y = y;
			return true;
	}

/*	public boolean isMoveOk(int xFinal, int yfinal){
		if(coord.x ==)
		return false;
		
		
	}*/
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
		return "Pion [couleur=" + couleur + ", idPion=" + idPion + ", coord=" + coord + "]";
	}


	
	
	
	


	
	
	
	
}
