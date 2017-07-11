import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysiguman on 11/07/17.
 */
class PrimeFactorsCalculator {
    List<Long> calculatePrimeFactorsOf(long number) {
        long i = 2;
        List<Long> primeFactors = new ArrayList<>();

        do {
            if (number % i == 0)
            {
                number = number / i;
                primeFactors.add(i);
            } else {
                i++;
            }
        } while (number != 1);

        return primeFactors;
    }
}
