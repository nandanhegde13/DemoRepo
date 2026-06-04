package InterviewCoding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Selenium";
		String reverse = "";
	 
		for(int i=str.length()-1; i>=0; i--)
		{ 	 
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);

	//Alternative method
		
//		StringBuffer sf = new StringBuffer(str);
//		System.out.println(sf.reverse());
	
	
	}

}
