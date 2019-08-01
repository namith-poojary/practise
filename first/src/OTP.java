import java.util.Random;
public class OTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuilder build=new StringBuilder();
         Random ran=new Random();
         int num=1;
         while(num<=4)
         {
        	 build.append(ran.nextInt(10));
        	 ++num;
        	 
         }
         System.out.println("Your OTP is "+build);
	}

}
