import java.util.HashMap;

public class WordCount {
    HashMap<String, Integer> wordCount;

    WordCount () {
        wordCount = new HashMap<>();
    }
    HashMap<String, Integer> phrase(String sentence) {
        String[] words = sentence.split("[\\W]+");
        for (String word : words)
        {
            if (wordCount.containsKey(word.toLowerCase()))
            {
                int count = wordCount.get(word.toLowerCase());
                wordCount.put(word.toLowerCase(), ++count);
            } else {
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        return wordCount;
    }
}
