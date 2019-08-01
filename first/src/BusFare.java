import java.util.*;
public class BusFare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
           int bus=0,seat=0,busfare=0,passenger=0,buscollect=0,total=0;
           Scanner s=new Scanner(System.in);
           bus=1;
           while(bus<=4)
           {
        	   System.out.println("enter the fare amount for bus "+bus);
        	   busfare=s.nextInt();
        	   seat=1;
        	   buscollect=0;
        	   while(seat<=7)
        	   {
        	   
        	   System.out.println("Enter the amt");
        	   passenger=s.nextInt();
        	   if(passenger>=busfare)
        	   {
        		   System.out.println("Yes you can travel");
        		   buscollect+=busfare;
        	   }
        	   else
        	   {
        		   System.out.println("Sorry you cannot travel");
        		   
        	   }
        	   ++seat;
        	   }System.out.println("collection of bus="+bus+" is  "+buscollect);
        	   total+=buscollect;
        	   bus++;
           }
           System.out.println("total collection of corporation:"+total);
           s.close();
           }
	}


