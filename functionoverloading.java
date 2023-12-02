public class functionoverloading {
    public static void main(String args []){
        // System.out.println(sum(5,7));
        //  System.out.println(sum(2,6,9));
        System.out.println(sum(2,6));
        System.out.println(sum(2.8f,6.5f));

    }
    // //func to calculate sum of a and b no of parameter
    // public static int sum(int a, int b){
    //     int sum = a + b;
    //     return sum;

    // }
    //func to calculate sum of a and b no of parameter
    // public static int sum (int a, int b, int c){
    //     int sum = a +b +c;
    //     return sum;

    // }

//func to calculate sum of a and b no of parameter
    public static int sum(int a, int b){
     int sum = a + b;
        return sum;
    }

    //func to calculate sum of a and b type of parameter

    public static float sum (float a, float b){
        return a + b;

    }
}
