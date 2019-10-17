
import java.util.*;

class Array_List{

	public static void main(String args[]){
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 arr.add(5);
		 arr.add(6);
		 arr.add(1);

		arr.get(0);            //  get element at ith index
		arr.remove(0);         // remove element at 0th index
		arr.set(1,9);         // modify elemnt at 1th index with value 9
		 System.out.println(arr);

		// String arr1 = "hello";
		// String arr2 = "hello";
		// System.out.println(arr1==arr2);
	}
}