package com.thread;

public class main {

	public static void main(String[] args) {
		
		FactoryThread factoryThread=new FactoryThread();
		Thread threadFactory=new Thread(factoryThread);
		threadFactory.start();
		
		CustomerThread customerThread=new CustomerThread();
		Thread threadCustomer=new Thread(customerThread,"������һ");
		threadCustomer.start();
		
		//������1����֮��1�����������������
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread threadCustomer2=new Thread(customerThread,"�����߶�");
		threadCustomer2.start();
	}
}
