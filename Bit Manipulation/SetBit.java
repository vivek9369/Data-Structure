public class SetBit {
    public static void main(String[] args) {
        int x =11;
        // We have to set 6th bit of x
        x= (x | (1<<6));
        System.out.println(x);
    }
}
