package edu.towson.cis.cosc603.project2.monopoly;


import java.util.ArrayList;

public class GameBoardProduct2 {
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	public ArrayList<Card> getCommunityChestCards() {
		return communityChestCards;
	}

	/**
	* Draw cc card.
	* @return  the card
	*/
	public Card drawCCCard(GameBoard gameBoard) {
		Card card = (Card) communityChestCards.get(0);
		communityChestCards.remove(0);
		gameBoard.addCard(card);
		return card;
	}

	/**
	* Removes the cards.
	*/
	public void removeCards() {
		communityChestCards.clear();
	}
}