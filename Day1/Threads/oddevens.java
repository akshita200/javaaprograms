package task;

public class oddevens implements Runnable {
	

	
		static Thread oddThread;
		static Thread evenThread;

		public static void main(String[] args) {
			oddevens oe = new oddevens();
			
			oddThread = new Thread(oe, "OddThread");
			evenThread = new Thread(oe, "EvenThread");
			
			oddThread.start();
			evenThread.start();
		}

		
		public void run() {
			try {
				if (Thread.currentThread().getName().equals("OddThread")) 
					evenThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 1; i <= 20; i++) {
				if (Thread.currentThread().getName().equals("EvenThread")) {
					if (i % 2 == 0) System.out.println(i);
				} 
				
				if (Thread.currentThread().getName().equals("OddThread")) {
					if (i % 2 == 1) System.out.println(i);
				}
			}
		}

	}


