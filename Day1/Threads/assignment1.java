package task;

public class assignment1 {
	
	public static void main(String[] args) {
			Thread t1 = new Thread("Scooby") {
				public void run() {
					System.out.println("This is " + Thread.currentThread().getName());
				}
			};
			
			Thread t2 = new Thread("Shaggy") {
				public void run() {
					System.out.println("This is " + Thread.currentThread().getName());
				}
			};
			
			t1.start();
			t2.start();
		}

	}


