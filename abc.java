package Com.brig;

public class abc {
	public static void main(String[] args) 
	{  
       int [] arr = new int [] {1, 2, 3, 4, 5 , 6, 7, 8}; //no of times array be rotated 
	       int n = 2; // display number original array
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	      
	        for(int i = 0; i < n; i++){  
	            int j, first;  //rotate array by n no times toward left side 
	          
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++) //storing to data first element is array
	            {  
	               
	                arr[j] = arr[j+1];  // using frist element add then to the end off
	            }  
	         
	            arr[j] = first;  
	        }  
	        System.out.println();  
	      
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	    }}