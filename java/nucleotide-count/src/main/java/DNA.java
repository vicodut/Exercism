import java.util.HashMap;
import java.util.Map;

public class DNA {
    private char[] dna;
    private Map<Character, Integer> dnaMap;

    DNA (String dna) {
        this.dna = dna.toCharArray();
        dnaMap  = new HashMap<>();
        dnaMap.put('A', 0);
        dnaMap.put('C', 0);
        dnaMap.put('G', 0);
        dnaMap.put('T', 0);
        setMap();
    }

    private void setMap() {
        for (char aDna : dna)
        {
            int count = dnaMap.get(aDna);
            dnaMap.put(aDna, ++count);
        }
    }

    int count(char nucleotide) {
        if (!Character.toString(nucleotide).matches("[ACGTacgt]"))
            throw new IllegalArgumentException();
        return dnaMap.getOrDefault(nucleotide, 0);
    }

    Map<Character, Integer> nucleotideCounts() {
        return dnaMap;
    }
}
