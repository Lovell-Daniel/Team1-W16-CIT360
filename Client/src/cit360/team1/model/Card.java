package cit360.team1.model;


public class Card {

	private int cardId;
	private int deckId;
	private String cardTitle;
	private String sideOne;
	private String sideTwo;
	private Boolean readFlag;
	

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
	public String getCardTitle() {
		return cardTitle;
	}
	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
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
	public Boolean getReadFlag(){
		return this.readFlag;
	}
	public void setReadFlag(Boolean readFlag){
		this.readFlag = readFlag;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", deckId=" + deckId + ", cardTitle=" + cardTitle + ", sideOne=" + sideOne
				+ ", sideTwo=" + sideTwo + ", readFlag=" + readFlag + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardId;
		result = prime * result + ((cardTitle == null) ? 0 : cardTitle.hashCode());
		result = prime * result + deckId;
		result = prime * result + ((readFlag == null) ? 0 : readFlag.hashCode());
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
		if (cardTitle == null) {
			if (other.cardTitle != null)
				return false;
		} else if (!cardTitle.equals(other.cardTitle))
			return false;
		if (deckId != other.deckId)
			return false;
		if (readFlag == null) {
			if (other.readFlag != null)
				return false;
		} else if (!readFlag.equals(other.readFlag))
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
}
