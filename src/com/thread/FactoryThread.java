package com.thread;

public class FactoryThread implements Runnable{

	int i=0;
	
	public void run() {
		while(true){
			i=i+1;
			validate.food.add("���������������"+i+"�ţ�");
			System.err.println("���������������"+i+"�ţ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
