package com.tom;

public class Student {
	String name;
	int english;
	int math;
	

	public Student (int b, int english, int math) {
		this.english = english;
		this.math =  math; 
	}
	
	public Student(String name ,int english ,int math) {
		this.name = name; 
		this.english  = english;
		this.math = math;
	}
	
	public void print() {
		System.out.println(name +"\t"+ english + "\t" + math + "\t"+ (english + math)/2);
	}

}
