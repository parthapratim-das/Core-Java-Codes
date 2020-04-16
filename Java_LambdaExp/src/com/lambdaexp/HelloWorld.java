package com.lambdaexp;

@FunctionalInterface
interface Printer{
	public void printMessage();
}

public class HelloWorld {

	public static void main(String[] args) {
		Printer ptr = ()-> System.out.println("Hello World");
		ptr.printMessage();
	}

}
