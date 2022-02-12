package com.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DoubleFilter {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(21);
		
		List<Integer> list5 = list.stream().filter((num) -> {return num % 5 == 0;}).collect(Collectors.toList());
		list5.forEach(System.out::println); 
		
		list.stream().filter(x->{return x%5==0;}).filter(y->{return y*4>50;}).forEach(System.out::println);
		
	}

}
