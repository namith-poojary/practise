import java.util.Scanner;

public class Trapezium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner s=new Scanner(System.in);
                
                int val=1;
                for(int i=4;i>0;i--)
                {
                	for(int j=0;j<i;j++)
                	{
                		System.out.print(val+"*");
                		++val;
                	}
                	System.out.println();
                }
	}

}
