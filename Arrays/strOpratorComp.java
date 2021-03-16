//input
// input must be taken in String
// check given string comparision is valid or not
// input 1: 100 >= 200
// output 0 (false)
  

// input 2: 100 == 100
// output 1 (True)  



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	//	int t = sc.nextInt();
//		sc.close();
	//	while(t>0){
		    
		    String s = sc.nextLine();
		    String a1[] = s.split(" ");
		
		    int a = Integer.parseInt(a1[0]);
		    int b = Integer.parseInt(a1[a1.length-1]);
		
		    String op = a1[1];
		
		    if(op.equals("==")){
		        if(a == b){
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		    else if(op.equals("!=")){
		        if(a != b){
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		    else if (op.equals(">=")){
		        if(a >= b){
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		    } 
		    else if(op.equals("<=")){
		        if(a <= b){
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		    else
		        System.out.println("Invalid Operator");
		
		    
	//	    t--;
	//	}
	}
}
