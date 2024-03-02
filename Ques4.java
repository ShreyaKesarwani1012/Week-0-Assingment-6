import java.util.*;
class Ques4{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the strig");
        String s =sc.nextLine();
        
       
        // for(int i= 0;i<s.length-1;i++){

        // }
        for (int j=(s.length());j>0;j--){
            System.out.print(s.charAt(j-1));
        }
        // System.out.println(s.charAt(2)); as charAt() print char of particlar location 
    }
}