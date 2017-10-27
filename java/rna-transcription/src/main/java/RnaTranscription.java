import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {
	private Map<String, String> rna;

    public String transcribe(String dnaStrand) {
    	String[] dnaStrand_table = dnaStrand.split("");
    	StringBuilder sb = new StringBuilder();
    	int i;

		rna = new HashMap<String, String>();
		rna.put("C", "G");
		rna.put("G", "C");
		rna.put("T", "A");
		rna.put("A", "U");

    	if (dnaStrand == "") {
	    	return dnaStrand;
    	}

    	for (i = 0; i < dnaStrand_table.length; i++) {
			dnaStrand_table[i] = rna.get(dnaStrand_table[i]);
    		sb.append(dnaStrand_table[i]);
    	}

    	return sb.toString();
    }
}