import java.util.ArrayList;

public class streams {

	public static void main(String[] args) {

           ArrayList<String> names = new ArrayList<String>();
           names.add("Abhijit");
           names.add("Akshay");
           names.add("Nandan");
           names.add("Harish");
           int count = 0;
           for(String name:names)
           {
        	   if(name.startsWith("A")) {
        		   count++;
        	   }
           }
           
           System.out.println(count);
           
          long count1 =  names.stream().filter(s->s.startsWith("A")).count();
          System.out.println(count1);
	}

}
