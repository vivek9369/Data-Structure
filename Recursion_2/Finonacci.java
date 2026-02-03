public class Finonacci {
    public static int fibonacciterm(int n){
        if (n ==0) 
            return 0;
        
        if (n == 1) 
            return 1;
            return fibonacciterm(n-1) + fibonacciterm(n-2);
}
public static void main(String[] args) {
     int n =5;
     System.out.println(fibonacciterm(n));
}
    
}
