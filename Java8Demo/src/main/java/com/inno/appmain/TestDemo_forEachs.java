package com.inno.appmain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.inno.appmain.entity.Student;

public class TestDemo_forEachs {
public static void main(String args[])
{
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("B", 10);
	map.put("C", 20);
	map.put("A", 30);
	map.put("E", 10);
	map.put("D", 40);
	map.put("B", 10);
	
	System.out.println(map);
	map.forEach((k,v) ->{
		if(k.equals("B"))
		System.out.println(k + " "+ v);
	});
	Map<String,Integer> flatMap = new LinkedHashMap<String, Integer>();
	
	map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
	.forEachOrdered(e->{
		flatMap.put(e.getKey(), e.getValue());
	}
	);
	System.out.println(flatMap);
	
	
	List<Integer> listData = new ArrayList<Integer>();
	listData.add(1);
	listData.add(2);
	listData.add(3);
	listData.add(1);
	listData.add(4);
	listData.add(1);
	listData.add(6);
	listData.add(1);
	listData.add(2);
	listData.add(3);
	listData.add(1);
	listData.add(4);
	listData.add(1);
	listData.add(5);
	Map<String,Integer> flatMaps = new LinkedHashMap<String, Integer>();
	listData.stream().filter(x -> x %2 == 0).forEach( x -> flatMaps.put(String.valueOf(x), 1));
	System.out.println(flatMaps);
	
	//or
	
	Map<String,Integer> maps = new HashMap<String,Integer>();
	maps.put("1", 10);
	maps.put("2", 20);
	maps.put("3", 30);
	maps.put("4", 10);
	maps.put("5", 40);
	maps.put("6", 10);
	
	List<Integer> listDatas = new ArrayList<Integer>();
	
	listData.stream().filter(x -> x %2 == 0).forEach( x -> 
	{
		//flatMaps.put(String.valueOf(x), 1);
		maps.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEachOrdered(e -> {
			if(String.valueOf(x).equals(e.getKey()))
				listDatas.add(e.getValue());
				
		});
		
	}
	);
	//System.out.println(flatMaps);
	System.out.println(listDatas);
	Integer result = listDatas.stream().reduce(0, (a,b) -> a+b);
	System.out.println("result = "+result);
	// or 
	Integer results = listDatas.stream().reduce(0, Test::add);
	System.out.println("result = "+results);
	
	
	// Add multiple type data in using construstore
	
	List<Student> listStudent = new ArrayList<Student>();
	listStudent.add(new Student(1, "Anupam Kumar", "anupamkumar111@gmail.com", 101));
	listStudent.add(new Student(12, "AAA", "AAA@gmail.com", 112));
	listStudent.add(new Student(3, "ABC", "ABC@gmail.com", 103));
	listStudent.add(new Student(14, "DEF", "DEF@gmail.com", 114));
	listStudent.add(new Student(10, "BCB", "BCB@gmail.com", 110));
	listStudent.add(new Student(9, "PQR", "PQR@gmail.com", 109));
	
	Integer totalId = listStudent.stream().map(x -> x.getId()).reduce(0, Test::add);
	System.out.println("Total ID ="+totalId);
	
	// Similarlly add Roll nomber
	Long totalRoll = listStudent.stream().map(x -> x.getRollNo()).reduce(0L, Test::sum);
	System.out.println("Total Roll ="+totalRoll);
	
	
}
}
class Test{
public static int add(int a, int b) {
    return a + b;
}

public static long sum(long a, long b) {
    return a + b;
}
}