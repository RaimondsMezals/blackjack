package blackjack;

public class Runner {


	static int closest;
	
	public static int returnClosest(int a, int b) {
		
		if(a < 22 && b < 22) {
			
			if(a >= b) {
				
				closest = a;
				
			}else {
				
				closest = b;
				
			}
			
		}else if (a > 21 && b > 21) {
			
			closest = 0;
			
		}else {
			
			if(a < b && b > 21) {
				
				closest = a;
			
			}else {
				
				closest = b;
				
			}
			
		}
		
		return closest;
	}
	
	public static void main(String[] args) {
		
		System.out.println(returnClosest(10,21));
		System.out.println(returnClosest(20,18));
		System.out.println(returnClosest(1,22));
		System.out.println(returnClosest(22,23));
		
	}

}
