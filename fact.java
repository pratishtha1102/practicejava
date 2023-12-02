public class fact{ 
    public static int factorial(int n){
        int facto = 1;
     for (int i =1; i<=n; i++){

        facto = facto * i;
        

     }
    
       return facto;
    } 

    public static void main(String args[]){

        factorial(3);
        System.out.println(factorial(3));

    }
}
    
    

