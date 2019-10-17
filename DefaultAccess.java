

class A{
	void checkPrint(){
		System.out.println("hello");
	}
}

class DefaultAccess{
	public static void main(String [] args){
		A ob = new A();
         ob.checkPrint();
	}
}