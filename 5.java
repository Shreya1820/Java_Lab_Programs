import java.util.Random;
import java.util.Scanner;

class Main
{
  static int max=30000;
	public static void main(String[] args)
	{
		int a[]=new int[max];
        		long start,end;
        		Scanner sobj=new Scanner (System.in);
System.out.println("********QUICK SORT ALGORITHM********");
		System.out.println("Enter the no. of elements to be sorted :");
		int n=sobj.nextInt();
		Random rand=new Random();
		for(int i=0;i<n;i++)
		{
			a[i]=rand.nextInt(100);
		}
		System.out.println("Array elements to be sorted are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		a[n]=9999;
		start=System.nanoTime();
		qsort(a,0,n-1);
		end=System.nanoTime();
		System.out.println("\nThe sorted elements are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nThe time taken to sort is "+(end-start)+"ns");
		System.out.println("******************************************");
	}//end of main
	
	static void qsort(int a[],int low,int high)
	{
		int s;
		if(low<high)
		{
s=partition(a,low,high);//s is the final position of pivot element in a[low:high]
			qsort(a,low,s-1);
			qsort(a,s+1,high);
		}
	}
	
	static int partition(int a[],int low,int high)
	{
		 int pivot,i,j;
		 pivot=a[low];
		 i=low;
		 j=high;
		 while(i<=j)
		 {
			 while(a[i]<=pivot) 
			     i++;
			 while(a[j]>pivot) 
			     j--;
			 if(i<j)
				swap(a,i,j);
		 }
		 a[low]=a[j];
		 a[j]=pivot;                                                                                                                                                                                                                                               
		 return j;
	}
	
	static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
