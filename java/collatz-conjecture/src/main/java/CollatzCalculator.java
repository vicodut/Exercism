class CollatzCalculator {

    int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only natural numbers are allowed");

        int step = 0;

        while (start != 1)
        {
            switch (start % 2)
            {
                case 0:
                    start /= 2;
                    break;
                default:
                    start = 3 * start + 1;
            }
            step++;
        }
        return step;
    }

}
