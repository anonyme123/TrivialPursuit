import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.*;
import view.*;

public class Main {
	
	public static void main(String[] args) {
		
		//LANCEMENT DE L'IHM
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                IHM frame = new IHM(new Dimension(700,725));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
	        
        //INITIALISATION DE LA DATABASE
        Database e = new Database();
        e.Derby();
        
        //TESTS
        Pion p1 = new Pion("Bleu", 1, new Coord(5, 4));
		    System.out.println(p1.toString());
		    p1.seDeplacer(6, 3);
		    System.out.println(p1.toString());
	    	p1.seDeplacer(6, 3);
		    System.out.println(p1.toString());
		
		
	    	De d1 = new De();
		    d1.lancer();
		    System.out.println(d1.toString());
        Pion p2 = new Pion("Bleu", 1, new Coord(1, 6));
		    System.out.println(p2.toString());
    
        
        Pion p7 = new Pion("Bleu", 1, new Coord(5, 6));
        System.out.println(p7.toString());
  
        //test pose question
        Pion pJoueur1 = new Pion("Bleue",1,new Coord(0,1));
        Joueur j1 = new Joueur("URBE",1,pJoueur1);
        AbstractCase case1 = new CaseNormale(Couleur.VERTE,0,1);

	}
}
