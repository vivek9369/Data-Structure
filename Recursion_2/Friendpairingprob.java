public class Friendpairingprob {
    public static int friendpair(int n){
        //base case
        if (n == 1 || n == 2) {
            return n;
        }
        //Choice Single
        int fnm1 = friendpair(n-1);

        //Pairs
        int fnm2 = friendpair(n-2);
        int pairways = (n-1) * fnm2;

        int totways = fnm1 + pairways;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(friendpair(4));
    }
}
