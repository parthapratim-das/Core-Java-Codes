package com.designpatterns;

public class SingletonClass {
	
	public static void main(String[] args){
		
		MyClass classObj = MyClass.getInstance();
		System.out.println(classObj.value);
	}

}

class MyClass{
	
	int value;
	static MyClass myClassObj;
	
	private MyClass(){
		this.value = 10;
	}
	
	synchronized public static MyClass getInstance(){
		if(myClassObj == null){
			myClassObj = new MyClass();
		}
			return myClassObj;
		
	}
	
}