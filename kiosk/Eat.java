package com.Kisok;

import java.util.ArrayList;
import java.util.Scanner;

public class Eat {
	ArrayList<Product> list = new ArrayList<Product>();
	Product a3 = new Product("빵1", 5000);
	Product a4 = new Product("빵2", 6000);
	Scanner sc = new Scanner(System.in);
	String  cmd;
	public void eat() {
		t:while (true) {
			a3.info();
			a4.info();
			System.out.println("[1.빵1/2.빵2/x.이전메뉴로]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("빵1 선택됨");
				list.add(a3);
				break;
			case "2":
				System.out.println("빵2 선택됨");
				list.add(a4);
				break;
			case "x":
				break t;
			}
		}
	}
}
