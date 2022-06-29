package corejava.assignments.datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,42};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
			if(a[j-1]>a[j])
			{
				temp = a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}

	}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

}
}
