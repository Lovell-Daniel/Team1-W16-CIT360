package cit360.team1.flashcardclient;

import cit360.team1.controller.HomeController;
import cit360.team1.model.Deck;
import cit360.team1.view.HomeView;

public class FlashcardClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeView homeView = new HomeView();
		Deck theModel = new Deck();
		
		HomeController homeController = new HomeController(homeView, theModel);
		
		homeView.setVisible(true);
		
		
	}

}
