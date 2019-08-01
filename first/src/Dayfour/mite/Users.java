package Dayfour.mite;
import java.util.*;


public class Users {

	/**
	 * @param args
	 */
	static Freelancer[] base=new Freelancer[5];
	static int pos;
	static boolean status =false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          base[0]=new Freelancer("namith","c",6,6788);
          base[1]=new Freelancer("iueuiu","c++",6,67882);
          base[2]=new Freelancer("iwenf","java",4,67880);
          base[3]=new Freelancer("hefuio","c",5,67880);
          filter("Data Structures");
	}
	public static void filter(String some)
	{
		for(Freelancer free:some)
		{
			if(free.getSkill().equals(some))
			{
				System.out.println(free);
				status=true;
				break;
			}
			else
			{
				status=false;
			}
		}
		if(status)
		{
			return;
		}
		else
		{
			try
			{
				throw new RogerException(some);
			}
			catch(RogerException e)
			{
				System.out.println(e);
				System.out.println("Enter Another Skill");
				filter(new Scanner(System.in).next());
			}
		}
	}

}
