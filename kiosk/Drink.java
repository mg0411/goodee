package com.Kisok;

import java.util.ArrayList;
import java.util.Scanner;

public class Drink {
	ArrayList<Product> list = new ArrayList<Product>();
	Product a1 = new Product("아아", 2000);
	Product a2 = new Product("뜨아", 3000);
	Scanner sc = new Scanner(System.in);
	String  cmd;
	public  void drink() {
		a: while (true) {
			a1.info();
			a2.info();
			System.out.println("[1.아아/2.뜨아/x.이전메뉴로]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("아아 선택됨");
				list.add(a1);
				break;
			case "2":
				System.out.println("뜨아 선택됨");
				list.add(a2);
				break;
			case "x":
				break a;
			}
		}
	}
}
