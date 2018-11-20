package com.tom;

import javax.lang.model.type.DeclaredType;

public class Number {
	int secret;
	int number;
	public Number(int secret, int number) {
		this.secret = secret;
		this.number = number;
	}
	public  boolean a() {
		boolean a = number-secret>0;
		return a();
	}
	public boolean b(){
		boolean b = number-secret<0;
		return b;
	}
	public boolean c(){
		boolean c = number-secret==0;
		return c;
	}
}
