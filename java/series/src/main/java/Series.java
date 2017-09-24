import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysiguman on 24/09/17.
 */
public class Series {
    private String[] input;

    Series (String input) {
        this.input = input.split("");
    }

    public List<Integer> getDigits() {
        List<Integer> digits = new ArrayList<>();

        for (String element : input) {
            digits.add(Integer.valueOf(element));
        }

        return digits;
    }

    public List<List<Integer>> slices(int slice) {
        List<List<Integer>> listSlided = new ArrayList<>();

        if (slice > input.length) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < input.length - slice + 1; i++) {
            List<Integer> subList = new ArrayList<>();

            for (int j = 0; j < slice; j++) {
                subList.add(Integer.valueOf(input[i + j]));
            }

            listSlided.add(subList);
        }

        return listSlided;
    }
}
