public class OddEven {
    public static void OddorEven(int n){
       int bitMask =1;
       if ((n & bitMask)==0){
        //Even Number
    System.out.println("Even number");        
       } else{
        System.out.println("Odd Number");
       }
    }
    public static void main(String[] args) {
        OddorEven(11);
        OddorEven(6);
        OddorEven(9);

        
    }
}
