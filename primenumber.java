
public class primenumber {

    public static void main(String args[]){
        System.out.println(isprime(8));

    }
    //only for greater than equal to 2
    public static boolean isprime(int n){
        //  boolean isprime = true;
        //for 2 
        if (n==2){
            return true;
        }
        else{
        for (int i = 2; i <=n-1; i++){
           if( n%i ==0){
            // isprime = false;
            // break;
            return false;
           }
        }
        }
    // return (isprime);
    return true;

    }
    
}
