package task;

public class WithNoParameter {
	

	@FunctionalInterface
	interface Sayable{
		
		public String  say();
		
	}



			
		public static void main(String ar[]) {
			
			//functional style
			Sayable s =() ->{
				return "hi guys..how are you all?"; 
			};
			System.out.println(s.say());
		}
	}



