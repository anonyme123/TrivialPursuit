package mainpackage;

public class Joueur {

	//--------------------ATTRIBUTS--------------------
	public String nom;
	public int numero;
	public String couleur;
	public int nb_camembert; 
	
	
	//--------------------METHODES--------------------
	
	//CONSTRUCTEUR PAR DEFAUT 
	public Joueur(String nom, int numero, String couleur)
	{
		this.nom=nom;
		this.numero=numero;
		this.couleur=couleur;
		this.nb_camembert=0;
		
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
}
