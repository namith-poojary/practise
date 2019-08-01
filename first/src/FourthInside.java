
public class FourthInside {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new Merchant().gets();
              new Merchant().get(2);
	}

}
class Merchant
{
	int price[]={8923,90385,9049};
	public void get(int index)
	{
		System.out.println(price[index]);
		
	}
	public void gets()
	{
		for(int k:price)
		{
			System.out.println(k);
		}
	}
	
}
