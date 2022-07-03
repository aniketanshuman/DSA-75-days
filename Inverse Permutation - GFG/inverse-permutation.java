// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.inversePermutation(arr, sizeOfArray);
		    for(int i: ans)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        ArrayList<Integer> arrLi = new ArrayList<>();
        int res[] = new int[n];
        for (int i=0; i<arr.length; i++ ){
            int val = arr[i];
            res[val-1] = i+1;
        }
        for(int i=0; i< n; i++){
            arrLi.add(res[i]);
        }
       return arrLi; 
    }  
}