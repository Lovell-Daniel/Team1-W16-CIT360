package cit360.team1.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cit360.team1.model.Deck;
import cit360.team1.view.HomeView;

public class HomeController {
	private HomeView homeView;
	private Deck homeModel;
	
	public HomeController(HomeView homeView, Deck homeModel){
		this.homeView = homeView;
		this.homeModel = homeModel;
		
		this.homeView.addNewDeckListener(new NewDeckListener());
	}
	
	class NewDeckListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			// Instantiate a new Deck
			homeView.displayErrorMessage("New Deck Created.");
		}
		
	}
	
}
