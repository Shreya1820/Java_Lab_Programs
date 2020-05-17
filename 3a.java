import java.util.Scanner;
class Main
 {
 public static void main(String[] args)
 {
 	Scanner inputDevice = new Scanner(System.in);
 System.out.print("Please enter first number(numerator): ");
 int numerator = inputDevice.nextInt();
 System.out.print("Please enter second number(denominator): ");
 int denominator = inputDevice.nextInt();
 try
 {
 new Main().doDivide(numerator, denominator);
 	}
 catch (Exception e)
 	{
 		System.out.println("Exception Condition Program is ending ");
 	}
 }
 public void doDivide(int a, int b) throws Exception
 {
 float result = a/b;
 System.out.println("Division result of "+ a +"/"+b +"= " +result);
 }
}

