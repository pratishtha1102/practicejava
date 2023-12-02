import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        
        while(number>0){
            int lastnum=number%10;
            System.out.print(lastnum);
            number= number/10;
        }
        System.out.println();

    }
    
}
