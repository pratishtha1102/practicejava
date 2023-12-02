public class floy {

    public static void pyramid(int n , int counter){


        for (int i = 1; i<= n; i++){
           
            
            for (int j = 1; j<=i; j++ ){
                
            
                System.out.print(counter + " ");
                counter ++;
                
            }
            
            System.out.println(" ");
           
        }
        

    }
    public static void main(String args[]) {
        pyramid(5,1);

    }
}


    

