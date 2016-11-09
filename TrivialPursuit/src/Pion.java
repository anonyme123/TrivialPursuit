
public class Pion {

	public String couleur;
	public float positionDepartX;
	public float positionDepartY;
	public float positionArriveX;
	public float positionArriveY;
	public int idPion;
	
	public Pion(String couleur, float positionDepartX, float positionDepartY, float positionArriveX,
			float positionArriveY, int idPion){
		
		this.couleur = couleur;
		this.positionDepartX = positionDepartX;
		this.positionDepartY = positionDepartY;
		this.positionArriveX = positionArriveX;
		this.positionArriveY = positionArriveY;
		this.idPion = idPion;
		
	}
	
	public Pion(String couleur, float positionDepartX, float positionDepartY, int idPion){
		this.couleur = couleur;
		this.positionDepartX = positionDepartX;
		this.positionDepartY = positionDepartY;
		this.idPion = idPion;
	}

	@Override
	public String toString() {
		return " Le Pion est de couleur" + couleur +  " a pour coordonn�es de en X et Y de : " + positionDepartX +" " + 
				positionDepartY + ", et se d�place en :" + positionArriveX + " "+ positionArriveY
				+ ". Il s'agit du pion num�ro " + idPion;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getPositionDepartX() {
		return positionDepartX;
	}

	public void setPositionDepartX(float positionDepartX) {
		this.positionDepartX = positionDepartX;
	}

	public float getPositionDepartY() {
		return positionDepartY;
	}

	public void setPositionDepartY(float positionDepartY) {
		this.positionDepartY = positionDepartY;
	}

	public float getPositionArriveX() {
		return positionArriveX;
	}

	public void setPositionArriveX(float positionArriveX) {
		this.positionArriveX = positionArriveX;
	}

	public float getPositionArriveY() {
		return positionArriveY;
	}

	public void setPositionArriveY(float positionArriveY) {
		this.positionArriveY = positionArriveY;
	}

	public int getIdPion() {
		return idPion;
	}

	public void setIdPion(int idPion) {
		this.idPion = idPion;
	}

	public String toString1() {
		return " Le Pion est de couleur" + couleur +  " a pour coordonn�es de en X et Y de : " + positionDepartX +" " + 
				positionDepartY + ". Il s'agit du pion num�ro " + idPion;
	}
	
	
}
