//Problem stmt:- https://www.geeksforgeeks.org/trapping-rain-water/



import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		
		int ans = rainWaterStored(a);
		System.out.println("Unit of water can be stored is "+ans+" units");
		
	}
	
	public static int rainWaterStored(int a[]){
	    
	    int ans =0;
	    int n = a.length;
	    
	    // created temp arrays
	    int fromLeft[] = new int[n];
	    int fromRight[] = new int[n];
	    
	    fromLeft[0] = a[0];
	    // put max element from left side
	    for (int i=1;i<n ;i++ )
	        fromLeft[i] = Math.max(fromLeft[i-1],a[i]);
	    
	    fromRight[n-1] = a[n-1];
        // put max elements from right side	    
	    for (int i=n-2;i>=0 ;i--)
	        fromRight[i] = Math.max(fromRight[i+1],a[i]);
	       
	        
	    // actual logic to calculate unit of rain water can be store
	    
	    // get min from left and right array
	    // subtract actual arrays value to get unit of water can store
	    // to that perticular part
	    for(int i=0;i<n;i++){
	        ans += (Math.min(fromLeft[i],fromRight[i]) - a[i]);
	    }
	    
	    return ans;
	}
}
