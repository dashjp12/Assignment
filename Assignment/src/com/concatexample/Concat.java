package com.concatexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Concat {
	
	public static void main(String[] args) {
		
	
	List<String> a=Arrays.asList("Gan","esh","raaj","Mothi","lal");
	
	Optional<String> l=a.stream().reduce((p1,p2)->(p1+p2));
	
	l.ifPresent(System.out::println);
	

	}
}
