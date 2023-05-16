//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = 0;
            n = sc.nextInt();
            int arr[] =  new int[n];  //array of size n
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, n, sum));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Geeks
{
    public static int sumExists(int arr[], int n, int sum)
    {
    //   for(int i=0; i< n; i++){
    //       for (int j=i+1;j<n;j++){
    //           if(arr[i] + arr[j] == sum){
    //               return 1;
    //           }
    //       }
    //   }
    //   return 0;
    
     Map <Integer, Integer> map = new HashMap<>();
     for(int i=0; i<n;i++){
         if(map.containsKey(sum-arr[i])){
             return 1;
         }
       map.put(arr[i], i);         
     }
     return 0;
    }
}