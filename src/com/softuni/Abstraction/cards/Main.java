package com.softuni.Abstraction.cards;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits: ");
//        for (CardSuits cardSuit : CardSuits.values()){
//            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
//        }

//        System.out.println("Card Ranks: ");
//        for(CardRanks cardRank : CardRanks.values()){
//            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRank.ordinal(), cardRank.name());
//        }

        Scanner scanner = new Scanner(System.in);
        CardRanks cardRank = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardSuit, cardRank);
        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, card.getPower());
    }
}
