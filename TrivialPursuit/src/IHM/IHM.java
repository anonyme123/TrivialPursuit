package IHM;
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
    private CardLayout cardLayout = new CardLayout();

    public IHM() {
        setTitle("TrivialPursuit");
        setSize(600, 600);
        setResizable(false);
        try {
			setIconImage(ImageIO.read(new File("src/appicon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
   
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        startscreen = new JPanel();
        rules = new JPanel();
        gameboard = new JPanel();
        startscreen.setLayout(null);
        startscreen.setBackground(Color.white);
        rules.setLayout(null);
        gameboard.setLayout(new GridLayout(7, 7));

        /////// remplissage du jpanel startscreen /////////////////
        JLabel lblTitle = new JLabel("Trivial Pursuit");
        lblTitle.setBounds(186, 40, 239, 42);
		lblTitle.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		startscreen.add(lblTitle);
		
		JLabel picLabel = new JLabel(new ImageIcon("src/gameicon.jpg"));
		picLabel.setLocation(186, 115);
		picLabel.setSize(292, 283);
		startscreen.add(picLabel);
		
		TextField joueur1 = new TextField();
		joueur1.setBounds(53, 106, 69, 19);
		joueur1.setText("Joueur 1");
		startscreen.add(joueur1);
		
		TextField joueur2 = new TextField();
		joueur2.setBounds(53, 141, 69, 19);
		joueur2.setText("Joueur 2");
		startscreen.add(joueur2);
		
		TextField joueur3 = new TextField();
		joueur3.setBounds(53, 179, 69, 19);
		joueur3.setText("Joueur 3");
		startscreen.add(joueur3);
		
		TextField joueur4 = new TextField();
		joueur4.setBounds(53, 214, 69, 19);
		joueur4.setText("Joueur 4");
		startscreen.add(joueur4);
		
		TextField joueur5 = new TextField();
		joueur5.setBounds(53, 252, 69, 19);
		joueur5.setText("Joueur 5");
		startscreen.add(joueur5);
		
		TextField joueur6 = new TextField();
		joueur6.setBounds(53, 291, 69, 19);
		joueur6.setText("Joueur 6");
		startscreen.add(joueur6);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(249, 466, 84, 25);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "2");
            }
		});
		startscreen.add(btnValider);

	    /////// remplissage du jpanel rules /////////
		JLabel lblRglesDuJeu = new JLabel("R\u00E8gles du jeu");
		lblRglesDuJeu.setBounds(181, 47, 238, 42);
		lblRglesDuJeu.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		rules.add(lblRglesDuJeu);
		
		JLabel lblCommencerUne = new JLabel("<html>Commencer une partie de Trivial Pursuit : <br>Tout d\u2019abord, chaque joueur doit placer au centre du plateau son camembert respectif. Le premier joueur lance le d\u00E9 et avance son pion d\u2019autant de cases dans la direction qu\u2019il souhaite. Le joueur de gauche pioche alors une carte et lui pose la question correspondant \u00E0 la couleur sur lequel se trouve son pion. Si le joueur r\u00E9pond correctement, il peut rejouer. Si non, il passe son tour. Dans le cas ou son camembert se trouve sur l\u2019une des 6 cases \u00AB Quartier G\u00E9n\u00E9ral \u00BB et qu\u2019il r\u00E9pond correctement, il peut ins\u00E9rer dans son camembert le triangle correspondant et rejouer. </html>");
		lblCommencerUne.setBounds(24, 101, 550, 169);
		rules.add(lblCommencerUne);
		
		JLabel lblCommentGagnerAu = new JLabel("<html>Comment gagner au Trivial Pursuit : <br> Lorsque qu\u2019un des joueurs \u00E0 en sa possession les 6 triangles de couleur diff\u00E9rentes, il doit pour terminer la partie remonter vers la case au centre du jeu en sachant que l\u2019on ne peut remonter sur cette case qu\u2019en effectuant un nombre de d\u00E9placements correspondant exactement au lancer du d\u00E9. Quand le joueur se situe sur cette case, les joueurs adverses se concertent pour d\u00E9terminer la cat\u00E9gorie de votre derni\u00E8re question sans regarder l\u2019une des cartes. L\u2019int\u00E9r\u00EAt \u00E9tant bien entendu de s\u00E9lectionner la cat\u00E9gorie sur laquelle vous semblez avoir le plus de difficult\u00E9s. Si vous r\u00E9pondez correctement, f\u00E9licitations, vous venez de gagner! Si non vous passez votre tour et attendez le prochain.</html>");
		lblCommentGagnerAu.setBounds(24, 300, 550, 165);
		rules.add(lblCommentGagnerAu);
		
		JButton btnJouer = new JButton("Valider");
		btnJouer.setBounds(249, 516, 84, 25);
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "3");
            }
		});
		rules.add(btnJouer);
		
		/////// remplissage du jpanel gameboard ///////
		
		for (int i = 1; i <= 49; i++) {
			JPanel square = new JPanel( new BorderLayout() );
			gameboard.add( square );
			
			if (i==1 || i==15 || i==26 || i==39 || i==42) square.setBackground(new Color(255,91,43)); //orange
			if (i==2 || i==11 || i==24 || i==44 || i==49) square.setBackground(new Color(51,104,212)); //bleu
			if (i==3 || i==14 || i==18 || i==23 || i==43 || i==48) square.setBackground(new Color(87,208,68)); //vert
			if (i==4 || i==7 || i==36 || i==47 || i==21) square.setBackground(new Color(233,61,96)); //rouge
			if (i==5 || i==28 || i==29 || i==46 || i==8) square.setBackground(new Color(177,72,185)); //violet
			if (i==6 || i==22 || i==27 || i==32 || i==35 || i==45) square.setBackground(new Color(249,254,107)); //jaune
			
			if (i==25) square.setBackground(Color.black); //case du milieu
			
			/////// cases camemberts ///////
			if (i==1){
				ImageIcon imageIcon = new ImageIcon("src/musique.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==7){
				ImageIcon imageIcon = new ImageIcon("src/geek.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==22){
				ImageIcon imageIcon = new ImageIcon("src/histoire.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==28){
				ImageIcon imageIcon = new ImageIcon("src/sport.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==43){
				ImageIcon imageIcon = new ImageIcon("src/lyon.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==49){
				ImageIcon imageIcon = new ImageIcon("src/voyage.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
		}	
        ///////fin du remplissage du jpanel gameboard /////////
        
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        cardPanel.add(startscreen, "1");
        cardPanel.add(rules, "2");
        cardPanel.add(gameboard, "3");
    }
}