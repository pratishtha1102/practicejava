public class hardpatter1 {
    public static void main(String args[]){
        hollow(4,7);
        
    }
    public static void hollow(int row, int column){
        //outer 
        for (int i = 1; i<=row; i++){
            //inner
            for (int j = 1; j<=column; j++){
                if (i==1| i == row|| j ==1 | j ==column){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
                
            }
           System.out.println(); 

        }
       
    }
    
}
