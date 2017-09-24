import java.util.*;

/**
 * Created by ysiguman on 21/07/17.
 */
public class BracketChecker {
    private String[] input;
    private Map<String, String> keys;

    public static void main (String[] args) {
        BracketChecker toto = new BracketChecker("([{}({}[])])");
        System.out.println(toto.areBracketsMatchedAndNestedCorrectly());
    }

    BracketChecker (String input) {
        keys = new HashMap<>();
        keys.put("}", "{");
        keys.put(")", "(");
        keys.put("]", "[");
        input = input.replaceAll("[^)(\\[\\]{}]", "");
        this.input = input.split("");
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        List<String> openned = new ArrayList<>();

        for (String charInput : this.input) {
            if (charInput.matches("[\\[{(]")) {
                openned.add(charInput);
            } else if (charInput.matches("[]})]") && openned.size() == 0) {
                return false;
            } else if (charInput.matches("[]})]")) {
                if (Objects.equals(keys.get(charInput), openned.get(openned.size() - 1))) {
                    openned.remove(openned.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return openned.size() == 0;
    }
}