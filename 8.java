import java.util.Scanner;
class Kruskal_algo
{
	int n;
	int a[][]=new int [10][10];
	void read_cost_adjacency_matrix()
	{
		System.out.println("********* KRUSKAL'S ALGORITHM *********");
		System.out.println("Enter number of nodes");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		System.out.println("Enter the cost adjacency matrix");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		scan.close();
	}
	void find_minimum_spanningtree()
	{
		int parent[]=new int[10];
		int t[][]=new int[10][3];
		
		for(int i=1;i<=n;i++)
		{
			parent[i]=i;
		}
		int count=0,sum=0, k=0,u=0,v=0;
		
		while(count!=n-1)
		{
			int min=999;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(a[i][j]!=0 && a[i][j]<min)
					{
						min=a[i][j];
						u=i;
						v=j;
					}
				}
			}
			
			if(min==999)
				break;
			int i=u;
			while(parent[i]!=i) 
				i=parent[i];
			
			int j=v;
			while(parent[j]!=j) 
				j=parent[j];
			
			if(i!=j)
			{
				t[k][0]=u;
				t[k][1]=v;
				t[k][2]=min;
				k++;
				sum=sum+min;
				parent[j]=i;
				count++;
			}
			
			a[u][v]=a[v][u]=999;
		}
		if(count==n-1)
		{
			System.out.println("The min cost spanning tree with edges is");
			System.out.println("*******************");
			System.out.println("Edge"+"\t"+"Weight");
			System.out.println("*******************");
			for(int i=0;i<n-1;i++)
				System.out.println(t[i][0]+"->"+t[i][1]+"\t"+t[i][2]);
			System.out.println("Cost of the Spanning tree="+sum);
		}
		else
		System.out.println("Spanning tree does not exist");
	}
}	
class Main
{
	public static void main(String[] args)
	{
		Kruskal_algo k=new Kruskal_algo();
		k.read_cost_adjacency_matrix();
		k.find_minimum_spanningtree();
	}
}
