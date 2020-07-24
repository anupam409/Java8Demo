package com.inno.appmain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestApp_map_filter {
public static void main(String args[]) {
	List<Integer> listData = new ArrayList<Integer>();
	listData.add(1);
	listData.add(2);
	listData.add(3);
	listData.add(1);
	listData.add(4);
	listData.add(1);
	listData.add(5);
	listData.add(1);
	listData.add(2);
	listData.add(3);
	listData.add(1);
	listData.add(4);
	listData.add(1);
	listData.add(5);
	
	// display all the list  using map to store all the values
	List<Integer> result = listData.stream().collect(Collectors.toList());
	System.out.println(result);
	//or
	List<Integer> result_1 = listData.stream().map(x -> x).collect(Collectors.toList());
	System.out.println(result_1);
	
	List<Integer> result_2 = listData.stream().map(x -> x +1).collect(Collectors.toList());
	System.out.println(result_2);
	
	// put condition and store those value also
	// even data and odd data both, if een retuen true or false 
	List<Boolean> condition = listData.stream().map(x -> x %2 ==0 ).collect(Collectors.toList());
	System.out.println(condition);
	
	// only exact value don't use map use filter
	// even data 
		List<Integer> condition_exact = listData.stream().filter(x -> x %2 ==0 ).collect(Collectors.toList());
		System.out.println(condition_exact);
		// odd data
		List<Integer> condition_exact_odd = listData.stream().filter(x -> x %2 !=0 ).collect(Collectors.toList());
		System.out.println(condition_exact_odd);
		condition_exact_odd.addAll(condition_exact);
		System.out.println(condition_exact_odd);
		
		
		
}
}
