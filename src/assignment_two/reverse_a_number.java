package assignment_two;

public class reverse_a_number {

	public static void main(String[] args) {
		
		int x = 1234567;
		
		int rev =0;
		
		while(x!=0)
		{
			rev=rev*10 + x%10;
			
			x=x/10;
		}
		
		System.out.println("Reverse of a Number is " +rev);
		
		

	}

}
