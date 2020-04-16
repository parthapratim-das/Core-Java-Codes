package com.lambdaexp;


public class ThreadBasicLambda{

	public static void main(String[] args){
		Runnable r = ()->{
			for(int i=0;i<10;i++){
				System.out.println("Child Process- "+i+1);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int j=0;j<10;j++){
			System.out.println("Parent Process- "+j+1);
		}
	}

}
