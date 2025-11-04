public class ClearBit {

    public static void main(String[] args) {
        int x = 9;
        x= x &(~(1<<3));
        System.out.println(x);
    }
}