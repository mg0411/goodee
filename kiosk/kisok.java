package com.Kisok;

import java.util.ArrayList;
import java.util.Scanner;

public class kisok {
	public static void run() {
		ArrayList<Product> list = new ArrayList<Product>();

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
				break;
			case "e":

				System.out.println("프로그램종료");
				for (int i = 0; i < list.size(); i++) {
					sum += list.get(i).price;
				}
				System.out.println("가격: " + sum + "원");
				break xx;
			}
		}
	}
}
