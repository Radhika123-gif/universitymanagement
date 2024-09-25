package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;
//Represents a professor in the university
public class Professor {
	private String name;// name of the professor
	private List<Course> assignedCourses;// list to hold courses assigned to the professor
//constructor to initialize the professor with a name and an emptyt of assigned courses 
		public Professor(String name) {
			this.name = name;
			this.assignedCourses = new ArrayList<>();//initialize the list of assigned courses
		}

	   // getter method to retrieve the professor name
		public  String getName() {
			return name;// return the professor's name
			 }

	    // method to assign a course to the professor.
		public void assignCourse(Course course) {
			// check if the course is not already in the list of assigned courses
					if (!assignedCourses.contains(course)) {
						assignedCourses.add(course);// add course to the list of not already presented
					}
				}
				// getter method to retrieve the list of courses assigned to the professsor

				public List<Course> getAssignedCourses() {
					return assignedCourses;// return to list of assigned courses.
				}
				// override to string method to provide a string representation of the profeesor

				public String toString() {
					return name;
				}
	}


