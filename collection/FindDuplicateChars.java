package com.cts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindDuplicateChars fdc=new FindDuplicateChars();
		fdc.finddup("aaabbccccde");
	}
		public void finddup(String word)
		{
			Map<Character,Integer> map=new HashMap<Character,Integer>();
			
			char[] ch=word.toCharArray();
			for (char c : ch) {
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			Set<Map.Entry<Character, Integer>> set=map.entrySet();
			for (Map.Entry<Character, Integer> entry : set) {
				if(entry.getValue()>1)
					System.out.printf("%s : %d %n" , entry.getKey(),entry.getValue());
			}
		}
}