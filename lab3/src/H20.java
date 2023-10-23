public class H20 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Olsztyn");
        trimToSize(sb, 4);
        System.out.println(sb);
    }

    public static void trimToSize(StringBuffer sb, int n)
    {
        if (sb.length() >n && n>=0)
        {
            sb.setLength(n);
        }

    }
}
