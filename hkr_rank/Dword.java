
import java.util.*
class Dword{


	void remove(String str){
         
         String temp[] = str.split(" ");

         LinkedHashSet<String> newString = new LinkedHashSet<String>(Arrays.asList(temp));
        int index =0;
        StringBuffer st = new StringBuffer();
        for(String s : newString){
           if(index>0){
               st.append(" ");
           }
           st.append(s);
           index++;
        }
       return st;
    }

    public static void main(String []args){
    	Dword d = new Dword();
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	String str[] = new String();
    	for(int i=0;i<n;i++)
    	{
    		str[i] = nextLine();
    	} 
    	for(int i=0;i<n;i++){
    		System.out.println(d.remove(str[i]));
    	}
    }
}