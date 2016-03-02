package com.yujun.action;

/*
 * 创建扑克牌
 */
import java.util.ArrayList;
import java.util.List;

import com.yujun.Config.Card;

public class MakeCard {
	List<Card> cardlist = new ArrayList<Card>();

	public MakeCard() {

	}

	public List<Card> make() {
		Card card;
		for (int i = 1; i < 14; i++) {
			for (int j = 1; j < 5; j++) {
				card = new Card();
				if (i >= 2 && i <= 10) {
					card.setNumber("" + i);
				} else {
					switch (i) {
					case 1:
						card.setNumber("A");
						break;
					case 11:
						card.setNumber("J");
						break;
					case 12:
						card.setNumber("Q");
						break;
					case 13:
						card.setNumber("K");
						break;
					}
				}
				switch (j) {
				case 1:
					card.setFlower("黑桃");
					break;
				case 2:
					card.setFlower("红桃");
					break;
				case 3:
					card.setFlower("梅花");
					break;
				case 4:
					card.setFlower("方块");
					break;
				}
				cardlist.add(card);
			}
		}
		return cardlist;
	}

}
