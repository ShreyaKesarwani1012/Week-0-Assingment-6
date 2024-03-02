import java.util.*;
class  ConditionalOperatorExample{

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st no");
        int a = sc.nextInt();
        
        System.out.println("Enter the 2nd no");
        int b = sc.nextInt();

        int max= (a > b) ? a : b;
        System.out.println("The grt no is "+ max);
        

       


    }
}