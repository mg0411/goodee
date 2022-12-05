package com.Kisok;

public class Product {
	 int price;
	 String name;
	 
	 Product(int a, String b){
		 price=a;
		 name=b;
	 }
	 Product(String b,int a){
		 price=a;
		 name=b;
	 }
	 public void info() {
			System.out.println(name+" 가격:"+price+"원");
		}
}
