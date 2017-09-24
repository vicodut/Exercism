import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysiguman on 24/09/17.
 */
public class Atbash {
    private static List<String> alphabet = new ArrayList<>();

    public Atbash() {
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("x");
        alphabet.add("y");
        alphabet.add("z");
    }

    public String encode (String input) {
        String[] inputs = input.toLowerCase().replaceAll("[\\s.,]", "").split("");
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].matches("[0-9]")) {
                sb.append(inputs[i]);
            } else {
                index = alphabet.indexOf(inputs[i]);
                sb.append(alphabet.get(alphabet.size() - index - 1));
            }

            if ((i + 1)%5 == 0 && i != inputs.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }

    public String decode (String input) {
        String[] inputs = input.toLowerCase().replaceAll("[\\s.,]", "").split("");
        StringBuilder sb = new StringBuilder();
        int index;

        for (String letter : inputs) {
            if (letter.matches("[0-9]")) {
                sb.append(letter);
            } else {
                index = alphabet.indexOf(letter);
                sb.append(alphabet.get(alphabet.size() - index - 1));
            }
        }
        return sb.toString();
    }
}
