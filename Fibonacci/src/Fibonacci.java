
public class Fibonacci {

	public static void main(String[] args) {
	
		
			long vorletztes = 1;
			long letztes=1;
			long fib= 0;
			
			for (int i = 3; i<=1000; i++) {
				fib= vorletztes+letztes;
				System.out.println(i+":" + fib);
				vorletztes=letztes;
				letztes=fib;
				
				
			}
			
		}
		
		
	}


