package InterviewCoding;

public class RemoveJunkChar {

	public static void main(String[] args)
	{
		String str = "@#$%^%$#Asdfgds1234";
		String strNew ="";
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>65 && str.charAt(i)<90) || (str.charAt(i)>97 && str.charAt(i)<122) || (str.charAt(i)>48 && str.charAt(i)<57))
			{
				strNew = strNew+str.charAt(i);
			}
			else {
				continue;
			}
		}
		
		System.out.println(strNew);
	}
}
