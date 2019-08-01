package access.mite;

public class Consts extends Brilliant{
            public static void main(String args[])
            {
            	Consts con=new Consts();
            	con.spring();
            	con.hibernate();
            }

			@Override
			public void spring() {
				// TODO Auto-generated method stub
				super.spring();
			}
}
class Brilliant
{
	public void spring()
	{
		System.out.println("basic web application");
		
	}
	final public void hibernate()
	{
		System.out.println("orm module");
	}
	final private class Android
	{
		public void skill()
		{
			System.out.println("done");
		}
	}
}
