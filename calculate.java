
import java.lang.*;

class Calculator{
    double i;
    double x = Math.sqrt(i);
}


class calculate{
    public static void main(String args[]){
        
       Calculator c = new Calculator();
	c.i = Integer.parseInt(args[0]);
	System.out.println("squre of "+ c.i +"is :" + c.x);

    }
}
