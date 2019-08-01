
public class Selection {
	public static void sort(String[] oreo)
	{
		 int pos=0,con=0;
         String temp=null;
         while(pos<oreo.length)
         {
      	   con=pos+1;
      	   while(con<oreo.length)
      	   {
      		   if(oreo[pos].compareTo(oreo[con])>0)
      		   {
      			   temp=oreo[pos];
      			   oreo[pos]=oreo[con];
      			   oreo[con]=temp;
      		   }
      		   con++;
      	   }
      	   pos++;
         }
}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String orgs[]={ "roger","nadal","djokovic"   };
           Selection.sort(orgs);
           for(String s:orgs)
           {
        	   System.out.println(s);
           }
           
           }

}
