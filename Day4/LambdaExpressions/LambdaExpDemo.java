package task;

public class LambdaExpDemo {
	

	@FunctionalInterface
	interface Drawables{
		
		public void  draw();
		
	}


	
			
		public static void main(String ar[]) {
			
			int width = 10;
			//functional style
			Drawables d =() ->{
				
				System.out.println("draw"+width);
			};
			d.draw();
		}
	}


