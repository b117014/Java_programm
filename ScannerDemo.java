
import java.util.Scanner;

public class ScannerDemo{
    public static void main(String args[]){
	Scanner s = new Scanner(System.in);

	System.out.println("Enter first no.");
	int num1,num2;
	num1 = s.nextInt();
	System.out.println("Enter 2nd no.");
	num2 = s.nextInt();
	System.out.println("result is : "+(num1+num2));
    }
}
