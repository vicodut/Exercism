import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
    private int sum;

    SumOfMultiples(int number, int[] set) {
        Set<Integer> sum_list = new HashSet<>();

        for (int aSet : set) {
            for (int i = 0; i < number; i++)
            {
                if (aSet * i < number)
                    sum_list.add(aSet*i);
            }
        }

        for(int num : sum_list)
        {
            sum += num;
        }
    }

    int getSum() {
        return sum;
    }

}
