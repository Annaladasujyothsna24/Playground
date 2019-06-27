import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
      int temp, result;
          temp = n1>n2 ? n1:n2;
        result = n3>temp ? n3:temp;
        System.out.println(result);
	}
}