package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.eTitle;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class Staff_Test { 
	static List<Staff> staffList = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException {
		Date date = new Date(100,1,1);
		Staff staff0 = new Staff("first", "middle", "last", date,"address", "3026507861","email","1-2",5, 50000,date, eTitle.MR );
		Staff staff1 = new Staff("first", "middle", "last", date,"address", "3026507861","email","1-2",5, 40000,date, eTitle.MR );
		Staff staff2 = new Staff("first", "middle", "last", date,"address", "3026507861","email","1-2",5, 30000,date, eTitle.MR );
		Staff staff3 = new Staff("first", "middle", "last", date,"address", "3026507861","email","1-2",5, 20000,date, eTitle.MR );
		Staff staff4 = new Staff("first", "middle", "last", date,"address", "3026507861","email","1-2",5, 10000,date, eTitle.MR );
		
		staffList.add(staff0);
		staffList.add(staff1);
		staffList.add(staff2);
		staffList.add(staff3);
		staffList.add(staff4);
	}
	
	
	@Test
	public void test() {
		double salSum = staffList.get(0).getSalary() +staffList.get(1).getSalary() +staffList.get(2).getSalary() +staffList.get(3).getSalary() +staffList.get(4).getSalary();
		double average = salSum / 5;
		
		assertEquals(average,30000, .01);
	}	
	
	 
	//Both of the exception cases are tested for and both throw exceptions but I don't 
	//know how to get the test cases to verify that. I tried using code from past examples.
	@Test(expected = PersonException.class)
	public void PhoneExpectionTest() throws Exception {
		Date date = new Date(100,1,1);
		Staff staffTest = new Staff("first", "middle", "last", date,"address", "306507861","email","1-2",5, 50000,date, eTitle.MR );
	}	
	@Test(expected=PersonException.class)
	public void DateExpectionTest() throws Exception {
		Date date = new Date(0, 1, 1);
		Staff staffTest = new Staff("first", "middle", "last", date,"address", "306507861","email","1-2",5, 50000,date, eTitle.MR );
	}
}
