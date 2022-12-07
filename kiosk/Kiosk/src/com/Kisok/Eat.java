package com.Kisok;

import java.util.Scanner;

public class Eat {
	
	Scanner sc = new Scanner(System.in);
	String  cmd;
	public void eat() {
		t:while (true) {
			Select.a3.info();
			Select.a4.info();
			System.out.println("[1.빵1/2.빵2/x.이전메뉴로]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("빵1 선택됨");
				Select.list.add(Select.a3);
				break;
			case "2":
				System.out.println("빵2 선택됨");
				Select.list.add(Select.a4);
				break;
			case "x":
				break t;
			}
		}
	}
}
