import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int quotient= num/100;
      int firstdigit=quotient%10;
      System.out.println(firstdigit);
	}
}