import java.util.Arrays;

/**
 * Created by ysiguman on 06/07/17.
 */
public class IsogramChecker {
    boolean isIsogram (String word)
    {
        word = word.toLowerCase().replaceAll("[- ]", "");
        char[] lastsChars = new char[word.length()];
        for(int i = 0; i < word.length(); i++)
        {
            if(present(lastsChars, word.charAt(i)))
                return false;
            lastsChars[i] = word.charAt(i);
        }
        return true;
    }

    private boolean present(char[] lastChars, char letter)
    {
        for (char lastChar : lastChars)
            if (lastChar == letter)
                return true;
        return false;
    }
}
