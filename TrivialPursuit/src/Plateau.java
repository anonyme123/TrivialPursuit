import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;


public class Plateau {

	private JFrame frmPlateauDuJeu; //bouboule

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plateau window = new Plateau();
					window.frmPlateauDuJeu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Plateau() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlateauDuJeu = new JFrame();
		frmPlateauDuJeu.setTitle("Plateau du jeu");
		frmPlateauDuJeu.setBounds(100, 100, 450, 300);
		frmPlateauDuJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlateauDuJeu.setSize(new Dimension (600, 400));
		frmPlateauDuJeu.setResizable(false);
		
		JPanel panel = new JPanel();
		frmPlateauDuJeu.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		/*Canvas canvas = new Canvas();
		canvas.setBackground(Color.RED);
		canvas.setBounds(92, 142, 48, 46);
		canvas.
		
		panel.add(canvas);*/
	
		CirclePanel maxenceLePlusBo = new CirclePanel();
		maxenceLePlusBo.paintComponent();
		panel.add(maxenceLePlusBo);
	}
	
}
