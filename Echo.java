
import java.lang.*;
public class Echo{
    public static void main(String args[]){
	System.out.println("hello");
	for(int i=0;i<args.length;i++){
	    System.out.println(args[i]+" ");
	}
	System.exit(0);
    }
}
