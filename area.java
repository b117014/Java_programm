class Shape{
	private int x,y,z;

	Shape(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
}

class Triangle extends Shape{
	int b,h;
  
	Triangle(int b,int h,int c){
		 	super(b,h,c);
		this.b=b;
		this.h=h;
	
	}
}

class Circle extends Triangle{
	int r;

	Circle(int r,int a,int b,int c){
		super(a,b,c);
		this.r=r;
		
	}
}

class area{
	public static void main(String [] args){
		Circle c = new Circle(1,2,4,5);
		System.out.println(c.r);
	}
}