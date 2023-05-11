package multithreading3;

public class Application {

	public static void main(String[] args) {
		Thread thread1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<8;i++)
				{
					System.out.println("HI There !"+i);
					
					try {
						Thread.sleep(800);             //it is control console timing;
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		thread1.start();
	}

}
