
public class SecondInside {

	/**
	 * @param args
	 */
	String product;
	float monitorSize;
	class Enqiry{
		int prize;
		 public void show()
		{
			System.out.println(product+" "+monitorSize+" "+prize);
		}
			public void greetings()
			{
				System.out.println(product+" are going to display");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               SecondInside sec=new SecondInside();
               sec.product="bat";
               sec.monitorSize=10.4F;
               Enqiry en=sec.new Enqiry();
               en.prize=100;
               en.show();
               en.greetings();
               
	}

}
