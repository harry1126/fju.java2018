package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
//		int age = 18;
//		float weight = 55.4f;
//		float height = 1.7f;
//		String scoolYear = "2018";
//		System.out.print("age=");
//		System.out.println(age=18);
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
		Student ss = new Student("Mary",50,70);
//		stu.name = "Harry";
//		stu.english = 70;
//		stu.math = 90; 
		stu.print();
	    f.print();
		ss.print();
		System.out.println( 4 <= 6 );
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
	}

}
