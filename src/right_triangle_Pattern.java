
public class right_triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 4;
		for (int i = 1; i<=row; i++ ) { // works for row
			
			for(int j = 1; j<=i; j++) { // works for column
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
