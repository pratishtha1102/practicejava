import java.util.*;
public class passfail {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        // if (number>33){
        //     System.out.println("pass");
        // }
        // else{
        //     System.out.println("fail");
        // }
        String type = (number>33)? "pass":"fail";
        System.out.println(type);
    }
    
}
