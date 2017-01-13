package com.thread;

import java.util.ArrayList;
import java.util.List;

public class CustomerThread implements Runnable{

	public void run() {
		while(true){
			
			if (validate.food.size()==0) {
				System.out.println("工厂还没有生产面包，等待");
			}else {
				
				List<String> customerRongqi=new ArrayList<String>();
				
				try {
					if (validate.food.size()>=3) {
						
						for (int i = 0; i < 3; i++) {
							customerRongqi.add(validate.food.get(i));
						}
						
						validate.food.removeAll(customerRongqi);
						
						for (int i = 0; i < customerRongqi.size(); i++) {
							System.out.println("客户从工厂中拿出了面包："+customerRongqi.get(i));
							
							if(i==customerRongqi.size()-1){
								System.out.println("----------------------还剩下："+validate.food.size()+"个面包");
								System.out.println("----------------------面包为："+validate.food);
							}
							
						}
						
					}else {
						System.out.println("容器中面包不够，消费者等待面包;");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
