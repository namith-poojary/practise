package Dayfour.mite;
import java.util.*;
public class Differ {
public static void main(String[] args) {
	Machine mach=new Machine();
	Thread t1=new Thread(mach,"roger ");
	Thread t2=new Thread(mach," rafa");
	Thread t3=new Thread(mach," novak");
	Thread t4=new Thread(mach,"andy");
	//t1.setPriority(5);
	t1.start();
	t2.start();
	t3.start();
	t4.start();

	
}
}
class Machine extends Thread
{
	int amount;
	static int balance=50000;
	public void withdraw()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the amount");
		
		amount=s.nextInt();
		if(amount<50000)
		{
			System.out.println(" u can withdraw");
			balance-=amount;
			System.out.println("new avail balance is "+balance);
		}
		else
		{
			System.out.println("oops!!u cannot withdraw");
		}
	}
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+
	Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
		withdraw();
	}
}
