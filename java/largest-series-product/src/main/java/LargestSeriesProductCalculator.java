import java.util.ArrayList;

public class LargestSeriesProductCalculator {
    private ArrayList<Integer> nb;

    LargestSeriesProductCalculator(String number)
    {
        if(number == null)
        {
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        if (!isNumber(number))
        {
            throw new IllegalArgumentException("String to search may only contains digits.");

        }else {
            String[] numberTab = number.split("");
            nb = new ArrayList<>();

            if (numberTab.length > 1) {
                for (String aNumberTab : numberTab) {
                    nb.add(Integer.parseInt(aNumberTab));
                }
            }
        }
    }

    long calculateLargestProductForSeriesLength(int number)
    {
        if (nb.size() < number)
        {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (number < 0)
        {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if(nb.size() == 0)
        {
            return (long) 1;
        }
        long prod = 1, max = 0;
        for (int i = 0; i <= nb.size() - number; i++)
        {
            for (int j = 0; j < number; j++)
            {
                if (i + j < nb.size())
                    prod *= nb.get(i + j);
            }
            if (prod > max)
            {
                max = prod;
            }
            prod = 1;
        }
        return  max;
    }

    private boolean isNumber(String number)
    {
        String regex = "[a-z]";
        String[] numberDigits = number.split("");
        for (String digit : numberDigits) {
            if (digit.matches(regex)) {
                return false;
            }
        }
        return true;
    }
}
