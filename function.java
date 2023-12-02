import java.util.*;
public class function {

    public static void printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("hello");
    }

    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("sum is :"+ sum);

    }
    public static void main(String args []){
    printHelloWorld();
    calculatesum();

    }

}