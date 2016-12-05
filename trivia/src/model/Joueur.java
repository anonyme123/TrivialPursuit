package model;

import java.sql.SQLException;

public class Joueur {

	//--------------------ATTRIBUTS-----------------------
	public String nom;
	public int numero;
	private  int nb_camembert = 0; 
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
		nb_camembert = nb_camembert;
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
	
	public void repondreQuestion(Question q, int i)
	{
		if(i==q.getCorrectanswer()){
			System.out.println("Bravo vous avez répondu juste !");
		}
		else{
			System.out.println("Malheureusement c'est faux ...");
		}
	}
	public void repondreQuestionCam(Question q, int i){
		if(i==q.getCorrectanswer()){
			System.out.println("Bravo vous avez répondu juste !");
			nb_camembert ++;
		}
		else{
			System.out.println("Malheureusement c'est faux ...");
		}
	}
	
	public Question poseQuestion(AbstractCase case1){
		Question question = new Question(case1);
		return question;
	}
	

	
	
	@Override
	public String toString() {
		return  nom + " Joueur numero " + numero + " pion de couleur " + pion.getCouleur() + " ," + nb_camembert
				+ " camemberts ";
	}


	
}
