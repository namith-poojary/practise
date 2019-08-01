
public class Bubblesort {

	/**
	 * @param args
	 */
	void bubbleSort(byte arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    byte temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
	void print(byte arr[])
	{
			String s1=new String(arr);
			
	
		System.out.print(s1+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String desired="Data Science";
          byte[] arr=desired.getBytes();
          Bubblesort bs=new Bubblesort();
          bs.bubbleSort(arr);
          System.out.println("the sorted array is");
          bs.print(arr);
	}

}
