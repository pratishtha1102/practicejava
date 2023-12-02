public class binomial {
    public static int factorial(int n){
        int facto = 1;
     for (int i =1; i<=n; i++){

        facto = facto * i;
        

     }
    
       return facto;
    } 

    public static int binocoe(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factnr = factorial(n-r);
        int binocoff = fact_n / (fact_r * factnr);
        return binocoff;
    }
    public static void main(String args[]){

        System.out.println(binocoe(5,2));

    }


    
}
