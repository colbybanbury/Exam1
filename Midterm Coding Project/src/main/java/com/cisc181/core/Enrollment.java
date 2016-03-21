package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	private Enrollment() {
		EnrollmentID = UUID.randomUUID();
	}
	Enrollment(UUID studentID, UUID sectionID){
		this();
		SectionID = sectionID;
		StudentID = studentID;
		
	}
	
	public void SetGrade(double grade) {
		Grade = grade;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	
	
}
