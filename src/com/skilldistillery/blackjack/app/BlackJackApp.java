package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Gambler;

public class BlackJackApp {

	Deck deck = new Deck();
	List<Card> card = new ArrayList<>();
	Dealer dealer = new Dealer();
	Gambler gambler = new Gambler();
	Scanner kb = new Scanner(System.in);

	int numCards = 0;

	public static void main(String[] args) {

		BlackJackApp app = new BlackJackApp();

		app.playBlackJack();
	}

	public void playBlackJack() {
		intro();
		dealer.getNewDeck();
		deck.shuffle();
		gambler.getHand();
		dealer.getHand();
		dealerDrawRules();
		displayHand(card);
		announceWinner();
	}

	public void displayHand(List<Card> hand) {
		for (Card card : hand) {

		}
		System.out.println(hand);

	}

	public void dealerDrawRules() {

	}

	public void intro() {
		System.out.println("Welcome to Casino in the Sky!");

	}

	public List<Card> cardsLeftInTheDeck(int howMany, Deck deck) {
		List<Card> dealtCards = new ArrayList<>();
		for (int cardNum = 0; cardNum < howMany; cardNum++) {
			dealtCards.add(deck.dealCard());

		}
		System.out.println(dealtCards);
		return dealtCards;
	}

	public void announceWinner() {

	}
}
