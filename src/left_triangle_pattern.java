
public class left_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 4;
		
		for(int i = 1; i<=row; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k =1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
