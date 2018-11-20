package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
//		int age = 18;
//		float weight = 55.4f;
//		float height = 1.7f;
//		String scoolYear = "2018";
//		System.out.print("age=");
//		System.out.println(age);
//		System.out.println("weight=55.4");
//		System.out.println("height=1.7 ");
//		System.out.println("scoolYear=2018");\*
		Person p = new Person(55.4f, 1.7f);
//		p.weight = 55.4f;
//		p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
//		Person Harry =new Person();
//		Person jack = null;
//		jack.hello();
		Student stu = new Student("Harry",70,90);
		Student f  = new Student("Andy",60,80);
//		stu.name = "Harry";
//		stu.english = 70;
//		stu.math = 90; 
		stu.print();
	    f.print();
		System.out.println( 4 <= 6 );
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name:");
		String name = scanner.nextLine();
		System.out.println(name);
		String nick = "Harry";
		int m = (5%3);
		int r =(int)(3/5.0);
		System.out.println(m);
		System.out.println(r);
		float n = 11.2655f;
		System.out.printf("Hi,%s,Your age:%.3f\n",nick,n);
		double c = 24.0;
		System.out.print("F=");
		System.out.println(c*(9/5.0)+32);
		
		System.out.println("");
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		for(int i=1;i<=4;i++){
			System.out.println(i);
			
		}
			
		}
		
		
	}
	


