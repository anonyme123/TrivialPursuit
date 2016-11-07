import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;


public class Plateau {

	private JFrame frmPlateauDuJeu; 

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
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(79, 54, 69, 43);
		panel.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.RED);
		canvas_1.setBounds(451, 99, 100, 100);
		panel.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.GREEN);
		canvas_2.setBounds(166, 128, 201, 150);
		panel.add(canvas_2);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLUE);
		canvas_3.setBounds(35, 240, 100, 100);
		panel.add(canvas_3);
	}
}
