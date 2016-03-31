package cit360.team1.model;

import java.util.Set;

import cit360.team1.model.Card;
import cit360.team1.model.Deck;


public class Deck {
	private int deckId;
	private String deckName;
	private Set<Card> cards;
	
	public Deck(){
		
	}
	
	public int getDeckId() {
		return deckId;
	}
	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}
	public String getDeckName() {
		return deckName;
	}
	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}
	public Set<Card> getCards() {
		return this.cards;
	}
	
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Deck [deckId=" + deckId + ", deckName=" + deckName + ", cards=" + cards + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
		result = prime * result + deckId;
		result = prime * result + ((deckName == null) ? 0 : deckName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deck other = (Deck) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		if (deckId != other.deckId)
			return false;
		if (deckName == null) {
			if (other.deckName != null)
				return false;
		} else if (!deckName.equals(other.deckName))
			return false;
		return true;
	}
}
