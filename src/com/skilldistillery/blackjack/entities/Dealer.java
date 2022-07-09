package com.skilldistillery.blackjack.entities;

public class Dealer {
	private BlackJackHand dealerHand = new BlackJackHand();
	private Deck deck = new Deck();

	public void getNewDeck() {
		deck.createDeck();
	}

	public Hand getHand() {
		return dealerHand;
	}

}
