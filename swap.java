public class swap {


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"and"+b);



    }
    public static void main(String args[]){
        swap(3, 4);
    }
    
}
