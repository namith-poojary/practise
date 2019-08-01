
public class MergeSort {

	/**
	 * @param args
	 */
	public static void sort(double[] source,int start,int mid,int end)
	{
		int leftsize=mid-start;
		int rightsize=
	}
	public static void perform(double[] alpha,int start,int end)
	{
		int mid=0;
		if(start<end)
		{
			mid=start+(end-start)/2;
			perform(alpha,start,mid);
			perform(alpha,(mid+1),end);
			sort(alpha,start,mid,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] mobile={23534,89489.7,90580};
        MergeSort.perform(mobile,0,mobile.length-1);
	}

}
