/**
 * Solution to Question 1.
 *
 * @author Michael Male <michaelmale31@gmail.com>
 */
public class QuestionOne {

    public static void main(String[] args) {
        // Instantiate an array with ten numbers
        int[] arr = new int[11];
        for (int i = 0; i < 11; i ++) {
            arr[i] = i;
        }

        // Print numbers in descending order using an iterative loop,
        // decrementing from the length of the array
        for (int i = arr.length - 1; i >= 0; i --) {
            System.out.println(arr[i]);
        }
    }

}
