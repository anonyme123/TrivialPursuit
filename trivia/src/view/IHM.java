package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.*;

import model.Coord;
import model.Joueur;
import controller.Game;



public class IHM extends JFrame implements Observer, MouseListener, MouseMotionListener {
	String jeu_trivia;
	private Game game;
	Dimension dim;
	Coord coordDep;
	Coord coordArr;

	private JLayeredPane layeredPane;
	private JPanel triviaBoard;
	private JLabel pion;
	private int xAdjustment;
	private int yAdjustment;
    private static final long serialVersionUID = 1L;
    private JPanel cardPanel, startscreen, rules, gameboard;
    private CardLayout cardLayout = new CardLayout();
    
    /**
     * La zone d'affichagedu résultat du dé
     */
    JTextArea txtResultatDe;
    public void setTexteResultatDe(int resultatDe) {
		this.txtResultatDe.setText("Vous avez \n fait :\n " + resultatDe);
	}

	public IHM(Dimension dim) {
		game = new Game();
		game.addObserver(this);
		
    setTitle("TrivialPursuit");
    this.dim = dim;

    setSize(700, 725);
    setResizable(false);
    try {
			setIconImage(ImageIO.read(new File("ressources/appicon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
   
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        startscreen = new JPanel();
        rules = new JPanel();
        startscreen.setLayout(null);
        startscreen.setBackground(Color.white);
        rules.setLayout(null);
        
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(dim);
        layeredPane.addMouseListener(this);
        layeredPane.addMouseMotionListener(this);
        gameboard = new JPanel();
        layeredPane.add(gameboard, JLayeredPane.DEFAULT_LAYER);
        gameboard.setLayout(new GridLayout(9, 7));
        gameboard.setPreferredSize(this.dim);
        gameboard.setBounds(0, 0, this.dim.width, this.dim.height);

        /////// remplissage du jpanel startscreen /////////////////
        JLabel lblTitle = new JLabel("Trivial Pursuit");
        lblTitle.setBounds(186, 40, 239, 42);
		    lblTitle.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		    startscreen.add(lblTitle);
		
        JLabel picLabel = new JLabel(new ImageIcon("ressources/gameicon.jpg"));
        picLabel.setLocation(186, 115);
        picLabel.setSize(292, 283);
        startscreen.add(picLabel);

        final TextField joueur1 = new TextField();
        joueur1.setBounds(53, 106, 69, 19);
        joueur1.setText("Joueur 1");
        startscreen.add(joueur1);

        final TextField joueur2 = new TextField();
        joueur2.setBounds(53, 141, 69, 19);
        joueur2.setText("Joueur 2");
        startscreen.add(joueur2);
		
        final TextField joueur3 = new TextField();
        joueur3.setBounds(53, 179, 69, 19);
        joueur3.setText("Joueur 3");
        startscreen.add(joueur3);

        final TextField joueur4 = new TextField();
        joueur4.setBounds(53, 214, 69, 19);
        joueur4.setText("Joueur 4");
        startscreen.add(joueur4);

        final TextField joueur5 = new TextField();
        joueur5.setBounds(53, 252, 69, 19);
        joueur5.setText("Joueur 5");
        startscreen.add(joueur5);

        final TextField joueur6 = new TextField();
        joueur6.setBounds(53, 291, 69, 19);
        joueur6.setText("Joueur 6");
        startscreen.add(joueur6);

        JButton btnValider = new JButton("Valider");
        btnValider.setBounds(249, 466, 84, 25);
        btnValider.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Game.initJoueurs(joueur1.getText(), joueur2.getText(), joueur3.getText(), joueur4.getText(), joueur5.getText(), joueur6.getText());
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

				Object anchor = null;
				//appel à update
				update(null, anchor);
                cardLayout.show(cardPanel, "3");
            }
		});
		rules.add(btnJouer);
		
		
        
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        cardPanel.add(startscreen, "1");
        cardPanel.add(rules, "2");
        cardPanel.add(layeredPane, "3");
    }

	public void mousePressed(MouseEvent e) {
        pion = null;
 
        this.coordDep = new Coord(e.getX() * 7 / dim.width, e.getY() * 9 / dim.height);       
        Component c = gameboard.findComponentAt(e.getX(), e.getY());
        
        if (c instanceof JLabel) {
        	Point parentLocation = c.getParent().getLocation();
            xAdjustment = parentLocation.x - e.getX();
            yAdjustment = parentLocation.y - e.getY();
            pion = (JLabel) c;
            
            // TODO mémoriser point d edépart (pour reset évntuel si !isMoveOk)
            
            pion.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
            pion.setSize(pion.getWidth(), pion.getHeight());
            layeredPane.add(pion, JLayeredPane.DRAG_LAYER);
        }
 
    }

    //Move the piece around
    public void mouseDragged(MouseEvent me) {
        if (pion == null) {
            return;
        }
        pion.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
        setVisible(true);
    }

    //Drop the piece back onto the board
    public void mouseReleased(MouseEvent e) {
        if (pion == null) {
        	System.out.println("pas de pion (sic)");
            return;
        }
        this.coordArr = new Coord(e.getX() * 7 / dim.width, e.getY() * 9 / dim.height);
        System.out.println(coordArr.x);
        System.out.println(coordArr.y);
        // FIXME 
        boolean moveOk = game.move(coordArr);
//       if (moveOk) {
//        	// TODO le mettre au bon endroit (coordArr)
//    	   
//       } else {
//    	   	// TODO le remettre aux cood de départ
//       }
    	   pion.setVisible(false);
    	   
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
    
       
	@Override
	public void update(Observable o, Object arg) {
		gameboard.removeAll();
		/////// remplissage du jpanel gameboard, a déplacer dans une nouvelle classe parce que c'est moche!!!! Si vous avez le temps  ///////
		
		for (int i = 1; i <= 63; i++) {
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
			    JLabel label = new JLabel(new ImageIcon("ressources/musique.jpg"));
			    square.add(label);
			    //TODO essayer qqch
			    /*Image background = Toolkit.getDefaultToolkit().createImage("ressources/musique.jpg");
			    square.drawImage(background, 0, 0, null);*/
			}
			if (i==7){
				ImageIcon imageIcon = new ImageIcon("ressources/geek.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==22){
				ImageIcon imageIcon = new ImageIcon("ressources/histoire.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==28){
				ImageIcon imageIcon = new ImageIcon("ressources/sport.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==43){
				ImageIcon imageIcon = new ImageIcon("ressources/lyon.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if (i==49){
				ImageIcon imageIcon = new ImageIcon("ressources/voyage.jpg");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			
			//Parcours la liste de joueurs à l'envers pour afficher les images des pions
			Collections.reverse(Game.getListeJoueurs());
			for(Joueur j: Game.getListeJoueurs()) {
				if(i == 25) {
				//	System.out.println(j.getPion().getCouleur());
					ImageIcon imageIcon = new ImageIcon("ressources/"+j.getPion().getCouleur()+".png");
				    JLabel label = new JLabel(imageIcon);
				    square.add(label);
				    
				    
				}
		
				// Affiche les pions en dessous du plateau + le texte pour savoir le nb camemeberts
			if (i==50){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Rouge.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==51){
				JTextArea area = new JTextArea();
				area.setBackground(Color.RED);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
			if (i==52){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Orange.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==53){
				JTextArea area = new JTextArea();
				area.setBackground(Color.ORANGE);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
			
			if (i==54){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Jaune.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==55){
				JTextArea area = new JTextArea();
				area.setBackground(Color.YELLOW);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
			if (i==57){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Bleu.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==58){
				JTextArea area = new JTextArea();
				area.setBackground(Color.BLUE);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
			if (i==59){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Vert.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==60){
				JTextArea area = new JTextArea();
				area.setBackground(Color.GREEN);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
			if (i==61){
				
				ImageIcon imageIcon = new ImageIcon("ressources/Violet.png");
			    JLabel label = new JLabel(imageIcon);
			    square.add(label);
			}
			if(i==62){
				JTextArea area = new JTextArea();
				area.setBackground(Color.PINK);
				area.setFont(new Font("ComicSansMS", Font.ITALIC,14));
				area.append("Vous avez\n"+ j.getNb_camembert()+ " Camemberts");
				square.add(area);
			}
		
		}
			
			//Bouton Lancé Dé
			if(i==63){
			JButton boutonDe = new JButton("Lancer le Dé");
			boutonDe.setBounds(300, 47, 238, 300);
			boutonDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// int resultatDe = Game.De();
					int resultatDe = Game.jeu.getJoueurActif().lancerDe();
					setTexteResultatDe(resultatDe);
				}});
			square.add(boutonDe);
			}
			
			//JtextArea se met à jours a chaque fois qu'on relance le dé, ce
			//Jtextarea est déclaré au début de la classe
			if(i==56){
			    txtResultatDe = new JTextArea();
				//txtResultatDe.append();
				square.add(txtResultatDe);
			}
		}	
        ///////fin du remplissage du jpanel gameboard /////////
		gameboard.validate();
        gameboard.repaint();
	}
}