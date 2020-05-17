import java.util.Scanner;
class Prims_algo
{
	int n;
	int a[][]=new int[10][10];
	
	void read_adjacency_matrix()
	{
		System.out.println("********* PRIMS ALGORITHM *********");
		System.out.println("Enter number of nodes");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		System.out.println("Enter the cost adacency matrix");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
	
		scan.close();
	}
	
	void find_minimum_spanning_tree()
	{
		int min,u=0,v=0,k=0,count=0,cost=0,i,j;
		int visited[]=new int[20];
		int t[][]=new int[20][3];
		visited[1]=1;
		while(count!=(n-1))
		{
			for(i=1,min=999;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(visited[i]==1 && visited[j]==0 && min > a[i][j])
					{
						
						min=a[i][j];
						u=i;
						v=j;	
					}
				}
			}	
			if(min==999)
				break;
			t[k][0]=u;
			t[k][1]=v;
			t[k][2]=min;
			visited[v]=1;
			cost+=min;
			k++;
			count++;
	}//end of while
		if(count==n-1)
		{
			System.out.println("The min cost spanning tree with edges is");
			System.out.println("*******************");
			System.out.println("Edge"+"\t"+"Weight");
			System.out.println("*******************");
			for(i=0;i<k;i++)
				System.out.println(t[i][0]+"->"+t[i][1]+"\t"+t[i][2]);
			System.out.println("************************");
			System.out.println("cost of spanning tree="+cost);
			System.out.println("************************");
		}
		else
			System.out.println("spanning tree does not exist");
}
}

class Main
{
	public static void main(String[] args) 
	{
		Prims_algo p=new Prims_algo();
		p.read_adjacency_matrix();
		p.find_minimum_spanning_tree();
	}
}

