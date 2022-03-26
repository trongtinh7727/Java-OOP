public class Bai1 {
    public static String shortName(String str) {
        String [] word  = str.split(" ");
        return word[word.length-1]+" "+ word[0];
    }

    public static String hashtagName(String str) {
        String[] word = str.split(" ");
        return "#" + word[word.length-1]+ word[0];
    }

    public static String upperCaseAllVowel(String str) {
        char chrarray[] = str.toCharArray();
        for (int i = 0; i < chrarray.length; i++) {
            switch (chrarray[i]) {
                case 'u':
                case 'e':
                case 'o':
                case 'a':
                case 'i':
                    chrarray[i] = Character.toUpperCase(chrarray[i]);
                    break;
                default:
                    break;
            }
        }
        String res = new String(chrarray);
        return res;
    }

    public static String upperCaseAllN(String str) {
        char chrarray[] = str.toCharArray();
        for (int i = 0; i < chrarray.length; i++) {
            if(chrarray[i] == 'n'){
                chrarray[i]= 'N';
            }           
        }
        return new String(chrarray);
    }

    public static void main(String[] args) {
        String str = "Nguyen Le Trong Tin";
        System.out.printf("Short name: %s\n",shortName(str));
        System.out.printf("Hastag name: %s\n",hashtagName(str));
        System.out.printf("upper all vowel: %s\n",upperCaseAllVowel(str));
        System.out.printf("upper all N: %s\n",upperCaseAllN(str));
    }
}
