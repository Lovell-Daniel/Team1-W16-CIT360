package cit360.team1.view;

import java.awt.event.ActionListener;
import javax.swing.*;

import cit360.team1.model.Deck;

public class HomeView extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Deck theDeck;
	
	// Declare component variables
	private JButton newDeckButton = new JButton("New Deck");
	private JComboBox deckSelectComboBox = new JComboBox();
	
	public HomeView(){
		JPanel homePanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		
		homePanel.add(newDeckButton);
		homePanel.add(deckSelectComboBox);
		
		this.add(homePanel);
	}
	
	public void addNewDeckListener(ActionListener listenForNewDeck) {
		newDeckButton.addActionListener(listenForNewDeck);
	}
	
	public void addSelectDeckListener(ActionListener listenForSelectDeck) {
		
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
