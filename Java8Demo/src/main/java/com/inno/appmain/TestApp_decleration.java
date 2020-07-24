package com.inno.appmain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp_decleration {
public static void main(String args[])
{
	String data = null;
	Stream<String> language = Stream.of("Java","C","c++","php",".Net","SQL");
	System.out.println(language);
	List<String> result = language.collect(Collectors.toList());
	System.out.println(result);
	result.forEach(System.out::println);
	//or
	result.forEach(x -> {
		System.out.println(x);
	});
	
	}


}
