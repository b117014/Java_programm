import java.util.Scanner;

class scope{
	public static void main(String args[]){
             
             {
             	 static int x=10;
             	System.out.println(x);
             }
             System.out.println(x);
	}
}