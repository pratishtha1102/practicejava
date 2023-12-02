public class dectobin {
    public static void main(String args[]){
        System.out.println(dectobina(5));



    }
    public static int dectobina(int num){
        int dec=0;
        for (int i=0; num>0; i++){
            int rem = num%2;
            dec = dec + (rem * (int)(Math.pow(10,i)));
            num = num/2;
        


        }
        return dec;
    }
    
}
