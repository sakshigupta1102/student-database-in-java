package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {

	public static void main(String[] args) {
		//ask how many users you want
		Student stu=new Student();
		stu.enroll();
		stu.paybalane();
		stu.showinfo();
		//no of objects
		System.out.println("enter no. of students thyat want to enroll");
		Scanner in= new Scanner(System.in);
		int no=in.nextInt();
		Student[] students=new Student[no];
		 
		for(int n=0;n<no;n++)
		{
			students[n]=new Student();
			students[n].enroll();
			students[n].paybalane();
			
			students[n].showinfo();

		}
		

	}

}
