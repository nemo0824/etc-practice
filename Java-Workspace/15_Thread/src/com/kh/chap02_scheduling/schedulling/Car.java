package com.kh.chap02_scheduling.schedulling;

public class Car implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i =0; i<20; i++) {
			
		
		
		try {
			System.out.println("car driving ...");
			//스레드를 지정된 시간(ms)만큼 지연시키는(일시정지시키는) 메서드
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		
		
		
		
		}
		
		
		
	}
	

}
