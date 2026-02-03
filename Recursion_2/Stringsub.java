public class Stringsub {
    public static int countsum(String str, int si , int ei){
        if (si > ei) {
            return 0; 
        }
        if (si > ei) {
            return 1;
        }
        int firstCharRemove = countsum(str, si+1, ei);
        int lastCharRemove = countsum(str, si, ei-1);
        int firstLastCharRemove = countsum(str, si+1, ei-1);

        int ans = firstCharRemove + lastCharRemove - firstLastCharRemove;
        if (str.charAt(si) == str.charAt(ei)) {
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str= "abcab";
        int n = str.length();
        int ans = countsum(str, 0, n-1);
        System.out.println(ans);

    }
}
