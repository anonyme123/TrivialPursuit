import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Game {

	private JFrame frmRglesDuJeu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frmRglesDuJeu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRglesDuJeu = new JFrame();
		frmRglesDuJeu.setResizable(false);
		frmRglesDuJeu.setTitle("R\u00E8gles du jeu");
		frmRglesDuJeu.setBounds(100, 100, 450, 300);
		frmRglesDuJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRglesDuJeu.setVisible(true);
		frmRglesDuJeu.setSize(new Dimension(600, 428));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmRglesDuJeu.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnJouer = new JButton("Valider");
		btnJouer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmRglesDuJeu.dispose();
				new Plateau();
			}
		});
		btnJouer.setBounds(241, 365, 89, 23);
		panel.add(btnJouer);
		
		JLabel lblRglesDuJeu = new JLabel("R\u00E8gles du jeu");
		lblRglesDuJeu.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		lblRglesDuJeu.setBounds(171, 12, 300, 47);
		panel.add(lblRglesDuJeu);
		
		JLabel lblNewLabel = new JLabel("<html>Commencer une partie de Trivial Pursuit : <br>Tout d\u2019abord, chaque joueur doit placer au centre du plateau son camembert respectif. Le premier joueur lance le d\u00E9 et avance son pion d\u2019autant de cases dans la direction qu\u2019il souhaite. Le joueur de gauche pioche alors une carte et lui pose la question correspondant \u00E0 la couleur sur lequel se trouve son pion. Si le joueur r\u00E9pond correctement, il peut rejouer. Si non, il passe son tour. Dans le cas ou son camembert se trouve sur l\u2019une des 6 cases \u00AB Quartier G\u00E9n\u00E9ral \u00BB et qu\u2019il r\u00E9pond correctement, il peut ins\u00E9rer dans son camembert le triangle correspondant et rejouer. </html>");
		lblNewLabel.setBounds(20, 59, 564, 107);
		panel.add(lblNewLabel);
		
		JLabel lblCommentGagnerAu = new JLabel("<html>Comment gagner au Trivial Pursuit : <br> Lorsque qu\u2019un des joueurs \u00E0 en sa possession les 6 triangles de couleur diff\u00E9rentes, il doit pour terminer la partie remonter vers la case au centre du jeu en sachant que l\u2019on ne peut remonter sur cette case qu\u2019en effectuant un nombre de d\u00E9placements correspondant exactement au lancer du d\u00E9. Quand le joueur se situe sur cette case, les joueurs adverses se concertent pour d\u00E9terminer la cat\u00E9gorie de votre derni\u00E8re question sans regarder l\u2019une des cartes. L\u2019int\u00E9r\u00EAt \u00E9tant bien entendu de s\u00E9lectionner la cat\u00E9gorie sur laquelle vous semblez avoir le plus de difficult\u00E9s. Si vous r\u00E9pondez correctement, f\u00E9licitations, vous venez de gagner! Si non vous passez votre tour et attendez le prochain.</html>");
		lblCommentGagnerAu.setBounds(20, 184, 542, 169);
		panel.add(lblCommentGagnerAu);
	}
}
