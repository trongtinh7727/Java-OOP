import java.util.HashMap;
import java.util.Scanner;

public class EnVi {
    public static boolean isExists( HashMap <String,String> dict, String word){
        if (dict.get(word) == null) {
            return false;
        }
        return true;
    }

    public static String meaning(HashMap <String,String> dict, String word){
        return dict.get(word);
    }

    public static void lookUp(HashMap <String,String> dict){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words:");
        String Words = sc.nextLine();
        String [] listWord = Words.split(" ");
        for (String word : listWord) {
            if (isExists(dict, word)) {
                System.out.printf("%s - %s\n", word, dict.get(word));
            }else{
                System.out.printf("%s - unknown\n", word);
            }
        }
    }

    public static void main(String[] args) {
        HashMap <String,String> dict = new HashMap<>();
        dict.put("key", "khoa");
        dict.put("name", "ten");
        dict.put("list", "danh sach");
        dict.put("class", "lop");
        dict.put("value", "gia tri");
        dict.put("remove", "xoa");
        dict.put("clear", "lam sach");
        dict.put("time", "thoi gian");
        dict.put("size", "kich thuoc");
        dict.put("creat", "tao");
        
        lookUp(dict);
        
    }
}
