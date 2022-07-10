package com.skilldistillery.blackjack.entities;

public class Dealer extends Gambler {
	private BlackJackHand dealerHand = new BlackJackHand();
	private Deck deck = new Deck();

	public Deck getNewDeck() {
		deck.createDeck();
		return deck;
	}

	public void dealerShuffle() {
		deck.shuffle();
	}

	public void dealCards(Gambler player) {
		player.addCard(deck.dealCard());
		System.out.print("Card dealt...");

	}

	public void showGamblersHand(Gambler player) {
		System.out.println("\nThe player's hand is \n" + player.getHand().getCards() + "The total of which is "
				+ player.getHand().getHandValue());
		System.out.println();

	}

	public void dealerShowsHand(Gambler player) {
		System.out.println("The dealer shows his second card. Dealer has " + player.getHand().getCards()
				+ "The total of which is " + player.getHand().getHandValue());
	}

	public String dealerShowsOneCardUp(Gambler player) {

		String dealerCard = "";

		for (int i = 1; i < player.getHand().getCards().size(); i++) {
			dealerCard += player.getHand().getCards().get(i);

		}
		System.out.println("Dealer has one card face down and a " + dealerCard + " face up.");
		return dealerCard;
	}

	public Hand getHand() {
		return dealerHand;
	}

}
