package multithreading2;
 class StartThreads implements Runnable{

	public void run() {
		for(int i=0;i<8;i++)
		{
			System.out.println("HI There !"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 
 }



public class Application {

	public static void main(String[] args) {
	Thread thread1=new Thread(new StartThreads());
	Thread thread2=new Thread(new StartThreads());
	
	thread1.start();
	thread2.start();

	}

}
