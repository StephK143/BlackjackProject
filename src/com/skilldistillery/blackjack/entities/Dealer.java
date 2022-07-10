package com.skilldistillery.blackjack.entities;

public class Dealer extends Gambler {
	private BlackJackHand dealerHand = new BlackJackHand();
	private Deck deck = new Deck();
	private Card cards;

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
		System.out.println("\nThe player's hand is " + player.getHand().getCards() + ". The total of which is " + player.getHand().getHandValue());		
		
	}
	
	public void dealerShowsHand(Gambler player) {
		System.out.println("The dealer shows his second card. Dealer has " + player.getHand().getCards() + ". The total of which is " + player.getHand().getHandValue());
	}
	
	public String dealerShowsOneCardUp(Gambler player) {
		String dealerCard = "";
		
		for (int i = 1; i < player.getHand().getCards().size(); i++) {
			dealerCard += player.getHand().getCards().get(i);
			
		}
		System.out.println("Dealer has one card face down and a " + dealerCard + " showing.");
		return dealerCard;
	}
//	public void showDealersOneCard(String dealerCard) {
//		
//		System.out.println("Dealer has one card face down and a " + dealerCard + " showing.");
//	}

//	public void dealCardsFaceDown(Gambler player) {
//		player.addCard(deck.dealCard());
//		dealerHasOneFaceDown();
//
//	}

	public Hand getHand() {
		return dealerHand;
	}
	


//	@Override
//	public String toString() {
//		return "Dealer [dealerHand=" + dealerHand + ", cards=" + cards + "]";
//	
//	}

//	@Override
//	public String toString() {
//		return "Dealer [dealerHand=" + dealerHand + "]";
//	}
	

}
