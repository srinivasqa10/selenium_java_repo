package assignment_two;

public class Count_of_OddandEven_from_a_num {

	public static void main(String[] args) {
		
		int num = 123456790;
		
		int even_count=0;
		
		int odd_count=0;
		
		while(num>0)
		{
			if(num%2==0)
			{
				num=num/10;
				even_count++;
			}
			else
			{
				num=num/10;
				odd_count++;
			}
			
		}
		
		System.out.println("Count of Even numbers " +even_count);
		System.out.println("Count of Odd numbers " + odd_count);

	}

}
