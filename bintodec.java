//code to change binary to decimal
public class bintodec {
    public static void main(String args[]){
        System.out.println(binatodec(100));

    }
    public static int binatodec(int binarynum){
        int decimal = 0;
        for (int i = 0; binarynum>0;i++){
          int lastdigit = binarynum % 10;
          
          decimal = decimal + (lastdigit * (int)(Math.pow(2, i)));
    
          binarynum = binarynum/10;
          

        }
         return decimal;
    }
    
}
