package assignment_two;

public class Reverse_a_String {

	public static void main(String[] args) {


		String str = "welcome";
		/*StringBuilder s = new StringBuilder(str);
		
		System.out.println(s.reverse());*/
		
		/*String rev="";
		
		char a[] = str.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev =rev+a[i];
		}
		System.out.println(rev);*/
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	
		

	}

}

