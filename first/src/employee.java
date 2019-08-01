
public class employee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name=" ";
        String Companyname=" ";
        int salary=0;
        int experience=0;
        experience=Integer.parseInt(args[3]);
        salary=Integer.parseInt(args[2]);
        name=args[0];
        Companyname=args[1];
        System.out.println("Details:"+name+" "+Companyname+" "+salary+" "+experience );
        System.out.println("one third of salary is "+(salary)/3);
        System.out.println("one fourth of salary is "+(salary)/4);
        if(experience>=2&&experience<=4)
        {
        	System.out.println("Team Head");
        }
        else if(experience>4 && experience<=8)
        {
        	System.out.println("Project Manager   ");
        }
        else if(experience>8)
        {
        	System.out.println(" BDM");
        }
        else
        {
        	System.out.println("No experience");
        }
              
               
	}

}
