public class RunLengthEncoding {
    public String encode(String data) {
        if (data.length() == 0)
            return data;

        StringBuilder sb = new StringBuilder();
        char oldLetter = data.charAt(0);
        int count = 1;

        for (int i = 1; i < data.length(); i++)
        {
            if (oldLetter == data.charAt(i))
            {
                count++;
            } else {
                sb.append(count == 1 ? "" : count).append(oldLetter);
                oldLetter = data.charAt(i);
                count = 1;
            }
        }
        sb.append(count == 1 ? "" : count).append(oldLetter);
        return sb.toString();
    }

    public String decode(String encodedData) {
        if (encodedData.length() == 0)
            return encodedData;
        StringBuilder sb = new StringBuilder();
        StringBuilder mult = new StringBuilder();

        for (int i = 0; i < encodedData.length(); i++) {
            if (Character.isDigit(encodedData.charAt(i)))
            {
                mult.append(encodedData.charAt(i));
            } else {
                if (!mult.toString().equals(""))
                {
                    sb.append(addLetters(Integer.valueOf(mult.toString()), encodedData.charAt(i)));
                    mult = new StringBuilder("");
                } else {
                    sb.append(encodedData.charAt(i));
                }

            }
        }
        return sb.toString();
    }

    private StringBuilder addLetters(int nb, char letter) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < nb; j++)
        {
            sb.append(letter);
        }
        return sb;
    }
}
