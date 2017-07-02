import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysiguman on 01/07/17.
 */
public class Sieve {
    private List<Integer> primesTest;
    private List<Integer> primes;
    private int upNumber;

    Sieve (int number)
    {
        primesTest = new ArrayList<>();
        primes = new ArrayList<>();
        upNumber = number;

        for (int i = 2; i <= number; i++)
        {
            primesTest.add(1);
        }
        this.setPrimes();
    }

    private void setPrimes()
    {
        for (int i = 2; i <= Math.sqrt(upNumber); i++)
        {
            for (int j = i; j <= upNumber; j++)
            {
                if (i*j - 2 < primesTest.size())
                {
                    primesTest.set(i * j - 2, 0);
                } else
                {
                    break;
                }
            }
        }
        for (int i = 0; i < primesTest.size(); i++)
        {
            if (primesTest.get(i) == 1)
            {
                primes.add(i + 2);
            }
        }
    }

    List getPrimes()
    {
        return primes;
    }
}
