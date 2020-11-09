package com.implementthread;

public class ThreadDemo extends Thread {
	public ThreadDemo() {
		Thread t1=new Thread(this,"Connect");
		Thread t2=new Thread(this,"Create");
		Thread t3=new Thread(this,"Read");
		Thread t4=new Thread(this,"Update");
		Thread t5=new Thread(this,"Delete");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		t2.setPriority(9);
		t2.start();

		t3.start();
		t4.start();
		t5.setPriority(1);
		t5.start();

	}
	public void run() {
		synchronized(this){
		if(Thread.currentThread().getName()=="Connect") {
			System.out.println("Got Connected");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(Thread.currentThread().getName()=="Create") {
			System.out.println("Created");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getName()=="Read") {
			System.out.println("Reading done");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getName()=="Update") {
			System.out.println("Updated");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getName()=="Delete") {
			System.out.println("Deleted");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo obj= new ThreadDemo();
	}

}
