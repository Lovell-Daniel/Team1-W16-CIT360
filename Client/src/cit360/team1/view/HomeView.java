package cit360.team1.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import cit360.team1.model.Deck;

public class HomeView extends javax.swing.JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Deck theDeck;
	
	//test arrayList
	private ArrayList<String> testList = new ArrayList<>();
	private String[] testArray;
	
	// Declare component variables
	private JLabel appTitleLabel = new JLabel("Flashcard App");
	private JLabel deckNameLabel = new JLabel("New Deck Name: ");
	private JTextField deckNameText = new JTextField(20);
	private JButton newDeckButton = new JButton("Create New Deck");
	private JLabel deckSelectLabel = new JLabel("Select Existing Deck: ");
	private JComboBox deckSelectComboBox = new JComboBox();
	private DefaultComboBoxModel boxModel;
	private JLabel statusBarLabel = new JLabel("Status: ");
	
	public HomeView(){
		// test data
		testList.add("Deck 1");
		testList.add("Deck 2");
		testList.add("Deck 3");
		
		testArray = testList.toArray(new String[testList.size()]);
		
		// set combo box data
		boxModel = new DefaultComboBoxModel(testArray);
		deckSelectComboBox.setModel(boxModel);
		
		JPanel homePanel = new JPanel(new BorderLayout());
		JPanel newDeckPanel = new JPanel(new BorderLayout());
		JPanel selectDeckPanel = new JPanel(new BorderLayout());
		JPanel contentPanel = new JPanel(new BorderLayout());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		
		newDeckPanel.add(deckNameLabel, BorderLayout.LINE_START);
		newDeckPanel.add(deckNameText, BorderLayout.CENTER);
		newDeckPanel.add(newDeckButton, BorderLayout.LINE_END);
		newDeckPanel.setBorder(new EmptyBorder(10,10,10,10));
		
		selectDeckPanel.add(deckSelectLabel, BorderLayout.LINE_START);
		selectDeckPanel.add(deckSelectComboBox, BorderLayout.CENTER);
		selectDeckPanel.setBorder(new EmptyBorder(10,10,10,10));
		
		contentPanel.add(newDeckPanel, BorderLayout.PAGE_START);
		contentPanel.add(selectDeckPanel, BorderLayout.PAGE_END);
		contentPanel.setBorder(new EmptyBorder(10,10,10,10));
		
		homePanel.add(appTitleLabel, BorderLayout.PAGE_START);
		homePanel.add(contentPanel, BorderLayout.CENTER);
		homePanel.add(statusBarLabel, BorderLayout.PAGE_END);
		homePanel.setBorder(new EmptyBorder(10,10,10,10));
		
		this.add(homePanel);
		this.pack();
		this.setLocationRelativeTo(null);
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
