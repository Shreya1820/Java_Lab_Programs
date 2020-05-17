import java.util.Scanner;
class Main 
{
  public void solve(int[] wt, int[] val, int W, int N)
  {
   int i,j;
   int sol[][] = new int[N + 1][W + 1];
   int selected[] = new int[N+1];
 
 for ( i = 0; i <= N; i++)
   {
for ( j = 0; j <= W; j++)
{
    	  		if(i==0||j==0)
    	  			sol[i][j]=0;
    	  	else if(wt[i]>j)
    	  			sol[i][j]=sol[i-1][j];
    	  	else
    	  			sol[i][j]=Math.max(sol[i-1][j],(sol[i - 1][j - wt[i]] + val[i]));
 }
 }  
 System.out.println("The profit table is:: ");
 for(i=0;i<=N;i++)
 {	 
	 for(j=0;j<=W;j++)
		 	System.out.print(sol[i][j]+"  ");
	 System.out.println();
 }
 System.out.println("The optimal profit obtained is "+sol[N][W]);

 i=N;
 j=W;
 while (i>0&&j>0)
 {
	 if (sol[i][j] !=sol[i-1][j])
	 {
		 selected[i] = 1;
		 j = j - wt[i];
	 }
	 i--;
 }

 System.out.println("\nItems selected : ");
 for(i=1;i<=N;i++)
	 if (selected[i] == 1)
		 System.out.print(i +" ");
 System.out.println();
 }

  	public static void main(String[] args)
  	{
  		Scanner scan = new Scanner(System.in);
  		Main ks=new Main();
  		System.out.println("***** KNAPSACK PROBLEM - DYNAMIC PROGRAMMING *****");
   		System.out.println("Enter number of elements ");
  		int n = scan.nextInt();
  		int wt[] = new int[n + 1];
  		int val[] = new int[n + 1];
  		System.out.println("\nEnter weight for "+ n +" elements");
  		for (int i = 1; i <= n; i++)
  			wt[i] = scan.nextInt();
  		System.out.println("\nEnter profit value for "+ n +" elements");
  		for (int i = 1; i <= n; i++)
  			val[i] = scan.nextInt();
  		System.out.println("\nEnter knapsack weight ");
  		int W = scan.nextInt();
  		ks.solve(wt, val, W, n);
  }
 }

