import java.util.*;
class Main{
  public static void main(String args[]){
  String s = "ABSDF";
  System.out.println(reverseWord(s));
  }



class Reverse
{
   
    public static String reverseWord(String str)
    {
        // Reverse the string str
      String ans = "";
        
        for(int j = str.length()-1;j>=0;j--){
            ans += str.charAt(j);
        }
        
        return ans;
    }
}

}
