package training;

import java.util.Arrays;

import java.util.ArrayList;

import java.util.List;

public class almostIncreasing {
	
	public static void main(String[] args)throws Exception{
		
		int[] arr1 = {1,2,3,4};
		
		int[] arr2 = new int[arr1.length-1];
		
		int[] arr3 = new int[arr1.length-1];
		
		int a,b,c,d;
		
		
		for(int i = 0; i < arr1.length; i++) {
			
			a=0;
			b=i;
			c=i+1;
			d=arr1.length;
			
			
			if(b == 0) {
				
			} else if(c == arr1.length) {
				
			}
			
			
			
			arr2 = Arrays.copyOfRange(arr1, a, b);
			arr3 = Arrays.copyOfRange(arr1, c, d);
			
			List list = new ArrayList(Arrays.asList(arr2));
		    list.addAll(Arrays.asList(arr3));
		    Object[] arr4 = list.toArray();
		    
		    //Object[] arr5 = Arrays.sort(arr4);
			
			
			System.out.println("i = " + i + Arrays.toString(arr2) + "[x]" + Arrays.toString(arr3));
			
			
			
		}
		
		
	}
	

}
