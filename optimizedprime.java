public class optimizedprime {

    public static void main(String args[]){
        System.out.println(optimised(8));

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
    
}
