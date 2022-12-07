package com.Kisok;

public class Display {
	final static  String DOT="=";
	public static void star() {
		for(int i= 0 ; i < 32 ; i++ ) {
			System.out.print(DOT);
		}
		System.out.print('\n');
	}
		public static void title() {
			star();
			System.out.println("************고양이 카페************");
			star();
		}
		
	}

