package com.sonata.assignment4;

import java.util.Objects;

class Student implements Comparable
{
  String studentName;
  int studentTotalMarks;
    Student (String strudentName, int studentTotalMarks)
  {
    this.studentName = strudentName;
    this.studentTotalMarks = studentTotalMarks;
  }
  //generate compareTo and hashcode , toString methods based on studentTotalMarks
	@Override
	public int hashCode() {
		return Objects.hash(studentTotalMarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentTotalMarks == other.studentTotalMarks;
	}
	@Override
	public String toString() {
		return "Student [studentTotalMarks=" + studentTotalMarks + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

