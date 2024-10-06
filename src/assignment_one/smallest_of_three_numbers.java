package assignment_one;

public class smallest_of_three_numbers {

	public static void main(String[] args) {
		
		int a=10, b=0, c=3;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number "+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is the smallest number "+b);
		}
		else
		{
			System.out.println("c is the smallest number "+c);
		}

	}

}
