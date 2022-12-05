package com.Kisok;

import java.util.ArrayList;
import java.util.Scanner;

public class kisok {
	public static void run() {
		ArrayList<Product> list = new ArrayList<Product>();
		Product a1 = new Product("아아", 2000);
		Product a2 = new Product("뜨아", 3000);
		Product a3 = new Product("빵1", 5000);
		Product a4 = new Product("빵2", 6000);
		Scanner sc = new Scanner(System.in);
				System.out.print("[1.음료수//2.디저트//x.종료]");
				String a = sc.next();
				String n;
				switch(a) {
					case"1":
					a:while(true) {
							//  음료
							System.out.println("[1.아아/2.뜨아/x.이전메뉴]");
							a1.info();
							a2.info();
							n=sc.next();
							switch(n) {
							case"1":
								System.out.println("아아선택");
								list.add(a1);
								break;	
							case"2":
								System.out.println("뜨아선택");
								list.add(a2);
								break;	
							case"x":
								break a;
							}
					
					}
					case"2":
						b:while(true) {
							System.out.println("[1.빵1/2.빵2/x.이전메뉴]");
							a3.info();
							a4.info();
							n = sc.next();
							switch(n) {
								case"1":
									System.out.println("빵1선택");
									list.add(a3);
									break;	
								case"2":
									System.out.println("빵2선택");
									list.add(a4);
									break;	
								case"x":
									break b;
								}
							}
						case"x":
							}
				int sum=0;
				for(int i =0 ; i < list.size();i++) {
					sum+=list.get(i).price;
				}
				System.out.println(sum);
				System.out.println("종료");
	}


}
