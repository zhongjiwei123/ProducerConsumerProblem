package com.thread;

public class main {

	public static void main(String[] args) {
		
		FactoryThread factoryThread=new FactoryThread();
		Thread threadFactory=new Thread(factoryThread);
		threadFactory.start();
		
		CustomerThread customerThread=new CustomerThread();
		Thread threadCustomer=new Thread(customerThread,"消费者一");
		threadCustomer.start();
		
		//消费者1来了之后，1毫秒后消费者在来。
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread threadCustomer2=new Thread(customerThread,"消费者二");
		threadCustomer2.start();
	}
}
