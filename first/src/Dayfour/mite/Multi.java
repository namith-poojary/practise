package Dayfour.mite;
import java.util.*;
public class Multi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("tcs services");
			String name=null;
			int exp[]={7,8,9,9,3,45};
			int index=0;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the name");
			name=s.next();
			try{
			System.out.println("mention experience by index");
			index=s.nextInt();
			System.out.println("Selected exp"+exp[index]);
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
				System.out.println(ar+"\n index should be within:"+exp.length);
				index=s.nextInt();
				System.out.println("Selected exp:"+exp[index]);
			}
			catch(InputMismatchException in)
			{
				Scanner g=new Scanner(System.in);
				System.out.println(in+"\n Enter only numbers within:"+exp.length);
				index=g.nextInt();
				System.out.println("Selected exp:"+exp[index]);
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
			if(exp[index]>=2&&exp[index]<4)
			{
				System.out.println(name+" will get 15 lpa");
			}
			else if(exp[index]>=5&&exp[index]<7)
			{
				System.out.println(name+" will get 20 lpa");
			}
			else
				System.out.println(name+" will get 30 lpa");
			}
		s.close();	
	}

}
