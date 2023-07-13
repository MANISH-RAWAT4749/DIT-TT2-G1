import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

    public static void perm(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String newStr = str.substring(0, i) + str.substring(i + 1);
                perm(newStr, result + ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}
