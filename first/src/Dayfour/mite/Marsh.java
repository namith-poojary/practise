package Dayfour.mite;

public class Marsh implements Cloneable {

	/**
	 * @param args
	 */
	String bike;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
       Marsh m1=new Marsh();
       m1.bike="Avenger";
       Marsh m2=new Marsh();
       m2.bike="R15";
       Marsh m3=new Marsh();
       m3=m2;
       System.out.println(m1.bike+" "+m2.bike);
       Marsh m4=new Marsh();
        m4=(Marsh)m1.clone();
       m1.bike="mahindra";
       System.out.println(m4.bike+" "+m1.bike);
       
	}

}
