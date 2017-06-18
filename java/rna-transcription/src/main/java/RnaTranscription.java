public class RnaTranscription {
    public String transcribe(String dnaStrand) {
    	String[] dnaStrand_table = dnaStrand.split("");
    	StringBuilder sb = new StringBuilder();
    	int i;
    	
    	if (dnaStrand == "") {
	    	return dnaStrand;		
    	}

    	for (i = 0; i < dnaStrand_table.length; i++) {
    		switch (dnaStrand_table[i]) {
    			case "C":
    				dnaStrand_table[i] = "G";
    				break;
    			case "G":
    				dnaStrand_table[i] = "C";
    				break;
    			case "T":
    				dnaStrand_table[i] = "A";
    				break;
    			case "A":
    				dnaStrand_table[i] = "U";
    				break;
    		}
    		sb.append(dnaStrand_table[i]);
    	}

    	return sb.toString();
    }
}