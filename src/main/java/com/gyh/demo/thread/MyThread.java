package com.gyh.demo.thread;

public class MyThread implements Runnable{
	private String name;
	
	MyThread (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		for(int i = 1; i <= 20; i++) {
			if("ÎÚ¹ê".equals(this.getName())) {
				System.out.println("ÎÚ¹êÅÜÁË" + i + "Ã×");
			} else {
				System.out.println("ÍÃ×ÓÅÜÁË" + i + "Ã×");
			}
			
			try {
				Thread.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread("ÎÚ¹ê"));
		Thread thread2 = new Thread(new MyThread("ÍÃ×Ó"));
 
		thread1.start();
		thread2.start();
	}

}
