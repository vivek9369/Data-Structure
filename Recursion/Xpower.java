public class Xpower {
    public static int power(int x, int n){
        if (n==0) {
            return x;
        }
        int xnm1 =power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
