package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
///
public class Pion {

	private String couleur;
	private int idPion;
	private Coord coord;
	private Map<Coord,Set<Coord>> modele = new HashMap<Coord,Set<Coord>>(); //FIXME comment se le faire donner par Jeu

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
	
	
	public boolean isMoveOk(int xFinal, int yFinal, De de) {
		Map<Coord,Set<Coord>> casesNonParcourues = new HashMap<>(modele);	//toutes les cases du jeu non parcourues
		Set<Coord> coordoneesACetteEtape = new HashSet<>(); 
		coordoneesACetteEtape.add(this.coord);	//coordonnées déjà passées et actuelles
		int i=0;
		for (i=0; i<de.getNbAleatoire();i++){ 		// itération jusqu'à la fin du dé
			Set<Coord> etapesSuivante = new HashSet<Coord>();	
			for (Coord coordonneeDEtape : coordoneesACetteEtape) {	//coordonnéeDEtape = voisins possibles
				etapesSuivante.addAll( casesNonParcourues.get(coordonneeDEtape) );	//etape suivante contient tous les coordonnées des voisins possibles si non parcourus
				casesNonParcourues.remove(coordonneeDEtape); // les coordonnées d'étapes sont maintenant parcourues
			}
			coordoneesACetteEtape = etapesSuivante;	// mise à jour des nouvelles coordonnées actuelles
		}
					
		return coordoneesACetteEtape.contains(new Coord(xFinal, yFinal));	// si la destination souhaitée correspond à une des dernieres coordonnées 
	
	}
	
	
	/*
	// V�rifie si le mouvemement eput �tre effectu� par le joueur

	public boolean isMoveOk(int xFinal, int yFinal, De de) {
		int reste = 0, xFinalOk = 0, yFinalOk = 0;

			// cas deplacement sur x vers la droite
			if (coord.x + de.getNbAleatoire() > 6 && (coord.y == 0 ||  coord.y == 6)) { // 6 car il y a 7 cases longueur et 7 en largeur donc coord de 0 à 6
				xFinalOk = 6;	//on se place en bout de ligne
				reste = de.getNbAleatoire() - (6 - coord.x);	//nombre de cases restantes
				if (coord.y == 0) {	
					yFinalOk = coord.y + reste;
				} else if (coord.y == 6) {
					yFinalOk = coord.y - reste;
				}
			}else if (coord.x + de.getNbAleatoire() <= 6 && (coord.y == 0 || coord.y == 6)) {
				if(coord.x +de.getNbAleatoire() >= 3 && coord.x < 3){ //Va atteindre la croix
					xFinalOk=3;
					reste = de.getNbAleatoire() - (3 - coord.x);
					if (coord.y == 0) {	
						yFinalOk = coord.y + reste;
					} else if (coord.y == 6) {
						yFinalOk = coord.y - reste;
					}
				}else{
					xFinalOk = coord.x + de.getNbAleatoire();
					yFinalOk=coord.y;
				}			
			} 					
			if (xFinalOk == xFinal && yFinalOk == yFinal) {
				return true;
			}
		
			// cas deplacement x vers la gauche
			if (coord.x - de.getNbAleatoire() < 0 && (coord.y == 0 || coord.y == 6)) {	
				xFinalOk = 0;
				reste = de.getNbAleatoire() - (coord.x);
				if (coord.y == 0) {
					yFinalOk = coord.y + reste;
				} else if (coord.y == 6) {
					yFinalOk = coord.y - reste;
				}
			} else if (coord.x - de.getNbAleatoire() >= 0 && (coord.y == 0 || coord.y == 6)) {
				if(coord.x -de.getNbAleatoire() <= 3 && coord.x > 3){ //Va atteindre la croix
					xFinalOk=3;
					reste =  de.getNbAleatoire() - (coord.x+3 +1);
					if (coord.y == 0) {
						yFinalOk = coord.y + reste;
					} else if (coord.y == 6) {
						yFinalOk = coord.y - reste;
					}
				}else{
					xFinalOk = coord.x - de.getNbAleatoire();
					private final yFinalOk=coord.y;
				}
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
		} else if (coord.y + de.getNbAleatoire() <= 6 && (coord.x == 0 || coord.x == 6)) {
			if(coord.y +de.getNbAleatoire() >= 3 && coord.y < 3){ //Va atteindre la croix
				yFinalOk=3;
				reste = de.getNbAleatoire() - (3 - coord.y);
				if (coord.x == 0) {	
					xFinalOk = coord.x + reste;
				} else if (coord.x == 6) {
					xFinalOk = coord.x - reste;
				}else{
					yFinalOk = coord.y + de.getNbAleatoire();
					xFinalOk=coord.x;
				}
			} 
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
			else if (coord.y - de.getNbAleatoire() >= 0 && (coord.x == 0 || coord.x == 6)) {
				if(coord.y -de.getNbAleatoire() <= 3 && coord.y > 3){ //Va atteindre la croix
					yFinalOk=3;
					reste =  de.getNbAleatoire() - (coord.y+3 +1);
					if (coord.x == 0) {
						xFinalOk = coord.x + reste;
					} else if (coord.x == 6) {
						xFinalOk = coord.x - reste;
					}
				}else{
					yFinalOk = coord.y - de.getNbAleatoire();
					xFinalOk=coord.x;
				}
			}
		if (yFinalOk == yFinal && xFinalOk == xFinal) {
			return true;
		}
		}
		return false;
		
	}*/

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
	
	public Map<Coord, Set<Coord>> getModele() {
		return modele;
	}
		
	public void setModele(Map<Coord, Set<Coord>> modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Pion : couleur=" + couleur + ", idPion=" + idPion + ", coord="
				+ coord;
	}

}