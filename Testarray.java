class Testarray{
    public static void main(String args[]){
	int arr[] ={1,2,3,4,5};
	for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
	}
	float sum=0,avg;

	for(int i=0;i<arr.length;i++){
            sum+=arr[i];
	}

	avg = sum/arr.length;
	System.out.println("average is :"+avg);
    }

}
