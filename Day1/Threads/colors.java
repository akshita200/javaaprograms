package task;
import java.util.Random;
public class colors implements Runnable {
	

	

		public static void main(String[] args) {
			colors col = new colors();
			Thread t1 = new Thread(col);
			t1.start();
		}

		@Override
		public void run() {
			Random random = new Random();
			String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
			int index;
			
			while ((index = random.nextInt(6)) != 4) {
				System.out.println(colours[index]);
			}		
		}

	}

