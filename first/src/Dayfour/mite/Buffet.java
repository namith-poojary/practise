package Dayfour.mite;

public class Buffet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Veg v=new Veg();
                   NonVeg non=new NonVeg();
                   Thread t1=new Thread(v,"namith");
                   Thread t2=new Thread(non,"chutiya mufeed");
                   Thread t3=new Thread(v,"dogra");
                   Thread t4=new Thread(non,"goyaa");
                   Thread t5=new Thread(v,"anusaa");
                  
                   t1.start();
                   t2.start();
                   t3.start();
                   t4.start();
                   t5.start();
                   
	}

}
class Veg implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"had veg biryani ");
		System.out.println(Thread.currentThread().getName()+"had curd rice");
		if(Thread.currentThread().getName().equals("namith"))
				{
			Thread.currentThread().stop();
				}
		System.out.println(Thread.currentThread().getName()+"had dessert");
	}
	
}
class NonVeg implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"had non veg biryani ");
		
		if(Thread.currentThread().getName().equals("chutiya mufeed"))
				{
			try {
			Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
		System.out.println(Thread.currentThread().getName()+"had dessert");
	}
	
}