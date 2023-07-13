import java.util.ArrayList;
import java.util.List;

public class CapitalizeWords {

    public static List<String> capitalizeWords(List<String> words) {
        if (words.isEmpty()) {
            return new ArrayList<>();
        } else {
            String capitalizedWord = words.get(0).toUpperCase();
            List<String> capitalizedWordsWithoutFirst = capitalizeWords(words.subList(1, words.size()));
            return new ArrayList<>(Arrays.asList(capitalizedWord, capitalizedWordsWithoutFirst));
        }
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("foo");
        words.add("bar");
        words.add("world");
        List<String> capitalizedWords = capitalizeWords(words);
        System.out.println(capitalizedWords); // ["FOO", "BAR", "WORLD"]
    }
}
