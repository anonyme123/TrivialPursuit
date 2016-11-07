import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JTextArea;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Toolkit;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Graphic {

	private JFrame frmTrivialPursuit;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graphic window = new Graphic();
					window.frmTrivialPursuit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Graphic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrivialPursuit = new JFrame();
		frmTrivialPursuit.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\CPE\\Info\\Projet GL\\Trivial_Pursuit\\index.jpg"));
		frmTrivialPursuit.setBackground(Color.RED);
		frmTrivialPursuit.setFont(new Font("Bodoni MT Condensed", Font.PLAIN, 18));
		frmTrivialPursuit.setForeground(Color.ORANGE);
		frmTrivialPursuit.setTitle("Trivial Pursuit");
		frmTrivialPursuit.setBounds(100, 100, 450, 300);
		frmTrivialPursuit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrivialPursuit.setSize(new Dimension (600, 400));
		frmTrivialPursuit.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmTrivialPursuit.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		TextField textField = new TextField();
		textField.setText("Joueur 6");
		textField.setBounds(34, 197, 70, 22);
		panel.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setText("Joueur 1");
		textField_1.setBounds(66, 112, 70, 22);
		panel.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setText("Joueur 5");
		textField_2.setBounds(66, 274, 70, 22);
		panel.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setText("Joueur 2");
		textField_3.setBounds(392, 87, 70, 22);
		panel.add(textField_3);
		
		TextField textField_4 = new TextField();
		textField_4.setText("Joueur 3");
		textField_4.setBounds(423, 172, 70, 22);
		panel.add(textField_4);
		
		TextField textField_5 = new TextField();
		textField_5.setText("Joueur 4");
		textField_5.setBounds(404, 254, 70, 22);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//frmTrivialPursuit.setVisible(false);
				frmTrivialPursuit.dispose();
				new Game();
			}
		});
		btnNewButton.setBounds(454, 323, 113, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\uuuut.jpg"));
		lblNewLabel.setBounds(142, 87, 256, 256);
		panel.add(lblNewLabel);
		
		JLabel lblTrivialPursuit = new JLabel("Trivial Pursuit");
		lblTrivialPursuit.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 35));
		lblTrivialPursuit.setBounds(158, 11, 228, 43);
		panel.add(lblTrivialPursuit);
	}
}
