package model;

public class Joueur {

	//--------------------ATTRIBUTS--------------------
	public String nom;
	public int numero;
	public  int nb_camembert = 0; 
	public Pion pion;
	
	
	//--------------------METHODES--------------------
	
	//CONSTRUCTEUR PAR DEFAUT 
	public Joueur(String nom, int numero, Pion pion)
	{
		this.nom=nom;
		this.numero=numero;
		this.pion=pion;
		
	}
	

	public int getNb_camembert() {
		return nb_camembert;
	}


	public void setNb_camembert(int nb_camembert) {
		this.nb_camembert = nb_camembert;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	//MUTATEUR ET ACCESSEURS DE BASE
	public String GetName()
	{
		return this.nom;
	}
	

	public void setName(String name)
	{
		this.nom = name;
	}
	
	
	//METHODES METIERS
	public int lancerDe()
	{
		De de = new De();
		return de.lancer();
		
	}
	


	public void choisirCaseDestination() 
	{
		
	}
	
	public void repondreQuestion()
	{
		
	}
	
	public void poseQuestion(Question q){
		
		
	}
	
	
	
	@Override
	public String toString() {
		return  nom + " Joueur numero " + numero + " pion de couleur " + pion.getCouleur() + " ," + nb_camembert
				+ " camemberts ";
	}
}
