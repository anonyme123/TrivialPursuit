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
	}
}
