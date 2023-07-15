package LeadersInArray;

import java.util.*;

public class LeadersInArray {
	 public static void leader(int[] arr, int n){

	        int maximum=arr[n-1];
	        for(int i=n-2;i>=0;i--){
	            if(arr[i]>maximum){
	                maximum=arr[i];
	                System.out.print(maximum + " ");
	            }
	        }
	        System.out.print(arr[n-1]);

	    }
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Enter Size of the Array :");
			int number = scan.nextInt();
			System.out.println("Enter elements of the Array :");
	        int[] arr = new int[number];
	        for (int i = 0; i < number; i++) {
	            arr[i] = scan.nextInt();
	        }
	        leader(arr,number);
	    }

}
