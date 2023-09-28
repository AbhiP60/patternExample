package p1;

public class TriangleReverse {
   
	public static void main(String[] args) {
		
		int i=6;
		int j=6;
		
		for(i=6;i>=1;i--) {
			
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
