package assignment_two;

public class Count_no_of_digits_in_a_num {

	public static void main(String[] args) {
		int num = 123456;
		
		String str = Integer.toString(num);
		
		System.out.println(str);
		
		int count =0;
		
  		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number of digits " + count);

	}

}
