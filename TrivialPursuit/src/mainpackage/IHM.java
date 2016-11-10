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
    private CardLayout cardLayout = new CardLayout();

    public IHM() {
        setTitle("TrivialPursuit");
        setSize(800, 800);
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
        rules.setLayout(null);
        gameboard.setLayout(null);

        /////// remplissage du jpanel startscreen /////////////////
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

	    /////// remplissage du jpanel rules /////////
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
		
		/////// remplissage du jpanel gameboard /////////
		Canvas canvas_0 = new Canvas();
		canvas_0.setBounds(72, 87, 70, 70);
		gameboard.add(canvas_0);
		canvas_0.setBackground(Color.ORANGE);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.GRAY);
		canvas_1.setBounds(266, 87, 70, 70);
		gameboard.add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.GREEN);
		canvas_2.setBounds(72, 155, 70, 70);
		gameboard.add(canvas_2);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLUE);
		canvas_3.setBounds(329, 87, 70, 70);
		gameboard.add(canvas_3);    
        
        Canvas canvas_4 = new Canvas();
        canvas_4.setBackground(Color.MAGENTA);
        canvas_4.setBounds(135, 87, 70, 70);
        gameboard.add(canvas_4);
        
        Canvas canvas_5 = new Canvas();
        canvas_5.setBackground(Color.YELLOW);
        canvas_5.setBounds(202, 87, 70, 70);
        gameboard.add(canvas_5);
        
        Canvas canvas_6 = new Canvas();
        canvas_6.setBackground(Color.GREEN);
        canvas_6.setBounds(397, 87, 70, 70);
        gameboard.add(canvas_6);
        
        Canvas canvas_7 = new Canvas();
        canvas_7.setBackground(Color.ORANGE);
        canvas_7.setBounds(466, 87, 70, 70);
        gameboard.add(canvas_7);
        
        Canvas canvas_8 = new Canvas();
        canvas_8.setBackground(Color.MAGENTA);
        canvas_8.setBounds(529, 87, 70, 70);
        gameboard.add(canvas_8);
        
        Canvas canvas_10 = new Canvas();
        canvas_10.setBackground(Color.GRAY);
        canvas_10.setBounds(660, 87, 70, 70);
        gameboard.add(canvas_10);
        
        Canvas canvas_9 = new Canvas();
        canvas_9.setBackground(Color.YELLOW);
        canvas_9.setBounds(596, 87, 70, 70);
        gameboard.add(canvas_9);
        
        Canvas canvas_11 = new Canvas();
        canvas_11.setBackground(Color.BLUE);
        canvas_11.setBounds(660, 155, 70, 70);
        gameboard.add(canvas_11);
        
        Canvas canvas_12 = new Canvas();
        canvas_12.setBackground(Color.GREEN);
        canvas_12.setBounds(660, 219, 70, 70);
        gameboard.add(canvas_12);
        
        Canvas canvas_13 = new Canvas();
        canvas_13.setBackground(Color.ORANGE);
        canvas_13.setBounds(660, 284, 70, 70);
        gameboard.add(canvas_13);
        
        Canvas canvas_14 = new Canvas();
        canvas_14.setBackground(Color.MAGENTA);
        canvas_14.setBounds(660, 349, 70, 70);
        gameboard.add(canvas_14);
        
        Canvas canvas_15 = new Canvas();
        canvas_15.setBackground(Color.YELLOW);
        canvas_15.setBounds(660, 413, 70, 70);
        gameboard.add(canvas_15);
        
        Canvas canvas_16 = new Canvas();
        canvas_16.setBackground(Color.GRAY);
        canvas_16.setBounds(660, 478, 70, 70);
        gameboard.add(canvas_16);
        
        Canvas canvas_17 = new Canvas();
        canvas_17.setBackground(Color.BLUE);
        canvas_17.setBounds(660, 543, 70, 70);
        gameboard.add(canvas_17);
        
        Canvas canvas_19 = new Canvas();
        canvas_19.setBackground(Color.ORANGE);
        canvas_19.setBounds(660, 670, 70, 70);
        gameboard.add(canvas_19);
        
        Canvas canvas_18 = new Canvas();
        canvas_18.setBackground(Color.GREEN);
        canvas_18.setBounds(660, 607, 70, 70);
        gameboard.add(canvas_18);
        
        Canvas canvas_20 = new Canvas();
        canvas_20.setBackground(Color.MAGENTA);
        canvas_20.setBounds(596, 670, 70, 70);
        gameboard.add(canvas_20);
        
        Canvas canvas_21 = new Canvas();
        canvas_21.setBackground(Color.YELLOW);
        canvas_21.setBounds(529, 670, 70, 70);
        gameboard.add(canvas_21);
        
        Canvas canvas_22 = new Canvas();
        canvas_22.setBackground(Color.GRAY);
        canvas_22.setBounds(466, 670, 70, 70);
        gameboard.add(canvas_22);
        
        Canvas canvas_23 = new Canvas();
        canvas_23.setBackground(Color.BLUE);
        canvas_23.setBounds(397, 670, 70, 70);
        gameboard.add(canvas_23);
        
        Canvas canvas_24 = new Canvas();
        canvas_24.setBackground(Color.GREEN);
        canvas_24.setBounds(329, 670, 70, 70);
        gameboard.add(canvas_24);
        
        Canvas canvas_25 = new Canvas();
        canvas_25.setBackground(Color.ORANGE);
        canvas_25.setBounds(266, 670, 70, 70);
        gameboard.add(canvas_25);
        
        Canvas canvas_26 = new Canvas();
        canvas_26.setBackground(Color.MAGENTA);
        canvas_26.setBounds(202, 670, 70, 70);
        gameboard.add(canvas_26);
        
        Canvas canvas_28 = new Canvas();
        canvas_28.setBackground(Color.GRAY);
        canvas_28.setBounds(72, 670, 70, 70);
        gameboard.add(canvas_28);
        
        Canvas canvas_27 = new Canvas();
        canvas_27.setBackground(Color.YELLOW);
        canvas_27.setBounds(135, 670, 70, 70);
        gameboard.add(canvas_27);
        
        Canvas canvas_29 = new Canvas();
        canvas_29.setBackground(Color.BLUE);
        canvas_29.setBounds(72, 607, 70, 70);
        gameboard.add(canvas_29);
        
        Canvas canvas_30 = new Canvas();
        canvas_30.setBackground(Color.GREEN);
        canvas_30.setBounds(72, 543, 70, 70);
        gameboard.add(canvas_30);
        
        Canvas canvas_31 = new Canvas();
        canvas_31.setBackground(Color.ORANGE);
        canvas_31.setBounds(72, 478, 70, 70);
        gameboard.add(canvas_31);
        
        Canvas canvas_32 = new Canvas();
        canvas_32.setBackground(Color.MAGENTA);
        canvas_32.setBounds(72, 413, 70, 70);
        gameboard.add(canvas_32);
        
        Canvas canvas_33 = new Canvas();
        canvas_33.setBackground(Color.YELLOW);
        canvas_33.setBounds(72, 349, 70, 70);
        gameboard.add(canvas_33);
        
        Canvas canvas_34 = new Canvas();
        canvas_34.setBackground(Color.GRAY);
        canvas_34.setBounds(72, 284, 70, 70);
        gameboard.add(canvas_34);
        
        Canvas canvas_35 = new Canvas();
        canvas_35.setBackground(Color.BLUE);
        canvas_35.setBounds(72, 219, 70, 70);
        gameboard.add(canvas_35);
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        ///////fin du remplissage du jpanel gameboard /////////
        
        cardPanel.add(startscreen, "1");
        cardPanel.add(rules, "2");
        cardPanel.add(gameboard, "3");
    }
}