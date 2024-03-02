import java.util.*;
class Ques5{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the strig");
        String s =sc.nextLine();
        String s2 = "";

        for (int j= s.length() ; j>0 ; j--){

             System.out.print(s.charAt(j-1));
             
            s2 = s2 + s.charAt(j-1);
        
        }
          
        if(s.equals(s2))
        {
            System.out.println("  The given string is palindrome");
        }
        else
        {
            System.out.println("  The given string is not palindrome");
        }
        
        
    }

}