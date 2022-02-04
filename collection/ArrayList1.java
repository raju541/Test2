package com.cts.collection;

import java.util.Arrays;
import java.util.Collection;

public class ArrayList1<E> {

transient Object[] elementData;
private static final Object[] EMPTY_ELEMENTDATA = {};
private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}; 
private static final int DEFAULT_CAPACITY = 10;

public	ArrayList1(){
	 this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	 }

public	ArrayList1(int initialCapacity){
	if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
        } 
	else if (initialCapacity > 0) {
         this.elementData = new Object[initialCapacity];
     } 
	else {
         throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
     }
}
int size;
public	ArrayList1(Collection c){
	 elementData = c.toArray();
     if ((size = elementData.length) != 0) {
         if (elementData.getClass() != Object[].class)
             elementData = Arrays.copyOf(elementData, size, Object[].class);
     } else {
         // replace with empty array.
         this.elementData = EMPTY_ELEMENTDATA;
     }
}

public boolean add(E e) {
    ensureCapacityInternal(size + 1);  
    elementData[size++] = e;
    return true;
}
private void ensureCapacityInternal(int minCapacity) {
    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
    }

    ensureExplicitCapacity(minCapacity);
}
int modCount;
private void ensureExplicitCapacity(int minCapacity) {
    modCount++;

    // overflow-conscious code
    if (minCapacity - elementData.length > 0)
        grow(minCapacity);
}

int MAX_ARRAY_SIZE;
private void grow(int minCapacity) {
    // overflow-conscious code
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity < 0) 
    	newCapacity = minCapacity; 
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
    // minCapacity is usually close to size, so this is a win:
    elementData = Arrays.copyOf(elementData, newCapacity);
}

private int hugeCapacity(int minCapacity) {
	// TODO Auto-generated method stub
	return 0;
}

}

