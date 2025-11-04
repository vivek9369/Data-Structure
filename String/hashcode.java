public class hashcode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vivek");
        System.out.println(sb.hashCode());
        sb.append("D");
        System.out.println(sb.hashCode());
    }
}
