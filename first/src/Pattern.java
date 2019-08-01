
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int space=1;
            char setone='A';
            char settwo='c';
            int letters=0,row=4;
            while(row>=1)
            {
            	space=1;
            	while(space<row)
            	{
            		System.out.print(" ");
            		space++;
            		if(row<3)
            		{
            			settwo+=row;
            		}
            		else
            		{
            			setone+=row;
            		}
            	}
            	letters=4;
            	while(letters>=row)
            	{
            		if(row<3){System.out.print(settwo);settwo+=row;}
            		else{System.out.print(setone);setone+=row;}
            		letters--;
            	}
            	System.out.println();
            	row--;
            		
            }
	}

}
