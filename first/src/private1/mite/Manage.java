package private1.mite;

public class Manage implements Operate {

	/**
	 * @param args
	 */
	freelancer free[]=new freelancer[5];
	static int pos;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        freelancer f=new freelancer("Namith","java",7,450000); 
        freelancer g=new freelancer("abc","python",7,45000); 
        freelancer h=new freelancer("xyz","c++",4,5000); 
        freelancer i=new freelancer("novak","java",7,4500);
        Merge m=new Merge();
        m.insert(f);
        m.insert(g);
        m.insert(h);
        m.insert(i);
        pos=0;
        m.search("python");
        
	}
	@Override
	public void insert(freelancer free)
	{
		for(int index=0;index<base.length;index++)
		{
			if(base[index]==null)
			{
				base[index]=free;
				System.out.println(free.getName()+"Lancer Added");
				break;
			}
		}
	}
	@Override
	public void search(String tech)
	{
		if(pos>=base.length-1){return;}
		else
		{
			if(base[pos].getSkill().equalsIgnoreCase(tech))
			{
				System.out.println(base[pos]);
				pos++;
			}
			search(tech);
		}
	}

}
