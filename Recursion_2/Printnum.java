public class Printnum{
    public static void printnumber(int n){
        if (n == 0) {
            return;
        }
        printnumber(n-1); //Increasing ord
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =5;
        printnumber(n);
    }
}