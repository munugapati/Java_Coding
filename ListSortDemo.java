package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.*;  

public class ListSortDemo {
	
	public static void main(String[] args)   
	{  
	//returns a list view   
	List<String> slist = Arrays.asList("5","6","7","04","09","08");  
	List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
	//sortedList.forEach(System.out::println); 
	
	List<Integer> intList = Arrays.asList(3,4,9,8,2,7);
	OptionalDouble avg = intList.stream().mapToInt(Integer::intValue).average();
	
	OptionalDouble avg1 = intList.stream().mapToDouble(Integer::intValue).average();
	
	System.out.println("Average = " + avg);
	
	}  

}




  
