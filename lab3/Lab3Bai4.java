import java.util.jar.Attributes.Name;

public class Lab3Bai4 {

    public static int countWord(String s){
        String [] splitS = s.split(" ");
        return splitS.length;
    }

    public static boolean isPalindrome(String nameString){
        char [] charArr =  nameString.toCharArray();
        int j = charArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != charArr[j--]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String nameString = "Vo Trong Tinh";
        System.out.println(nameString);

        System.out.printf("Length of the string: %d\n",nameString.length());

        System.out.printf("The number of words: %d\n",countWord(nameString));
        
        String s1 = "Hello ";
        String s2 = "world";
        System.out.printf("S1: %s\nS2: %s\nS1 + S2: %s\n",s1,s2,s1+s2);

        String palindrome = "121121";
        System.out.printf("%s is palindrome: %b",palindrome,isPalindrome(palindrome));
    }

}
