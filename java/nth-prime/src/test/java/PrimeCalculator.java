import java.util.ArrayList;

/**
 * Created by ysiguman on 04/07/17.
 */
public class PrimeCalculator {
    int nth(int number)
    {
        if (number == 0)
            throw new IllegalArgumentException();

        ArrayList<Integer> primes = new ArrayList<>();

        primes.add(2);

        double count = 3;

        while(primes.size() < number)
        {
            if (count % 2 != 0)
            {
                double test = Math.round(Math.sqrt(count));
                while(test >= 3)
                {
                    if(count % test ==0)
                        break;
                    test--;
                }
                if(test < 3)
                    primes.add((int) count);
            }
            count++;
        }

        return primes.get(primes.size() - 1);
    }
}
