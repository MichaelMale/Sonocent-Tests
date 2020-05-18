import java.util.Arrays;

/**
 * Solution to Question 3.
 *
 * @author Michael Male <michaelmale31@gmail.com>
 */
public class QuestionThree {
    public static void main(String[] args) {
        int number = 1000;

        System.out.println("Question 3.1 START");
        while (number < 10000) {
            if (isSquareNumber(number)) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("Question 3.1 END");

        System.out.println("Question 3.2 START");
        int[] result = squaresAddTo(1000);

        if (result == null) {
            System.out.println("No result found.");
        } else {
            System.out.println(result[0] + " + " + result[1] + " = " + 1000);

        }
        System.out.println("Question 3.2 END");
    }

    static int[] squaresAddTo(int target) {
        for (int i = 0; i < target; i ++) {
            if (isSquareNumber(i)) {
                for (int j = i; j < target; j ++) {
                    if (isSquareNumber(j)) {
                        if ((i + j) == target) {
                            return new int[]{i, j};
                        }
                    }
                }

            }
        }
        return null;
    }
    /**
     * Method to check if a number is a square number.
     * @param number    Number to be checked
     * @return  True if the number is square, false if not.
     */
    static boolean isSquareNumber(int number) {
        // Iterates through all possible checks
        for (int i = 0; i < number / 2 + 2; i ++) {

            if (i * i == number) { // True if number can be squared
                return true;
            }
        }
        return false;
    }
}
