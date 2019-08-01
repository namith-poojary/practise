package Dayfour.mite;

public class Over extends seek {

	/**
	 * @param args
	 */public void graduate() throws CloneNotSupportedException,ArithmeticException
	 {
		 super.graduate();
	 }
	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
           Over sk=new Over();
           sk.geek();
           sk.professionals();
           sk.graduate();
	}

	
}
class seek
{
	public void geek() throws ClassNotFoundException
	{
		System.out.println("geeks doing invention");
	}
	public void professionals()throws IndexOutOfBoundsException,NullPointerException
	{
		System.out.println("professional building products");
	}
	public void graduate() throws CloneNotSupportedException
	{
		System.out.println("graduate on its way");
	}
}
