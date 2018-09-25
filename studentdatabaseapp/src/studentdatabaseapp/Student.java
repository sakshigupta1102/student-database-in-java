package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int year;
	private String studentid;
	private String courses="null";
	private int studentbalance=0;
	private int costofcourse=600;
	public static int id=1001;
	
	
	//constructor :ask to enter name and year
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter first name:");
		this.firstname=in.nextLine();
		System.out.println("enter last name:");
		this.lastname=in.nextLine();
		System.out.println("enter year: 1 for first year \n 2 for 2nd year \n 3 for third \n 4 for 4th");
		
		this.year=in.nextInt();
		setstudentid();
		System.out.println("name is " +firstname+" " + lastname +" \n year is " +year+ " \n student id is " + studentid);
		
		id++;
		
	}
	
	//generate id
	private void setstudentid()
	{
	this.studentid= year+""+id;	
	}
	
	//enroll in courses
	public void enroll()
	{
		do{
		System.out.print("enter course to enroll and Q to quit");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q"))
		{
			courses=courses+ "\n"+ course;
			studentbalance=studentbalance+costofcourse;
			
		}
		else
		{
			break;
		}
		}while(1!=0);
		
		
		System.out.println("enrolled in "+ courses);
		System.out.println("you have to pay  "+ studentbalance);
	}
	
	
	//view balance
	public void viewbalance()
	{
		System.out.print(" your balance is Rs" + studentbalance +"\n");
	}
	
	//pay tuition fee
	public void paybalane()
	{
		if (studentbalance>0)
			{System.out.println("how much do you like to pay");
		Scanner in=new Scanner(System.in);
		int payment= in.nextInt();
		studentbalance=studentbalance-payment;
		System.out.println("thankyou to psy Rs"+ payment);
		viewbalance();
		
			}
		else
		{
			System.out.println("no amount to be paid");
		}
	}
	//show status 
	void showinfo()
	{
		System.out.println("NAME OF STUDENT"+firstname+" " +lastname);
		System.out.println("YEAR IS " + year +"\n ID is " +id);
		System.out.println("ENROLLED IN " + courses);
		System.out.println("PAYMENT LEFT IS " + studentbalance);
	}

}
