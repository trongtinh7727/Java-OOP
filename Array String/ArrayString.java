import java.lang.String;

public class ArrayString {
    public static int countDigit(String name) {
        int d = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                d++;
            }
        }
        return d;
    }

    public static String firstName(String name) {
        String[] fname = name.split(" ");
        return fname[0];
    }

    public static String lastName(String name) {
        String[] fname = name.split(" ");
        return fname[fname.length - 1];
    }

    public static String formalize(String name) {
        String[] fname = name.split(" ");
        String rs = "";
        for (String a : fname) {
            if (a.length() > 0) {
                rs += a + " ";
            }
        }
        return rs.substring(0,rs.length()-1);
    }
    public static String capitalize(String name) {
        String[] fname = name.split(" ");
        String rs = "";
        for (String a : fname) {
            if (a.length() > 0) {
                String fd = a.substring(0, 1);
                String rd = a.substring(1);
                rs += fd.toUpperCase()+rd + " ";
            }
        }
        return rs.substring(0,rs.length()-1);
    }

    public static void main(String[] args) {
        String name = "vo ";
        int d = countDigit(name);
        System.out.println(d);
        System.out.println(firstName(name));
        System.out.println(lastName(name));
        System.out.println(formalize(name).length());
        System.out.println(capitalize(name));
    }
}
