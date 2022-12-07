package com.Kisok;

import java.util.Scanner;

public class Drink {

	Scanner sc = new Scanner(System.in);
	String  cmd;
	public  void drink() {
		a:while (true) {
			Select.a1.info();
			Select.a2.info();
			System.out.println("[1.아아/2.뜨아/x.이전메뉴로]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("아아 선택됨");
				Select.list.add(Select.a1);
				break;
			case "2":
				System.out.println("뜨아 선택됨");
				Select.list.add(Select.a2);
				break;
			case "x":
				break a;
			}
		}
	}
}
