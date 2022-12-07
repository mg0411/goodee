package com.Kisok;

import java.util.ArrayList;
import java.util.Scanner;

public class Select {
	public static ArrayList<Product> list = new ArrayList<Product>();
	public static Product a1 = new Product("아아", 2000);
	public static Product a2 = new Product("뜨아", 3000);
	public static Product a3 = new Product("빵1", 5000);
	public static Product a4 = new Product("빵2", 6000);
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		String cmd;
		int sum = 0;
		xx: while (true) {
			System.out.print("명령 입력[1.음료선택/2.디저트선택/e.프로그램종료]:");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				Drink dr = new Drink();
				dr.drink();
				break;
			case "2":
				Eat et = new Eat();
				et.eat();
				break;
			case "e":
				
				System.out.println("프로그램종료");
				for (Product x : list) {
					sum += x.price;
				}
				System.out.println("가격: " + sum + "원");
				break xx;
			}
		}
	}
}
