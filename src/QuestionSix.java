import java.util.Arrays;

/**
 * Solution to Question Six.
 * @author Michael Male michaelmale31@gmail.com
 */
public class QuestionSix {

    public static void main(String[] args) {
        String test1 = "Hello";
        String test2 = "olleH";

        System.out.println(isAnagram(test1.toCharArray(),
                test2.toCharArray()));
    }
    static boolean isAnagram(char[] str1, char[] str2) {
        int firstLength = str1.length;
        int secondLength = str2.length;

        if (firstLength != secondLength) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < firstLength; i ++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}
