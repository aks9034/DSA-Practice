package Arrays;

import java.util.*;

class pushzerostoend {

	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		int count =0; 
		
		for(Integer k: arr){
		    if(k!=0){
		        arr.set(count,k);
		        count++;  //count no. of non zeros
		    }
		}
		
		while(count<arr.size()){
		    arr.set(count++, 0);
		}
		
		for(Integer z: arr){
	        System.out.println(z);
	   }	
	}
	
	public static void main (String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNextInt()){
	            arr.add(sc.nextInt());
	    }
	    pushZerosAtEnd(arr);

        sc.close();
	}
}