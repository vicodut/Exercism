import java.util.ArrayList;

class NaturalNumber {
    private int input;

    NaturalNumber(int input)
    {
        if (input <= 0)
        {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.input = input;
    }

    Classification getClassification()
    {
        ArrayList factors = getFactor();
        int sum = 0;

        for (Object factor : factors) {
            sum += (int) factor;
        }

        if (sum < input)
        {
            return Classification.DEFICIENT;
        } else if (sum > input)
        {
            return Classification.ABUNDANT;
        } else
        {
            return Classification.PERFECT;
        }
    }

    private ArrayList<Integer> getFactor()
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 1; i < input; i++)
        {
            if (input % i == 0)
            {
                factors.add(i);
            }
        }

        return factors;
    }
}
