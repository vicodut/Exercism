import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char letter)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterInteger = alphabet.indexOf(letter);
        StringBuilder row;
        int character = 0;
        List<String> diamond = new ArrayList<>();

        for (int i = 0; i < letterInteger * 2 + 1; i++) {
            row = new StringBuilder();
            for (int j = 0; j < letterInteger * 2 + 1; j++) {
                if(j == letterInteger - character || j == letterInteger + character)
                {
                    row.append(alphabet.charAt(character));
                } else {
                    row.append(" ");
                }
            }
            character = i < letterInteger ? character + 1 : character - 1;
            diamond.add(row.toString());
        }
        return diamond;
    }
}
