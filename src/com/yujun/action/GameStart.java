package com.yujun.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.yujun.Config.Card;
import com.yujun.Config.Player;

public class GameStart {

	public GameStart() {
	}

	/*
	 * ·¢ÅÆ
	 */
	public List<Player> deal(List<Player> playerList, List<Card> cardList) {
		List<Card> cards1 = new ArrayList<Card>();
		List<Card> cards2 = new ArrayList<Card>();
		;
		for (int i = 0; i < 4; i++) {
			cards1.add(cardList.get(i++));
			cards2.add(cardList.get(i));
		}
		playerList.get(0).setCards(cards1);
		playerList.get(1).setCards(cards2);
		return playerList;
	}

	public static void main(String[] args) {
		GameStart game = new GameStart();
		MakeCard pokerCard = new MakeCard();
		List<Card> cardList = pokerCard.make();

		System.out.println("--------ÕıÔÚÏ´ÅÆ--------");
		Collections.shuffle(cardList);// Ï´ÅÆ
		System.out.println("--------Ï´ÅÆÍê±Ï--------");
		// for (Card str : cardList) {
		// System.out.println(str.getFlower() + str.getNumber());
		// }

		MakePlayer players = new MakePlayer();
		List<Player> playerList = players.setUp();
		playerList = game.deal(playerList, cardList);

		for (int i = 0; i < 2; i++) {
			System.out.print("ID:" + playerList.get(i).getId() + "  ĞÕÃû£º"
					+ playerList.get(i).getName() + ":");
			for (int j = 0; j < 2; j++) {
				System.out.print("  "
						+ playerList.get(i).getCards().get(j).getFlower()
						+ playerList.get(i).getCards().get(j).getNumber());
			}
			System.out.println("");
		}

		int[] max = new int[2];
		int a = 0, b = 0;
		String aa, bb;
		for (int i = 0; i < 2; i++) {
			a = game.compare(playerList, i, 0);
			b = game.compare(playerList, i, 1);
			if (a > b) {
				max[i] = 0;
			} else if (a < b) {
				max[i] = 1;
			} else {
				aa = playerList.get(i).getCards().get(0).getFlower();
				bb = playerList.get(i).getCards().get(1).getFlower();
				if (aa == "ºÚÌÒ") {
					max[i] = 0;
				} else if (bb == "ºÚÌÒ") {
					max[i] = 1;
				} else if (aa == "ºìÌÒ") {
					max[i] = 0;
				} else if (bb == "ºìÌÒ") {
					max[i] = 1;
				} else if (aa == "Ã·»¨") {
					max[i] = 0;
				} else {
					max[i] = 1;
				}
			}
		}
		a = game.compare(playerList, 0, max[0]);
		b = game.compare(playerList, 1, max[1]);
		aa = playerList.get(0).getCards().get(max[0]).getFlower();
		bb = playerList.get(1).getCards().get(max[1]).getFlower();
		System.out.println(playerList.get(0).getName() + "×î´óÅÆÎª" + aa
				+ playerList.get(0).getCards().get(max[0]).getNumber());
		System.out.println(playerList.get(1).getName() + "×î´óÅÆÎª" + bb
				+ playerList.get(1).getCards().get(max[1]).getNumber());
		if (a > b) {
			System.out.println(playerList.get(0).getName() + "Ê¤Àû£¡");
		} else if (a < b) {
			System.out.println(playerList.get(1).getName() + "Ê¤Àû£¡");
		} else {
			if (aa == "ºÚÌÒ") {
				System.out.println(playerList.get(0).getName() + "Ê¤Àû£¡");
			} else if (bb == "ºÚÌÒ") {
				System.out.println(playerList.get(1).getName() + "Ê¤Àû£¡");
			} else if (aa == "ºìÌÒ") {
				System.out.println(playerList.get(0).getName() + "Ê¤Àû£¡");
			} else if (bb == "ºìÌÒ") {
				System.out.println(playerList.get(1).getName() + "Ê¤Àû£¡");
			} else if (aa == "Ã·»¨") {
				System.out.println(playerList.get(0).getName() + "Ê¤Àû£¡");
			} else {
				System.out.println(playerList.get(1).getName() + "Ê¤Àû£¡");
			}
		}
	}

	public int compare(List<Player> playerList, int i, int d) {
		int a;
		if (playerList.get(i).getCards().get(d).getNumber() == "A") {
			a = 1;
		} else if (playerList.get(i).getCards().get(d).getNumber() == "J") {
			a = 11;
		} else if (playerList.get(i).getCards().get(d).getNumber() == "Q") {
			a = 12;
		} else if (playerList.get(i).getCards().get(d).getNumber() == "K") {
			a = 13;
		} else {
			a = Integer
					.valueOf(playerList.get(i).getCards().get(d).getNumber());
		}
		return a;
	}
}
