package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
		Laptop l1 =  new Laptop("Dell", 8, 800, "code");
		try{
			FileOutputStream fout = new FileOutputStream("D:\\f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(l1);
			out.flush();
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\f.txt"));  
		  Laptop s=(Laptop)in.readObject();  
		  System.out.println(s.cname+" "+s.price + " "+s.code);  
		  
		  in.close(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
