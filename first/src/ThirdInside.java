
public class ThirdInside {

	/**
	 * @param args
	 */
	int suit=40;
	 public void root(long temp)
     {
     	long AccNo=temp;
     	class React{
     		public void display()
     		{
     			System.out.println(ThirdInside.this.suit);
     		}
     	}
     	System.out.println(AccNo);
     	React re=new React();
     	re.display();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ThirdInside third=new ThirdInside();
           third.root(891274978);
          
	}

}
