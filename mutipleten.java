import java.util.Scanner;

public class mutipleten {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        do{
            int num = sc.nextInt();
             if (num%10 ==0){
            break;
        }
        System.out.println(num);
        }
       while(true);
        }
    }

