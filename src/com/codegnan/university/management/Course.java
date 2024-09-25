package com.codegnan.university.management;
//Represents a course in the university
public class Course {

		private String title;//Title of the course

		// constructor to initialize the course with title
			public Course(String title) {
				this.title = title;//Set the course title
			}

		//getter method to retrieve the course title.
			public  String getTittle() {
				return title;//Return the course title
			}

		// override to string method to provide the string representation of the course
			public String toString() {
				return title;//Return the course title as the string representation
			}

			}
		

	


