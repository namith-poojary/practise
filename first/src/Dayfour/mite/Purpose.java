package Dayfour.mite;
import java.util.*;

public class Purpose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String yet="12345678";
           try{
        	   System.out.println(yet.charAt(new Random().nextInt()));
        	   System.out.println("Random generated");
           }
           catch(StringIndexOutOfBoundsException obj)
           {
        	   System.out.println(obj+"\nrange should be within"+yet.length());
        	   System.out.println(yet.charAt(new Random().nextInt(yet.length())));
        	   System.out.println("Random generated");
           }
           finally{
        	   System.out.println("work is done");
           }
	}

}
