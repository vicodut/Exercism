import java.util.Arrays;
import java.util.List;

/**
 * Created by ysiguman on 07/07/17.
 */
public class PigLatinTranslator {
    String translate(String sentence) {
        StringBuilder sb = new StringBuilder();
        List<String> words = Arrays.asList(sentence.split(" "));
        int index = 0;

        for (String word : words) {
            if(0 != index++)
                sb.append(" ");
            if (beginVowel(word)) {
                if (word.charAt(0) == 'y' && word.charAt(1) != 't') {
                    sb.append(word.substring(1));
                    sb.append(word.substring(0, 1));
                } else {
                    sb.append(word);
                }
            } else {
                sb.append(word.substring(firstVowel(word)));
                sb.append(word.substring(0, firstVowel(word)));
            }
            sb.append("ay");
        }
        return sb.toString();
    }
    private boolean beginVowel(String word) {
        return isVowel(word.split("")[0]) ||
                (word.split("")[0].equals("x") &&
                        word.split("")[1].equals("r"));
    }
    private int firstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(String.valueOf(word.charAt(i))))
            {
                if(word.charAt(i) == 'u' && word.charAt(i - 1) == 'q')
                    return i + 1;

                if(word.charAt(i) == 'u' && word.charAt(i - 1) == 'q')
                    return i + 1;

                if(word.charAt(i) == 'r' && word.charAt(i - 1) == 'x')
                    return i + 1;
                return i;
            }
        }
        return -1;
    }
    private boolean isVowel (String character) {
        return character.matches("[aeiouy]");
    }
}
