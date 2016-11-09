//Classe Joueur

public class Joueur {
	
	
	//--------------------ATTRIBUTS--------------------
	public String nom;
	public int ordre;
	public int id_pion;
	//public int nb_camembert; // a redeterminer ???
	
	
	//--------------------METHODES--------------------
	
	//CONSTRUCTEUR PAR DEFAUT 
	public Joueur(String jnom, int jordre, int jpion, int jcam)
	{
		this.nom=jnom;
		this.ordre=jordre;
		this.id_pion=jpion;
		this.nb_camembert=jcam;
		
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
	
	public String toString()
	{
		
	}
	//----------------------------
	
	
	
	//LANCER DE
	public int lancerDe()
	{
		
		
	}
	
	//CHOISIR UNE CASE
	public Case choisirCase() //on choisit une case,id?
	{
		
	}
	
	public int repondreQuestion()
	{
	
		
	}
	

}
