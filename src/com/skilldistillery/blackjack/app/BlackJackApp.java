package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackPlayer;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Gambler;

public class BlackJackApp {

	Deck deck = new Deck();
	List<Card> newDeck = new ArrayList<>();
	Dealer dealer = new Dealer();
	Gambler dealerPlaysHisHand = new BlackJackPlayer();
	Gambler gambler = new BlackJackPlayer();
	Scanner kb = new Scanner(System.in);
//	String dealersOneCard = "";

	int numCards = 0;

	public static void main(String[] args) {

		BlackJackApp app = new BlackJackApp();

		app.playBlackJack();
	}

	public void playBlackJack() {
		intro();
		dealer.getNewDeck().shuffle();
		dealer.dealCards(gambler);
		dealer.dealCards(dealerPlaysHisHand);
		dealer.dealCards(gambler);
		dealer.dealCards(dealerPlaysHisHand);

		dealer.showGamblersHand(gambler);
		dealer.dealerShowsOneCardUp(dealerPlaysHisHand);
		checkHandValue();
		gamblerPlaysHand();

		dealerDrawRules();

		announceWinner();
	}

	public void gamblerPlaysHand() {
		int playersChoice = 1;

		while (playersChoice == 1) {
			System.out.println("Press 1 if you would like to hit or press 2 to stand?");
			playersChoice = kb.nextInt();

			switch (playersChoice) {
			case 1:
				gambler.addCard(deck.dealCard());
				System.out.println("Card dealt...");
				System.out.println("Your hand is now " + gambler.getHand() + ". Your total is now "
						+ gambler.getHand().getHandValue());
				checkHandValue();
				break;
			case 2:
				System.out.println("You have choosen to stand with " + gambler.getHand().getHandValue());
				break;
			default:
				System.out.println("That is not a valid entry");
				break;
			}
		}
	}

	public void checkHandValue() {

		while (gambler.getHand().getHandValue() > 21) {
			System.out.println("You busted! Please play again");
			break;
		}
		while (gambler.getHand().getHandValue() == 21) {
			System.out.println("You have 21!!");
			break;

		}
		while (gambler.getHand().getHandValue() == 21) {

			System.out.println("Your hand is now " + gambler.getHand() + ". Your total is now "
					+ gambler.getHand().getHandValue());

		}

	}

	public void displayHand(List<Card> hand) {
		for (Card card : hand) {

		}
		System.out.println(hand);

	}
//	public String showOneCard() {
//	String hiddenCard = "Hidden card " + cards.get(0).toString();
//	return hiddenCard;
//}

	public void dealerDrawRules() {
		dealer.dealerShowsHand(dealerPlaysHisHand);

		while (dealerPlaysHisHand.getHand().getHandValue() < 17) {
			System.out.println("Dealer must hit with " + dealerPlaysHisHand.getHand().getHandValue());
			dealer.dealCards(dealerPlaysHisHand);
			System.out.println("The dealer now has " + dealerPlaysHisHand.getHand().getCards()
					+ ". The total of which is " + dealerPlaysHisHand.getHand().getHandValue());

		}

	}

	public void intro() {
		System.out.println("Welcome to our Casino in the Sky!");

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
	// if (player.getHand() instanceof BlackJack &&
	// ((BlackJackHand)(Player.getHand())).isBust{

}
