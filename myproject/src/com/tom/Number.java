package com.tom;

import javax.lang.model.type.DeclaredType;

public class Number {
	String secret;
	String number;
	public Number(String secret, String number) {
		this.secret = secret;
		this.number = number;
	}
	public  boolean a() {
		boolean a = number.equals(number);
		return a();
	}
}
