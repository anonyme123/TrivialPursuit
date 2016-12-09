//AUTEUR : CLAIRE DELORME 


//DESCRIPTION:
//


//INFO :
//
//
package model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pion {

	private String couleur;
	private int idPion;
	private Coord coord;
	private Map<Coord,Set<Coord>> modele = new HashMap<Coord,Set<Coord>>(); //FIXME comment se le faire donner par Jeu
	
	private static final boolean DEBUG = false;
	
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
		Set<Coord> coordoneesALEtapeActuelle = new HashSet<>(); // etape = etape du parcours de 0 à N cases (N=résultat dé)
		
		if (true)
		System.out.println(
				String.format("Vérification du déplacement de %s cases en partant de %s",
						de.getNbAleatoire(),
						this.coord
				)
		);
		if (DEBUG) System.out.println("En utilisant la map suivante: " + modele);
		
		coordoneesALEtapeActuelle.add(this.coord);	// on part de l'étape zéro (case de départ)
		
		int etape=0;
		for (etape=0; etape<de.getNbAleatoire();etape++){ 		// itération jusqu'à la fin du dé
			if (DEBUG) System.out.println("Etape N°" + etape);
			Set<Coord> etapesSuivante = new HashSet<Coord>();
			for (Coord coordonneeDEtape : coordoneesALEtapeActuelle) {	//coordonnéeDEtape = voisins possibles

				Set<Coord> casesVoisines = modele.get(coordonneeDEtape);
				
				if (DEBUG) System.out.println("Récupération des cases voisines de " + coordonneeDEtape + " => " + casesVoisines);
				
				for (Coord voisine : casesVoisines) {
					if (DEBUG) System.out.print("- la case voisine " + voisine + " ");
					
					// On vérifie qu'on ne fait pas "marche arrière"
					if (casesNonParcourues.containsKey(voisine)) {
						if (DEBUG) System.out.print("n'a PAS");
						etapesSuivante.add(voisine);
					}
					else {
						if (DEBUG) System.out.print("a");
					}
					if (DEBUG) System.out.println(" déja été parcourue.");
				}
				//etapesSuivante.addAll( casesNonParcourues.get(coordonneeDEtape) );	//etape suivante contient tous les coordonnées des voisins possibles si non parcourus
				if (DEBUG) System.out.println("Etapes suivantes possibles => " + etapesSuivante);
				casesNonParcourues.remove(coordonneeDEtape); // les coordonnées d'étapes sont maintenant parcourues
			}
			coordoneesALEtapeActuelle = etapesSuivante;	// mise à jour des nouvelles coordonnées actuelles
		}
		boolean ret = coordoneesALEtapeActuelle.contains(new Coord(xFinal, yFinal));
		System.out.println("Destinations possibles:" + coordoneesALEtapeActuelle);
		System.out.println("Return:" + ret);
		return ret;	// si la destination souhaitée correspond à une des dernieres coordonnées 
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

	public Map<Coord, Set<Coord>> getModele() {
		return modele;
	}

	public void setModele(Map<Coord, Set<Coord>> modele) {
		this.modele = modele;
		System.out.println("Modele set to " + this.modele);
	}

	@Override
	public String toString() {
		return "Pion : couleur=" + couleur + ", idPion=" + idPion + ", coord="
				+ coord;
	}

}