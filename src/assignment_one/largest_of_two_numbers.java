package assignment_one;

public class largest_of_two_numbers {

	public static void main(String[] args) {
		int a=50, b=70;
		
		//using if-else
		
		/*if(a>b)
		{
			System.out.println("a is the largest number "+a);
		}
		else
			System.out.println("b is the largest number "+b);
		}*/
		
		//using terenary operator
		
		String res =(a>b)? "a is larger number" :"b is the larger number";
		
		System.out.println(res);
		
	}
		

}
