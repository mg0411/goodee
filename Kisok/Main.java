package com.Kisok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("아아",1000);
		Product p2 = new Product("뜨아",1500);
		Product p3 = new Product("빵1",4500);
		Product p4= new Product("빵2",5500);
		Scanner sc = new Scanner(System.in);
		System.out.println("1번:음료//2번:디저트//x:종료");
			String cmd = sc.next();
			switch(cmd) {
			case"1":
				System.out.println("음료가격");
				p1.info();
				p2.info();
				loop_a:
				while(true) {
					System.out.print("[1.아아/2.뜨아/x.이전메뉴]");
					cmd=sc.next();
					switch(cmd) {
					case"1":
						System.out.println("아아선택");
						break;
					case"2":
						System.out.println("뜨아선택");
						break;
					case"x":
						break loop_a;
					}
				}
			case"2":
				System.out.println("디저트가격");
				p3.info();
				p4.info();
				loop_b:
					while(true) {
						System.out.print("[1.빵1/2.빵2/x.이전메뉴]");
						cmd=sc.next();
						switch(cmd) {
						case"1":
							System.out.println("빵1선택");
							break;
						case"2":
							System.out.println("빵2선택");
							break;
						case"x":
							break loop_b;
						}
						
					}
				break;
			case"x":
				break ;
			}
			System.out.println("프로그램 종료");	
		}
	}


