import java.util.Scanner;

public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan=new Scanner(System.in);
            String model=" ";
            System.out.println("Please Mention Model");
            model=scan.nextLine();
            
            switch(model)
            {
            case "R15":
            	System.out.println("There are one owner price of prize 65000");
            	break;
            case "Enfield":
            	System.out.println("Enter the year of registration");
            	int reg=scan.nextInt();
            	if(reg>=2016)
            	{
            		int prize=75000;
            		System.out.println("There are two owners price of prize"+prize);
            		System.out.println("Do you want an emi?");
            		String ans=scan.next();
            		if(ans=="yes")
            		{
            			int interest
            		}
            		else
            		{
            			
            		}
            	}
            	else
            	{
            		System.out.println(" There is one owner of prize 65000");
            	}
            	
            	
            	break;
            case "Avenger220":
            	System.out.println("There are one owner price of prize 68000");
            	break;
            case "Splender":
            	System.out.println("There are three owners price of prize 85000 ");
            	break;
            	
            }
            scan.close();
	}

}
