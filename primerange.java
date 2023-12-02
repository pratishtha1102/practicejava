public class primerange {
    public static void main(String args[]){
        rangeprime(20);

    }
    public static boolean optimised(int n){
        if (n==2){
            return true;
        }

        for (int i = 2 ; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;               
            
            }
            
        }
        return true;

    }
public static void rangeprime(int n)  {
    for (int i = 2; i <=n; i++){
        if (optimised(i)==true){
            System.out.println(i +"");
        }

    }
    System.out.println();
} 
}
