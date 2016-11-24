package Object;

import java.util.HashMap;
import java.util.Map;

import mainpackage.Couleur;

public class CaseNormale extends AbstractCase {

	//Constructeur par défaut, la couleur est liee a un theme et doit etre precisee
	public CaseNormale(Couleur couleur)
	{ 
		super();
		this.couleur.getTheme();
	}
	
}	

/*

//CREATION DES CASES
int[][] in = {
		{0,1,1},{0,2,3},
		{1,0,2},{1,3,2},{1,6,2},
		{2,0,5},{2,3,2},{2,6,0},
		{3,0,3},{3,1,4},{3,2,5},{3,4,0},{3,5,2},{3,6,1},
		{4,0,1},{4,3,4},{4,6,3},
		{5,0,0},{5,3,5},{5,6,5},
		{6,1,4},{6,2,5},{6,4,1},{6,5,0}
		
};

System.out.println(in.length);
Map<Coord,Couleur> map = new HashMap<>();
for (int x = 0 ; x <= 23 ; x++) {
	map.put(new Coord(in[x][0], in[x][1]), Couleur.getCouleur(in[x][2]));
}

System.out.println(map);*/