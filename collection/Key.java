package com.cts.collection;

import java.util.HashMap;

public class Key {
	String key;
	public Key(String key) {
		this.key=key;
	}
	@Override
	public int hashCode() {
		int hash=(int)key.charAt(0);
		System.out.println("hashCode of key: "+key+" = "+hash);
		return hash;	}
	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key)obj).key);	}
	public static void main(String[] args) {
		HashMap map=new HashMap();
		Key k1=new Key("raju");
		Key k2=new Key("hari");
		Key k3=new Key("ramu");
		map.put(k1,101);
		map.put(k2,102);
		map.put(k3,103);
		System.out.println();
		System.out.println("value of key raju is: "+map.get(k1));
		System.out.println("value of key hari is: "+map.get(k2));
		System.out.println("value of key ramu is: "+map.get(k3));
	}
} 
