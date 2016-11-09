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
                TrivialPursuit frame = new TrivialPursuit();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        
        Pion p1 = new Pion("Bleu", 2, 3, 4, 5, 1);
		System.out.println(p1.toString());
		Pion p2 = new Pion("Rouge", 2, 3, 2);
		System.out.println(p2.toString1());

	}

}
