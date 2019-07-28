package clock;

import display.Display;

public class Clock {
	private Display hours=new Display(24);
	private Display minute=new Display(60);
	public void start() throws InterruptedException {
		while(true) {
			
			minute.tik();
			if(minute.publicgetValue()==0) {
				hours.tik();
			}
			Thread.currentThread();
			Thread.sleep(1000);
			System.out.printf("%02d:%02d\n",hours.publicgetValue(),minute.publicgetValue());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Clock clock=new Clock();
		clock.start();

	}

}
