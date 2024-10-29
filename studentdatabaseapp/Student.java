package studentdatabaseapp;

import java.util.Scanner;

public class Student 
{	
	private String      firstName;
	private String      lastName;
	private int         gradeYear;
 	private String      studentId;
 	private String      courses = "";
 	private int         tuitionBalance = 0;
 	private static int  costOfCourse = 600;
 	private static int  id=100;
 	
	// constructor - prompt user to enter students name and year
 	
 	public Student()
 	{
 		Scanner in = new Scanner (System.in);
 		
 		System.out.print("Enter student First name: ");
 		this.firstName = in.nextLine();
 		
 		System.out.print("Enter student Last name: ");
 		this.lastName = in.nextLine();
 		
 		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Stiudent class level: ");
 		this.gradeYear = in.nextInt();
 		
 		setStudentId();
 		
 		
 		
 	}
	
 	//Generate an Id
	
 	private void setStudentId()
 	{
 		id++;
 		this.studentId = gradeYear + " " + id;
 		
 	}
	
 	//Enroll in course
 	
 	public void enroll()
 	{		// get inside the loop ,user hits 0
 		
 		do {
 			System.out.print("Enter course to enroll (Q to quit): ");
 			Scanner in = new Scanner(System.in);
 			String course = in.nextLine();
 		
 			if(!course.equals("Q"))
 			{
 				courses = courses + "\n " + course;
 				tuitionBalance = tuitionBalance + costOfCourse;
 			}
 			else
 			{
 				break;
 			}
 		}while(1 != 0);
 		
 	}
 	
	// view balance
	
 	public void viewBalance() {
 		System.out.println("Your balance is : $"+ tuitionBalance);
 		
 	}
	// Pay Tuition 
	
 	public void payTuition()
 	{
 		viewBalance();
 		System.out.print("Enter your payment: $");
 		Scanner in  = new Scanner(System.in);
 		int payment = in.nextInt();
 		tuitionBalance=tuitionBalance - payment;
 		System.out.println("Thank you for your payment of $" + payment);
 		viewBalance();
 	
 	}
 	
	//Show status
 	
 	public String toString()
 	{
 		return "Name: "+firstName + " " + lastName +
 				"\nStudent ID: " + gradeYear+
 				"\nCourses Enrolled: "+ courses +
 				"\nBalance: $"+ tuitionBalance;
 	}
}
