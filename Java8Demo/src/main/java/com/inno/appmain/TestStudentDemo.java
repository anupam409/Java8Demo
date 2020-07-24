package com.inno.appmain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.inno.appmain.entity.Student;

public class TestStudentDemo {
	public static void main(String args[]) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(1, "Anupam Kumar", "anupamkumar111@gmail.com", 101));
		listStudent.add(new Student(12, "AAA", "AAA@gmail.com", 112));
		listStudent.add(new Student(3, "ABC", "ABC@gmail.com", 103));
		listStudent.add(new Student(14, "DEF", "DEF@gmail.com", 114));
		listStudent.add(new Student(10, "BCB", "BCB@gmail.com", 110));
		listStudent.add(new Student(9, "PQR", "PQR@gmail.com", 109));
		
		System.out.println(listStudent);
		// sort
		System.out.println("Sort by id");
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});
		System.out.println(listStudent);
		
		System.out.println("Sort by name");
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(listStudent);
		
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		Comparator<Student>	 comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		//or
		// convert  comparator instance  in to java 8 comperator
		comp = (Student o1, Student o2) ->{return o1.getName().compareTo(o2.getName());};
		//or
		comp = (o1, o2) ->{return o1.getName().compareTo(o2.getName());};
		Collections.sort(listStudent, comp);
		System.out.println(listStudent);
		comp = (o1,o2) ->{return o1.getEmail().compareTo(o2.getEmail());};
		listStudent.sort(comp);
		listStudent.forEach(System.out::println);
		
	}
}
