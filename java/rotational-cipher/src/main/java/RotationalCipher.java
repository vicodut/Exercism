/**
 * Created by ysiguman on 20/07/17.
 */
public class RotationalCipher {
    private int rotation;

    RotationalCipher(int rotation) {
        this.rotation = rotation;
    }

    public String rotate (String sentence) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++)
        {
            int newLetter = sentence.charAt(i) + rotation;

            if (sentence.charAt(i) > 96 && sentence.charAt(i) < 123)
            {
                if (newLetter > 122)
                {
                    sb.append((char) (96 + newLetter - 122));
                } else {
                    sb.append((char) newLetter);
                }

            } else if (sentence.charAt(i) > 64 && sentence.charAt(i) < 91) {
                if (newLetter > 90)
                {
                    sb.append((char) (64 + newLetter - 90));
                } else {
                    sb.append((char) newLetter);
                }
            } else {
                sb.append(sentence.charAt(i));
            }
        }

        return sb.toString();
    }
}