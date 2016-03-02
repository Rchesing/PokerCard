package com.yujun.action;

/*
 * 创建两个玩家
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yujun.Config.Player;

public class MakePlayer {

	public List<Player> setUp() {
		List<Player> playerlist = new ArrayList<Player>();
		Player player1 = new Player();
		System.out.print("请创建第一个玩家的ID：");
		Scanner sc = new Scanner(System.in);
		String strId = sc.next();
		player1.setId(strId);
		System.out.print("请输入第一个玩家的姓名：");
		sc = new Scanner(System.in);
		String strName = sc.next();
		player1.setName(strName);
		playerlist.add(player1);

		Player player2 = new Player();
		System.out.print("请创建第二个玩家的ID：");
		sc = new Scanner(System.in);
		strId = sc.next();
		while (strId.equals(player1.getId())) {
			System.out.println("此ID已存在，请重新输入第二个玩家的ID:");
			sc = new Scanner(System.in);
			strId = sc.next();
		}
		player2.setId(strId);
		System.out.print("请输入第二个玩家的姓名：");
		sc = new Scanner(System.in);
		strName = sc.next();
		player2.setName(strName);
		playerlist.add(player2);

		return playerlist;
	}

}
