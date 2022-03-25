class Solution {
    public int[] sortedSquares(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        for (int j = 0; j < arr.length; j++)   
{  
for (int k = j + 1; k < arr.length; k++)   
{  
int tmp = 0;  
if (arr[j] > arr[k])   
{  
tmp = arr[j];  
arr[j] = arr[k];  
arr[k] = tmp;  
}  
}   
} 
        return arr;
    }
}