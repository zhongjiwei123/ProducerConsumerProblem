package com.thread;

import java.util.ArrayList;
import java.util.List;

public class CustomerThread implements Runnable{

	public void run() {
		while(true){
			
			if (validate.food.size()==0) {
				System.out.println("������û������������ȴ�");
			}else {
				
				List<String> customerRongqi=new ArrayList<String>();
				
				try {
					if (validate.food.size()>=3) {
						
						for (int i = 0; i < 3; i++) {
							customerRongqi.add(validate.food.get(i));
						}
						
						validate.food.removeAll(customerRongqi);
						
						for (int i = 0; i < customerRongqi.size(); i++) {
							System.out.println("�ͻ��ӹ������ó��������"+customerRongqi.get(i));
							
							if(i==customerRongqi.size()-1){
								System.out.println("----------------------��ʣ�£�"+validate.food.size()+"�����");
								System.out.println("----------------------���Ϊ��"+validate.food);
							}
							
						}
						
					}else {
						System.out.println("��������������������ߵȴ����;");
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
