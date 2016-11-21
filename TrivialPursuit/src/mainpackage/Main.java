package mainpackage;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	
	public static void main(String[] args) {
		
		//LANCEMENT DE L'IHM
	/*	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                IHM frame = new IHM();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        
        //INITIALISATION DE LA DATABASE
        Database e = new Database();
        e.Derby(); */
        
        //TESTS
    
		Joueur j1 = new Joueur("URBE Sebastien", 1, "Bleu", new Pion("Bleu", 1, new Coord(6, 4)));
		Joueur j2 = new Joueur("Talbot Hugo", 2, "Rouge", new Pion("Rouge", 1, new Coord(5, 4)));
		Joueur j3 = new Joueur("DELORME Claire", 3, "Vert", new Pion("Vert", 1, new Coord(8, 2)));
		Joueur j4 = new Joueur("FAURIE Jeanne", 4, "Marron", new Pion("Marron", 1, new Coord(3, 4)));
		Joueur j5 = new Joueur("VENIN Gael", 5, "Jaune", new Pion("Jaune", 1, new Coord(2, 8)));
		Joueur j6 = new Joueur("GASCOIN Donatien", 6, "Orange", new Pion("Orange", 1, new Coord(5, 1)));
		
		List<Joueur> listeJoueurs = new ArrayList<Joueur>();
		listeJoueurs.add(j1);
		listeJoueurs.add(j2);
		listeJoueurs.add(j3);
		listeJoueurs.add(j4);
		listeJoueurs.add(j5);
		listeJoueurs.add(j6);
        Jeu jeu = new Jeu(10,10,10,6, listeJoueurs, listeJoueurs.get(0));
        
        System.out.println("Affichage du Joueur actif\n");
		System.out.println(jeu.afficheJoueurActif());
		jeu.changeJoueurActif();
		System.out.println("Changment du joueur actif");
		System.out.println("------------------ \n Affichage du Joueur Actif \n");
		System.out.println(jeu.afficheJoueurActif());
		System.out.println("------------------------\n Joueur actif gagne un camembert \n");
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println("---------------------\n Affichage de tous les joueurs\n");
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());
		System.out.println(j6.toString());
		System.out.println("------------------\n Change le joueur Actif ");
		jeu.changeJoueurActif();
	
		
		System.out.println("------------------\n Affiche joueur actif");
		System.out.println(jeu.afficheJoueurActif());
		System.out.println("------------------\n Le joueur actif gagne 6 camemberts");
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		System.out.println(jeu.repondQuestionEtafficheVainqueur());
		
}
}
