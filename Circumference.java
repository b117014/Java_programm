
 class Circle{
    static int count=0;
    public double x,y,r;
   public Circle(double x,double y,double r){
       this.x=x;this.y=y; this.r=r;
	count++;
    }
    public Circle(double x){
        this.x=x;this.y=1;this.r=2;
	count++;
    }

    public Circle(Circle c){
	this(c.x,c.y,c.r);
	count++;
    }

    public double circum(){
        return(2*3.14*r);
    }


}

public class Circumference{
    public static void main(String args[]){
	Circle c1 = new Circle(1,2,3);
	Circle c2 = new Circle(5);
	

	System.out.println(c1.count+"--"+c2.count +"--");
    }
}
