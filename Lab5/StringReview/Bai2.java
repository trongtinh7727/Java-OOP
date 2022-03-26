public class Bai2 {
    public static int countWord(String paragraph) {
        String[] word = paragraph.split("[^a-z0-9A-Z]");
        int c = 0;
        for (String string : word) {
            c++;
        }
        return c;
    }

    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("\\.");
        int c = 0;
        for (String string : sentences) {
            c++;
        }
        return c;
    }

    public static int countAppear(String paragraph, String word) {
        String[] sword = paragraph.split("[^a-z0-9A-Z]");
        int c = 0;
        for (String string : sword) {
            if (word.equals(string)) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.printf("Words: %d\n", countWord(paragraph));
        System.out.printf("Sentences: %d\n", countSentences(paragraph));
        String word = "better";
        System.out.printf("%s appears: %d\n", word,countAppear(paragraph,word));

    }
}
