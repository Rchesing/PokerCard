package com.yujun.Config;
/*
 * 玩家属性类
 */
import java.util.ArrayList;
import java.util.List;

public class Player {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	private String id;	//玩家ID
	private String name;	//玩家姓名
	List<Card> cards = new ArrayList<Card>();	//玩家手牌集合
	
	
	public Player(){
		
	}
	
	public Player(String id,String name){
		this.id = id;
		this.name = name;
		this.cards = new ArrayList<Card>();
		
	}
}
