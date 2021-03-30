import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Integer.MIN_VALUE;
		String ans ="";
		
		  
		if((a + b) > min ){
		    ans = "+";
		   min = (a+b);
		}
		
		if((a-b) > min){
		    ans = "-";
		    min = (a-b);
		}
		
		if((a*b) > min){
		    ans = "X";
		    min = (a*b);
		}
		
		if ((a/b) > min){
		    ans = "/";
		    min = (a/b);
		} 
		
		System.out.println("maximum sum using operator is "+ ans);
	}
}
