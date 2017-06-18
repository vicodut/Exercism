public class PangramChecker {

    public boolean isPangram(String input) {
        String[] table = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w",
                "x","y","z"};
        int i;
        input = input.toLowerCase();
        for (i = 0; i < table.length; i++){
            if(!input.contains(table[i]))
            {
                return false;
            }
        }
        return true;
    }

}
