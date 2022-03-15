public class Lab3Bai3 {

    // Last name and first name
    public static String lastAndFirst(String name) {
        String[] splitname = name.split(" ");

        String res = splitname[0] + " " + splitname[splitname.length - 1];
        return res;
    }

    // Middle name
    public static String middleName(String name) {
        String[] splitname = name.split(" ");
        String res = "";
        for (int i = 1; i < splitname.length - 1; i++) {
            res = res + splitname[i] + " ";

        }
        return res;
    }

    // Capitalize the full name
    public static String capitalize(String name) {
        String[] fname = name.split(" ");
        String rs = "";
        for (String a : fname) {
            if (a.length() > 0) {
                String fd = a.substring(0, 1);
                String rd = a.substring(1);
                rs += fd.toUpperCase() + rd + " ";
            }
        }
        return rs.substring(0, rs.length() - 1);
    }

    // Uppercase all vowels and lowercase all consonants
    public static String upcaseVowels(String name) {
        char[] arrName = name.toLowerCase().toCharArray();

        for (int i = 0; i < arrName.length; i++) {
            if (arrName[i] == 'u' | arrName[i] == 'e' | arrName[i] == 'o' | arrName[i] == 'a' | arrName[i] == 'i') {
                arrName[i] = Character.toUpperCase(arrName[i]);
            }
        }

        String res = new String(arrName);
        return res;
    }

    public static void main(String[] args) {

        // Last name and first name
        String name = "vo trong tinh";
        System.out.printf("First and last name: %s\n", lastAndFirst(name));

        // Middle name
        System.out.printf("Middle name: %s\n", middleName(name));

        // Capitalize the full name
        String capName = capitalize(name);
        System.out.printf("Capitalize full name: %s\n", capName);

        // Uppercase all vowels and lowercase all consonants
        String upcase = upcaseVowels(name);
        System.out.printf("Uppercase all vowels and lowercase all consonants: %s", upcase);
    }
}
