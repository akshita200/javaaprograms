package task;

public class Threadlambda {
	
		   public static void main(String args[]) {
		      
		      new Thread(() -> { // Lambda Expression
		         for(int i=1; i <= 5; i++) {
		            System.out.println("A thread prints:A"+i);
		            try {
		              // Thread.sleep(500);
		            } catch(Exception e) {
		               e.printStackTrace();
		            }
		         }
		      }).start();
		      
		      for(int j=1; j < 5; j++) {
		         System.out.println("B thread prints:B"+j);
		         try {
		            Thread.sleep(500);
		         } catch(Exception e) {
		            e.printStackTrace();
		         }
		      }
		   }
		}


