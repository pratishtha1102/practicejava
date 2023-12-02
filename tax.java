import java.util.*;
public class tax {
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int income= sc.nextInt();
      int tax ;
      if (income<500000){
        System.out.println("no tax");
      }
      else if(income>500000 && income<=1000000){
        System.out.println(tax = (int)(income * 0.10));
      }
    else{
        System.out.println(tax = (int)(income * 0.3));
    }
    }
}
