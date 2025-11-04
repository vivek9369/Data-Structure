import java.util.Arrays;

public class CharSort {
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";

        char[] s1Arr = str1.toCharArray();
        char[] s2Arr = str2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
    
        System.out.println(Arrays.equals(s1Arr, s2Arr));

    }
}
