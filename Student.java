package com.sonata;



public class Student {
	
		
		int sid;
		String sname;
		int sclass;
		 
		Student(){}
		Student(int id,String name, int cls){
			this.sid=id;
			this.sname=name;
			this.sclass=cls;
			
		}
		public void display() {
			System.out.println(sid);
			System.out.println(sname);
			System.out.println(sclass);

			
		}
		 public static void main(String [] args) {
			 Student s1=new Student();
			 s1.sid=1;
			 s1.sname="jan";
			 s1.sclass=9;
			 s1.display();
			 Student s2= new Student(2,"jyo",8);
			 s2.display();
			 
			 
		 }

	}


