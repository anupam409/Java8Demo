package com.inno.appmain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp {
public static void main(String args[])
{
	List<String> listData = new ArrayList<String>();
	listData.add("anupam");
	listData.add("anupam1");
	listData.add("anupam2");
	listData.add("anupam3");
	List<String> result = new ArrayList<String>();
	for(String data:listData)
	{
		result.add(data.toUpperCase());
	}
	
	System.out.println(result);
	
	// now write same program in java 8
	List<String> result8 = listData.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(result8);
	
	//conditions  using map return all the match or unmatched data
	List<Boolean> result8_1 = listData.stream().map(x -> x.equals("anupam")).collect(Collectors.toList());
	System.out.println(result8_1);
	
	//conditions  using filter ,will return only matched data
	List<String> result8_3 = listData.stream().filter(x -> x.equals("anupam")).collect(Collectors.toList());
	System.out.println(result8_3);
	//
	Stream<Object> result8_2 = listData.stream().map(x -> x.equals("anupam"));
	
}
}
