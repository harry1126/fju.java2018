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
	int average = getAverage();
	public void print() {
		System.out.print(name +"\t"+ english + "\t" + math + "\t");
		System.out.print(average+"\t"+highest()+"\t");
		if(average<60){
			System.out.println("Failed");
		}else{
			System.out.println("Pass");
		}	
	}
	public int highest(){
		if(english>math){
			return english;
		}else{
		}return math;
	}
	public char getgrading(){
	int average = getAverage();
	char grading = 'F';
	switch(average/10){
	case 10:
	case 9:
		grading = 'A';
		break;
	case 8:
		grading ='B';
		break;
	case 7 :
		grading = 'C';
		break;
	case 6 :
		grading = 'D';
		break;
	default :
		grading ='F';
		
	}
	return getgrading();
	}
	public int getAverage(){
		int average = (english+math)/2;
		return average;
	}

}
