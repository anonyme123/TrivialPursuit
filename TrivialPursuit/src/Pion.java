
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
		return " Le Pion est de couleur" + couleur +  " a pour coordonnées de en X et Y de : " + positionDepartX +" " + 
				positionDepartY + ", et se déplace en :" + positionArriveX + " "+ positionArriveY
				+ ". Il s'agit du pion numéro " + idPion;
	}
	
	public String toString1() {
		return " Le Pion est de couleur" + couleur +  " a pour coordonnées de en X et Y de : " + positionDepartX +" " + 
				positionDepartY + ". Il s'agit du pion numéro " + idPion;
	}
	
	
}
