public class ToweHanoi {
    public static void toh(int n , String A , String B , String C){
        if (n == 0) {
            return;
        }
        // Move n- 1 disk to A to B using C
        toh(n- 1, A, B, C);

         System.out.println("Move disk " + n + " from " + A + " to " + C );

         // Move n-1 disk form B to C using C 
         toh(n- 1, B, C, A);
    }
    public static void main(String[] args) {
         int n =3;
         String A = "A" ;
         String B = "B";
         String C = "C"; 
         toh(n, A, B, C);
    }
}
