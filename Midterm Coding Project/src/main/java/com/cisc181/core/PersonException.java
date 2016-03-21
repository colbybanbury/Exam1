package com.cisc181.core;
import com.cisc181.core.*;
public class PersonException extends Exception {
	private Person person;
	PersonException(Person p){
		super();
		this.person = p;
	}
}
