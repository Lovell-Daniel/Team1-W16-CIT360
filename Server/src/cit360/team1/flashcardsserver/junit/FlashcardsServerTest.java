/*package cit360.team1.flashcardsserver.junit;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import cit360.team1.flashcardsserver.controller.*;
import cit360.team1.flashcardsserver.dao.*;
import cit360.team1.flashcardsserver.model.Deck;

public class FlashcardsServerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		DeckDAO deckDAO = new DeckDAO();
		String expectedValue = "";
		
		try {
			List<Deck> decks = deckDAO.getDecks();
			assertEquals(expectedValue, "string");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
*/