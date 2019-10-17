 class Hello{

	final void printing(){
       System.out.println("Hello");
	}
}

class Run extends Hello{
	  void toPrint(){
	  	 super.printing();
	  }
	   
}

class Inheritance{
	public static void main(String [] args){
		Run r= new Run();
		r.toPrint();
	}
}