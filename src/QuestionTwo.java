/**
 * Solution to Question 2.
 *
 * @author Michael Male <michaelmale31@gmail.com>
 */
public class QuestionTwo {
    public static void main(String[] args) {
        // for loop counting from 1 to 100
        for (int i = 1; i < 100; i ++) {
            if (i % 3 == 0) { // if number divisible by 3
                System.out.println("fizz");
            } else if (i % 4 == 0) { // if number divisible by 4
                System.out.println("buzz");
            } else { // if no cases then print out the number
                System.out.println(i);
            }
        }
    }
}
