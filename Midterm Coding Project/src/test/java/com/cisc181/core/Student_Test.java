package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	static List<Course> courseList = new ArrayList<Course>();
	static List<Semester> semesterList = new ArrayList<Semester>();
	static List<Section> sectionList = new ArrayList<Section>();
	static List<Student> studentList = new ArrayList<Student>();
	static List<Enrollment> enrollList = new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws Exception {
		Course course0 = new Course("course0", 2, eMajor.COMPSI);
		Course course1 = new Course("course0", 2, eMajor.COMPSI);
		Course course2 = new Course("course0", 2, eMajor.COMPSI);
		courseList.add(course0);
		courseList.add(course1);
		courseList.add(course2);
		
		Date sdate = new Date(100,1,1);
		Date edate = new Date(100,4,1);
		Semester fall = new Semester(sdate, edate);
		Semester spring = new Semester(sdate, edate);
		semesterList.add(fall);
		semesterList.add(spring);
		
		Section one = new Section(100, course0.getCourseID(), fall.getSemesterID());
		Section two = new Section(100, course1.getCourseID(), fall.getSemesterID());
		Section three = new Section(100, course2.getCourseID(), fall.getSemesterID());
		Section four = new Section(100, course0.getCourseID(), spring.getSemesterID());
		Section five = new Section(100, course1.getCourseID(), spring.getSemesterID());
		Section six = new Section(100, course2.getCourseID(), spring.getSemesterID());
		sectionList.add(one);
		sectionList.add(two);
		sectionList.add(three);
		sectionList.add(four);
		sectionList.add(five);
		sectionList.add(six);
		
		Date date = new Date(100,1,1);
		Student student0 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student1 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student2 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student3 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student4 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student5 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student6 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student7 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student8 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		Student student9 = new Student("first", "middle", "last", date, eMajor.COMPSI ,"address", "3026507861","email");
		studentList.add(student0);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		studentList.add(student9);
		
		for (Student stu : studentList){
			for (Section sec:  sectionList){
				enrollList.add(new Enrollment(stu.getStudentID(),  sec.getSectionID()));
			}
		}
		double grade = 100;
		for (Enrollment enroll: enrollList){
			enroll.SetGrade(grade);
			grade--;
		}
		
	}

	@Test
	public void GPAtest() {
		
		double student1sum = 0;
		double totalCredits =0;
		for (int i= 0; i <6;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student1sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student1sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student1sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student1average =student1sum /totalCredits ;
		 
		double student2sum = 0;
		totalCredits =0;
		for (int i= 6; i <12;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student2sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student2sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student2sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student2average =student2sum / totalCredits;
		
		
		double student3sum = 0;
		totalCredits =0;
		for (int i= 12; i <18;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student3sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student3sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student3sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student3average =student3sum / totalCredits;
		
		double student4sum = 0;
		totalCredits =0;
		for (int i= 18; i <24;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student4sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student4sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student4sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student4average =student4sum / totalCredits;
		
		double student5sum = 0;
		totalCredits =0;
		for (int i= 24; i <30;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student5sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student5sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student5sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student5average =student5sum / totalCredits;
		
		double student6sum = 0;
		totalCredits =0;
		for (int i= 30; i <36;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student6sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student6sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student6sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student6average =student6sum / totalCredits;
		
		double student7sum = 0;
		totalCredits =0;
		for (int i= 36; i <42;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student7sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student7sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student7sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student7average =student7sum / totalCredits;
		
		
		double student8sum = 0;
		totalCredits =0;
		for (int i= 42; i <48;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student8sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student8sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student8sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student8average =student8sum / totalCredits;
	
		
		double student9sum = 0;
		totalCredits =0;
		for (int i= 48; i <54;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student9sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student9sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student9sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student9average =student9sum / totalCredits;
		
		
		double student10sum = 0;
		totalCredits =0;
		for (int i= 54; i <60;i+=3){
			totalCredits += courseList.get(0).getGradePoints()+courseList.get(1).getGradePoints()+courseList.get(2).getGradePoints();
			student10sum += ((.04*enrollList.get(i).getGrade()) * courseList.get(0).getGradePoints());
			student10sum += ((.04*enrollList.get(i+1).getGrade()) * courseList.get(1).getGradePoints());
			student10sum += ((.04*enrollList.get(i+2).getGrade()) * courseList.get(2).getGradePoints());
		}
		double student10average =student10sum / totalCredits;
		
		System.out.println(student1average);
		System.out.println(student2average);
		System.out.println(student3average);
		System.out.println(student4average);
		System.out.println(student5average);
		System.out.println(student6average);
		System.out.println(student7average);
		System.out.println(student8average);
		System.out.println(student9average);
		System.out.println(student10average);
		
		assertEquals(student1average, 3.9,.01);
		assertEquals(student2average, 3.66,.01);
		assertEquals(student3average, 3.42,.01);
		assertEquals(student4average, 3.179,.01);
		assertEquals(student5average, 2.94,.01);
		assertEquals(student6average, 2.700,.01);
		assertEquals(student7average, 2.46,.01);
		assertEquals(student8average, 2.22,.01);
		assertEquals(student9average, 1.98,.01);
		assertEquals(student10average, 1.74,.01);
	}

	
	@Test
	public void courseAveragetest() {
		double course1sum = 0;
		for (int i= 0; i <60;i+=6){
			course1sum += enrollList.get(i).getGrade();
		}
		double course1average =course1sum / 10;
	
	
		double course2sum = 0;
		for (int i= 0; i <60;i+=6){
			course2sum += enrollList.get(i).getGrade();
		}
		double course2average =course2sum / 10;
	
		double course3sum = 0;
		for (int i= 0; i <60;i+=6){
			course3sum += enrollList.get(i).getGrade();
		}
		double course3average =course3sum / 10;
	
	
	
		double course4sum = 0;
		for (int i= 0; i <60;i+=6){
			course4sum += enrollList.get(i).getGrade();
		}
		double course4average =course4sum / 10;
	
	

		double course5sum = 0;
		for (int i= 0; i <60;i+=6){
			course5sum += enrollList.get(i).getGrade();
		}
		double course5average =course5sum / 10;
	
	
	
		double course6sum = 0;
		for (int i= 0; i <60;i+=6){
			course6sum += enrollList.get(i).getGrade();
		}
		double course6average =course6sum / 10;
		
		assertEquals(course1average, 73,.01);
		assertEquals(course2average, 73,.01);
		assertEquals(course3average, 73,.01);
		assertEquals(course4average, 73,.01);
		assertEquals(course5average, 73,.01);
		assertEquals(course6average, 73,.01);
	}
	
	@Test
	public void majortest() {
		studentList.get(0).setMajor(eMajor.CHEM);
		assertEquals(studentList.get(0).getMajor(), eMajor.CHEM);
	}
	
	
	
}