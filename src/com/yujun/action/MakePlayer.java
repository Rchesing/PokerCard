package com.yujun.action;

/*
 * �����������
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yujun.Config.Player;

public class MakePlayer {

	public List<Player> setUp() {
		List<Player> playerlist = new ArrayList<Player>();
		Player player1 = new Player();
		System.out.print("�봴����һ����ҵ�ID��");
		Scanner sc = new Scanner(System.in);
		String strId = sc.next();
		player1.setId(strId);
		System.out.print("�������һ����ҵ�������");
		sc = new Scanner(System.in);
		String strName = sc.next();
		player1.setName(strName);
		playerlist.add(player1);

		Player player2 = new Player();
		System.out.print("�봴���ڶ�����ҵ�ID��");
		sc = new Scanner(System.in);
		strId = sc.next();
		while (strId.equals(player1.getId())) {
			System.out.println("��ID�Ѵ��ڣ�����������ڶ�����ҵ�ID:");
			sc = new Scanner(System.in);
			strId = sc.next();
		}
		player2.setId(strId);
		System.out.print("������ڶ�����ҵ�������");
		sc = new Scanner(System.in);
		strName = sc.next();
		player2.setName(strName);
		playerlist.add(player2);

		return playerlist;
	}

}
