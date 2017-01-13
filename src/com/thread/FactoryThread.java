package com.thread;

public class FactoryThread implements Runnable{

	int i=0;
	
	public void run() {
		while(true){
			i=i+1;
			validate.food.add("工厂生产了面包："+i+"号！");
			System.err.println("工厂生产了面包："+i+"号！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
