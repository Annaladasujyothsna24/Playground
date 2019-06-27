import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
         Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      System.out.print(sum_of_number(n));
	}
  public static int sum_of_number(int x)
  {
    int sum=0;
    for(int i=1;i<=x;i++)
    {
      sum = sum+i;
    
    }
    return sum;
}
}

