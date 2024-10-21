// we use String Buffer for mutable strings this means that you can change the string


public class Strings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dennis");
        sb.append(" hello");
        System.out.println(sb);
    }
}
