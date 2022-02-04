package com.cts.exception;

import java.io.File;
import java.io.IOException;

public class Complietime {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.cts.exception.ExcetionDemo");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// TODO Auto-generated method stub
File f=new File("D:\\file.txt");
try {
	f.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	
	


}
