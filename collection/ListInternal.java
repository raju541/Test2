package com.cts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInternal {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	Object[] str=list.toArray();
	
	List lt=Arrays.asList(str);
	
	
	List pt=Collections.synchronizedList(list);
}
}
