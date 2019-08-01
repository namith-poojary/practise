package Dayfour.mite;
import java.util.Scanner;
public class Mall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Games game=new Games();    
         Shopping shop=new Shopping(game);
         Thread t1=new Thread(game,"namith");
         Thread t2=new Thread(shop,"federer");
         t2.start();
         t1.start();
       
	}
}
class Shopping implements Runnable
{
	Games g;
	Shopping(Games temp)
	{
		g=temp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(g.scan)
		{
			if(g.amount<500)
			{
				System.out.println(Thread.currentThread().getName()+"going to notify");
				g.scan.notify();
			}
		}
		System.out.println(Thread.currentThread().getName()+"Shopping in levis and somewhere");
	}
	
}
class Games implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int amount;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (scan)
		{
			System.out.println("enter the prize for the entry ticket");
			amount=scan.nextInt();
			if(amount<=500)
			{
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" you can enjoy  ");
		}
	}
}