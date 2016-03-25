package cit360.team1.model;

public class Card {

	private int cardId;
	private int deckId;
	private String sideOne;
	private String sideTwo;
	
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getDeckId() {
		return deckId;
	}
	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}
	public String getSideOne() {
		return sideOne;
	}
	public void setSideOne(String sideOne) {
		this.sideOne = sideOne;
	}
	public String getSideTwo() {
		return sideTwo;
	}
	public void setSideTwo(String sideTwo) {
		this.sideTwo = sideTwo;
	}
	
	public Card() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardId;
		result = prime * result + deckId;
		result = prime * result + ((sideOne == null) ? 0 : sideOne.hashCode());
		result = prime * result + ((sideTwo == null) ? 0 : sideTwo.hashCode());
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
		Card other = (Card) obj;
		if (cardId != other.cardId)
			return false;
		if (deckId != other.deckId)
			return false;
		if (sideOne == null) {
			if (other.sideOne != null)
				return false;
		} else if (!sideOne.equals(other.sideOne))
			return false;
		if (sideTwo == null) {
			if (other.sideTwo != null)
				return false;
		} else if (!sideTwo.equals(other.sideTwo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", deckId=" + deckId + ", sideOne=" + sideOne + ", sideTwo=" + sideTwo + "]";
	}
	
	
	
}
