import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here	   
      Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i= 1; i <= n; i++)
	    {
            // Handle numbers for each row
	        for(int j= 1; j <= n; j++)
	        {
	            System.out.print(i);
	        }
	        System.out.println();
	    }
	}


	}
