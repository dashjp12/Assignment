package com.Nested;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NestedTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,ArrayList<String>> t=new TreeMap<>();
		ArrayList<String> a=new ArrayList<>();
		a.add("CHN");
		a.add("BAN");
		a.add("TVM");
		a.add("HYD");
		
		/*t.put("TN", a);
		t.put("KAR", a);
		t.put("KER", a);
		t.put("TEL", a);
		
		Set<String> s=t.keySet();
		Iterator< String> i=s.iterator();
		while(i.hasNext())
		{
			String index=i.next();
			ArrayList<String> value=t.get(index);
			
			System.out.println(index+" "+value);
		}*/
		
		String g[]= {"TN","KAR","KER","TEL"};
		System.out.println("For-Loop");
		
	}
	

}
