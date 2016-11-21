package mainpackage;

public class Pion {

	public String couleur;
	public int idPion;
	public Coord coord;

	// Initialisation d'un pion
	public Pion(String couleur, int idPion, Coord coord) {

		this.couleur = couleur;
		this.idPion = idPion;
		this.coord = coord;

	}

	public boolean seDeplacer(int x, int y) { // Fait se d�placer le pion
		if (coord.x == x && coord.y == y)
			return false;
		else
			coord.x = x;
		coord.y = y;
		return true;
	}

	// V�rifie si le mouvemement eput �tre effectu� par le joueur

	public boolean isMoveOk(int xFinal, int yFinal, De de) {
		int reste = 0, xFinalOk = 0, yFinalOk = 0;

		// cas deplacement sur x vers la droite
		if (coord.x + de.getNbAleatoire() > 6 && (coord.y == 0 || coord.y == 6)) { // 6
																					// car
																					// il
																					// y
																					// a
																					// 7
																					// cases
																					// longueur
																					// et
																					// 7
																					// en
																					// largeur
																					// donc
																					// coord
																					// de
																					// 0
																					// à
																					// 6
			xFinalOk = 6;
			reste = de.getNbAleatoire() - (6 - coord.x);
			if (coord.y == 0) {
				yFinalOk = coord.y + reste;
			} else if (coord.y == 6) {
				yFinalOk = coord.y - reste;
			}
		} else if (coord.x + de.getNbAleatoire() <= 6
				&& (coord.y == 0 || coord.y == 6)) {
			xFinalOk = coord.x + de.getNbAleatoire();
		}
		if (xFinalOk == xFinal && yFinalOk == yFinal) {
			return true;
		}
		// o
		// cas deplacement x vers la gauche
		if (coord.x - de.getNbAleatoire() < 0 && (coord.y == 0 || coord.y == 6)) {
			xFinalOk = 0;
			reste = de.getNbAleatoire() - (coord.x);
			if (coord.y == 0) {
				yFinalOk = coord.y + reste;
			} else if (coord.y == 6) {
				yFinalOk = coord.y - reste;
			}
		} else if (coord.x - de.getNbAleatoire() >= 0
				&& (coord.y == 0 || coord.y == 6)) {
			xFinalOk = coord.x - de.getNbAleatoire();
		}
		if (xFinalOk == xFinal && yFinalOk == yFinal) {
			return true;
		}
		// cas deplacement y vers le haut
		if (coord.y + de.getNbAleatoire() > 6 && (coord.x == 0 || coord.x == 6)) {
			yFinalOk = 6;
			reste = de.getNbAleatoire() - (6 - coord.y);
			if (coord.x == 0) {
				xFinalOk = coord.x + reste;
			} else if (coord.x == 6) {
				xFinalOk = coord.x - reste;
			}
		} else if (coord.y + de.getNbAleatoire() <= 6
				&& (coord.x == 0 || coord.x == 6)) {
			yFinalOk = coord.y + de.getNbAleatoire();
		}
		if (xFinalOk == xFinal && yFinalOk == yFinal) {
			return true;
		}
		// cas deplacement y vers le bas
		if (coord.y - de.getNbAleatoire() < 0 && (coord.x == 0 || coord.x == 6)) {
			yFinalOk = 0;
			reste = de.getNbAleatoire() - (coord.y);
			if (coord.x == 0) {
				xFinalOk = coord.x + reste;
			} else if (coord.x == 6) {
				xFinalOk = coord.x - reste;
			}
		} else if (coord.y + de.getNbAleatoire() >= 0
				&& (coord.x == 0 || coord.x == 6)) {
			yFinalOk = coord.y - de.getNbAleatoire();
		}
		if (xFinalOk == xFinal && yFinalOk == yFinal) {
			return true;
		}

		return false;

		/*
		 * 
		 * public boolean isMoveOk(int xFinal, int yFinal, De de){
		 * 
		 * if(xFinal == coord.x + de.getNbAleatoire() && yFinal == coord.y ||
		 * yFinal == coord.y + de.getNbAleatoire() && xFinal == coord.x) return
		 * true; else return false;
		 */
	}

	// Getters et Setters
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
		this.coord.x = x;
	}

	public void setY(int y) {
		this.coord.y = y;
	}

	@Override
	public String toString() {
		return "Pion : couleur=" + couleur + ", idPion=" + idPion + ", coord="
				+ coord;
	}

}
