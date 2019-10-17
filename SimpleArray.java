import java.util.*;

class SimpleArray{
    public static void main(String args[]){
	ArrayList <Integer> arr = new ArrayList<Integer>();
	System.out.println("enter element in array");
	double sum=0,avg=0;
	Scanner input = new Scanner(System.in);
	while(input.hasNextInt()){
            arr.add(input.nextInt());
	}

	for(int i=0;i<arr.size();i++){

	    sum+=arr.get(i);
	}

	avg= sum/(arr.size());

	System.out.println("average is : "+avg);
    }
}
