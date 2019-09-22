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
			if("�ڹ�".equals(this.getName())) {
				System.out.println("�ڹ�����" + i + "��");
			} else {
				System.out.println("��������" + i + "��");
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
		Thread thread1 = new Thread(new MyThread("�ڹ�"));
		Thread thread2 = new Thread(new MyThread("����"));
 
		thread1.start();
		thread2.start();
	}

}
