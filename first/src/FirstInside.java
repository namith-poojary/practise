
public class FirstInside {

	/**
	 * @param args
	 */
	  String org;
      double pack;
      static int count;
      public String toString()
      {
   	   return org+" "+pack+" "+count;
      }
      static class Magno
      {
    	  String tech;
    	  public void detail()
    	  {
    		  System.out.println(tech);	 
    		  
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FirstInside first=new FirstInside();
         first.org="infosys";
         first.pack=3.7;
         first.count=10;
         FirstInside second=new FirstInside();
         second.org="tcs";
         second.pack=4.9;
         second.count=15;
         System.out.println(first+" \n"+second);
         FirstInside.Magno mag=new FirstInside.Magno();
         mag.tech="hii";
         mag.detail();
	}

}
