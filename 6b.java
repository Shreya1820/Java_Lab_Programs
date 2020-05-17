import java.util.Scanner;
class Main
{
    double weight[];
    double profit[];
    double ratio[];
    double cap;
    int nItems;
    Main()
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("********* KNAPSACK PROBLEM-GREEDY METHOD *********");
        System.out.println("Enter the number of items in the store: ");
        nItems = scan.nextInt();
        System.out.println("Enter the (weight and profit) of items: ");
        weight = new double[nItems];
        profit = new double[nItems];
        ratio = new double[nItems];
        for (int i = 0; i < nItems; ++i) {
            weight[i] = scan.nextDouble();
            profit[i] = scan.nextDouble();
            ratio[i] = profit[i] / weight[i]; 
        }
        System.out.println("Enter the capacity of the knapsack: ");
        cap = scan.nextDouble();
    }

    int getNext() 
    {
        double max = 0;
        int index = -1;
        for (int i = 0; i < profit.length; i++) 
        {
            if (ratio[i] > max) 
            {
                max = ratio[i];
                index = i;
            }
        } 
        return index;
    }

    void fill() 
    {
        double cW = 0; //current weight
        double cP = 0; //current profit 
        double select[]=new double[nItems];//marking item selection
        while (cW < cap) 
        {
            int item = getNext();        //next max ratio
            if (item == -1) 
            {
                //No items left
                break;
            }
           if (cW + weight[item] <= cap) 
           {
                cW += weight[item];
                cP += profit[item];
                ratio[item] = 0;  //mark as used for the getNext() (ratio) function
                select[item]=1;           
            }
           else 
           {
                select[item]=(cap-cW)/weight[item];
                cP += (ratio[item] * (cap - cW));
                cW += (cap - cW);            
                break;  //the knapsack is full
            }
        }
        System.out.println("\nItems Selected  Fraction Selected(0/1/Partial) ");
        System.out.println("************************************************");
        for(int i=0;i<nItems;i++)
        	System.out.println("\t"+(i+1)+"\t\t"+select[i]);
        System.out.println("\nMax Profit = " + cP + ", Max Weight = " + cW);
    }

    public static void main(String[] args) {
        Main fk = new Main();
        fk.fill();
    }
}
