import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Solution to question five.
 *
 * @author Michael Male michaelmale31@gmail.com
 */
public class QuestionFive {

    public static void main(String[] args) {
        String[] heights = new String[]{"6'2", "5'7", "6'1", "5'11"};
        List<Height> converted = new LinkedList<>();
        for (String height : heights) {
            String[] split = height.split("'");
            int[] temp = new int[split.length];
            for (int i = 0; i < split.length; i ++) {
                temp[i] = Integer.parseInt(split[i]);
            }
            converted.add(new Height(temp[0], temp[1]));
        }
        // Unfinished. Plan was to implement a Comparator that compares by
        // height, and if height is the same then compares by inches.
    }

    private static class Height {
        int feet;
        int inches;

        public Height(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
        }

        public int getFeet() {
            return feet;
        }

        public void setFeet(int feet) {
            this.feet = feet;
        }

        public int getInches() {
            return inches;
        }

        public void setInches(int inches) {
            this.inches = inches;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Height height = (Height) o;
            return feet == height.feet &&
                    inches == height.inches;
        }

        @Override
        public int hashCode() {
            return Objects.hash(feet, inches);
        }
    }
}
