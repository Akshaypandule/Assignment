package com.String;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicatesword {
	
	public static Set<String> findoutduplicatesword(String str) {
		
		
		if(str.isEmpty()||str==null)
		{
			return Collections.emptySet();
		}
		
		Set<String> duplicate=new HashSet<>();
		String words[]=str.split(" ");
		Set<String> set=new HashSet<>();
		
		for(String word:words)
		{
			if(!set.add(word)) {
				duplicate.add(word);
			}
		}
		
	
		
		return duplicate;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String here");
		String str=sc.nextLine();
		System.out.println(findoutduplicatesword(str)); 
		
	}

}
