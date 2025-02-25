package edu.guilford;

import java.util.Random;

public class Player {
    private Hand hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public void discardCard(Card card) {
        hand.removeCard(card);
    }

    public boolean decideToKnock() {
        // Decision-making logic for knocking
        int totalValue = hand.getTotalValue();
        return totalValue >= 31 || (totalValue >= 25 && hand.size() == 3); // Knock if value is 31 or high enough with 3 cards
    }

    public Card chooseCardToDiscard() {
        // Logic to choose a card to discard
        Card lowestCard = hand.getCard(0);
        for (int i = 1; i < hand.size(); i++) {
            Card currentCard = hand.getCard(i);
            if (currentCard.getRank().ordinal() < lowestCard.getRank().ordinal()) {
                lowestCard = currentCard; // Find the card with the lowest rank
            }
        }
        return lowestCard; // Discard the card with the lowest rank
    }
}
