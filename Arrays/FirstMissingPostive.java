package Arrays;

import java.util.*;

public class FirstMissingPostive {
    public static Integer findMissingPositive(ArrayList<Integer> arr)
	{
	    Integer min = Integer.MAX_VALUE;
	    
	    Set<Integer> s = new HashSet<Integer>();
	    
	    for(Integer i: arr)
	    {
	        if(i>0)
	            s.add(i); //add all positive values to set
	    }
	        
	    
	    int i=0, k=0,j=0;
		
	    for(j=0; j<arr.size(); j++){
		    if(j>0){
		        if(arr.get(j) < min) min = i;
		    }
	    }
	    
	    k= j-1;
	    
	    int increment =1; //set increment to 1 in order to get next positive integer
	    
	    for(Integer a: arr){
		      if(s.contains(arr.get(k)+increment)){
		        increment++;   //increment by 1 if element is present
	          }
	          
	          else{
	              return (arr.get(k)+increment); //return if element not present in set
	          }
	    }
	    
	    return -1; //this will never run
	}
	
	public static void main (String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNextInt()){
	            arr.add(sc.nextInt());
	    }
	    
	    System.out.println(findMissingPositive(arr));

        sc.close();
	}
}
