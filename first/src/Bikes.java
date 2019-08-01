import java.util.Scanner;
public class Bikes {

	/**
	 * @param args
	 */
	static Scanner scan=new Scanner(System.in);
	static int ind;
	public static void add(int[] week)
	{
		int index=0;
		while(index<week.length)
		{
			System.out.println("enter the milage");
			
			week[index]=scan.nextInt();
			index++;
		}
	}
	public static void traverse(int kitkat[])
	{
		if(ind>=kitkat.length)
		{
			return;
		}
		else
		{
			if(kitkat[ind]>=30&&kitkat[ind]<=40)
			{
				kitkat[ind]=25;
			}
			System.out.println(kitkat[ind]);
			ind++;
		}
		traverse(kitkat);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int[] milage=new int[15];
              Bikes.add(milage);
              Bikes.ind=0;
              Bikes.traverse(milage);
	}

}
