package mainpackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	
	public static void main(String[] args) {
		try {
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
        
        Pion p1 = new Pion("Bleu", 1, new Coord(5, 4));
		System.out.println(p1.toString());
		p1.seDeplacer(6, 3);
		System.out.println(p1.toString());
		p1.seDeplacer(6, 3);
		System.out.println(p1.toString());

		De d1 = new De();
		d1.lancer();
		System.out.println(d1.toString());
	}

}
