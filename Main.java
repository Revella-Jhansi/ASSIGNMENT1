package com.sonata.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
  public static void main (String[]args)
  {
    Student s1 = new Student ("prabha", 550);
    Student s2 = new Student ("prabha", 540);
    Student s3 = new Student ("prabha", 350);
    Student s4 = new Student ("prabha", 300);
    Student s5=new Student("prabha", 250);
    List<Student> list=new ArrayList<Student>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s5);
    Collections.sort(list,Collections.reverseOrder());
    list.forEach(System.out::println);
       
  }
}

