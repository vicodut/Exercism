public class Hamming {
    protected String[] leftStrand;
    protected String[] rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand.split("");
        this.rightStrand = rightStrand.split("");

        if (this.rightStrand.length != this.leftStrand.length)
        {
            throw new IllegalArgumentException("different size of arguments");
        }
    }

    int getHammingDistance() {
        int i;
        int diff = 0;

        for (i = 0; i < rightStrand.length; i++)
        {
            if (rightStrand[i].compareTo(leftStrand[i]) != 0)
            {
                diff++;
            }
        }
        return diff;
    }
}
