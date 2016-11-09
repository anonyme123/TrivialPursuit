package mainpackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class IHM extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel cardPanel, startscreen, rules, gameboard;
    /*private JLabel jl1, jl2;
    private JButton btn1, btn2;*/
    private CardLayout cardLayout = new CardLayout();

    public IHM() {
        setTitle("TrivialPursuit");
        setSize(800, 500);
        try {
			setIconImage(ImageIO.read(new File("src/appicon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setResizable(false);
   
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        startscreen = new JPanel();
        rules = new JPanel();
        gameboard = new JPanel();
        startscreen.setLayout(null);

        /////// début du remplissage du jpanel startscreen /////////////////
        JLabel lblTitle = new JLabel("Trivial Pursuit");
        lblTitle.setBounds(282, 12, 239, 42);
		lblTitle.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		startscreen.add(lblTitle);
		
		JLabel picLabel = new JLabel(new ImageIcon("src/gameicon.jpg"));
		picLabel.setLocation(249, 92);
		picLabel.setSize(292, 283);
		startscreen.add(picLabel);
		
		TextField joueur1 = new TextField();
		joueur1.setBounds(112, 108, 69, 19);
		joueur1.setText("Joueur 1");
		startscreen.add(joueur1);
		
		TextField joueur2 = new TextField();
		joueur2.setBounds(112, 145, 69, 19);
		joueur2.setText("Joueur 2");
		startscreen.add(joueur2);
		
		TextField joueur3 = new TextField();
		joueur3.setBounds(112, 183, 69, 19);
		joueur3.setText("Joueur 3");
		startscreen.add(joueur3);
		
		TextField joueur4 = new TextField();
		joueur4.setBounds(112, 218, 69, 19);
		joueur4.setText("Joueur 4");
		startscreen.add(joueur4);
		
		TextField joueur5 = new TextField();
		joueur5.setBounds(112, 256, 69, 19);
		joueur5.setText("Joueur 5");
		startscreen.add(joueur5);
		
		TextField joueur6 = new TextField();
		joueur6.setBounds(112, 295, 69, 19);
		joueur6.setText("Joueur 6");
		startscreen.add(joueur6);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(348, 411, 84, 25);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "2");
            }
		});
		startscreen.add(btnValider);
		rules.setLayout(null);
        ///////fin du remplissage du jpanel startscreen /////////
		
	    ///////début du remplissage du jpanel rules /////////
		JLabel lblRglesDuJeu = new JLabel("R\u00E8gles du jeu");
		lblRglesDuJeu.setBounds(275, 12, 238, 42);
		lblRglesDuJeu.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		rules.add(lblRglesDuJeu);
		
		JLabel lblCommencerUne = new JLabel("<html>Commencer une partie de Trivial Pursuit : <br>Tout d\u2019abord, chaque joueur doit placer au centre du plateau son camembert respectif. Le premier joueur lance le d\u00E9 et avance son pion d\u2019autant de cases dans la direction qu\u2019il souhaite. Le joueur de gauche pioche alors une carte et lui pose la question correspondant \u00E0 la couleur sur lequel se trouve son pion. Si le joueur r\u00E9pond correctement, il peut rejouer. Si non, il passe son tour. Dans le cas ou son camembert se trouve sur l\u2019une des 6 cases \u00AB Quartier G\u00E9n\u00E9ral \u00BB et qu\u2019il r\u00E9pond correctement, il peut ins\u00E9rer dans son camembert le triangle correspondant et rejouer. </html>");
		lblCommencerUne.setBounds(51, 66, 675, 169);
		rules.add(lblCommencerUne);
		
		JLabel lblCommentGagnerAu = new JLabel("<html>Comment gagner au Trivial Pursuit : <br> Lorsque qu\u2019un des joueurs \u00E0 en sa possession les 6 triangles de couleur diff\u00E9rentes, il doit pour terminer la partie remonter vers la case au centre du jeu en sachant que l\u2019on ne peut remonter sur cette case qu\u2019en effectuant un nombre de d\u00E9placements correspondant exactement au lancer du d\u00E9. Quand le joueur se situe sur cette case, les joueurs adverses se concertent pour d\u00E9terminer la cat\u00E9gorie de votre derni\u00E8re question sans regarder l\u2019une des cartes. L\u2019int\u00E9r\u00EAt \u00E9tant bien entendu de s\u00E9lectionner la cat\u00E9gorie sur laquelle vous semblez avoir le plus de difficult\u00E9s. Si vous r\u00E9pondez correctement, f\u00E9licitations, vous venez de gagner! Si non vous passez votre tour et attendez le prochain.</html>");
		lblCommentGagnerAu.setBounds(51, 245, 675, 165);
		rules.add(lblCommentGagnerAu);
		
		JButton btnJouer = new JButton("Valider");
		btnJouer.setBounds(352, 435, 84, 25);
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "3");
            }
		});
		rules.add(btnJouer);
		gameboard.setLayout(null);
	    ///////fin du remplissage du jpanel rules /////////
		
	    ///////début du remplissage du jpanel gameboard /////////
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(316, 62, 69, 43);
		gameboard.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.RED);
		canvas_1.setBounds(562, 71, 100, 100);
		gameboard.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.GREEN);
		canvas_2.setBounds(131, 242, 201, 150);
		gameboard.add(canvas_2);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLUE);
		canvas_3.setBounds(626, 292, 100, 100);
		gameboard.add(canvas_3);
	    ///////fin du remplissage du jpanel gameboard /////////
   
        cardPanel.add(startscreen, "1");
        cardPanel.add(rules, "2");
        cardPanel.add(gameboard, "3");
        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    /*public static void main(String[] args) {
    	
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
    }*/
}