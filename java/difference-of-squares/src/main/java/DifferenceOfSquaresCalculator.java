class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(final int input)
    {
        int square_sum = 0;

        for (int i = 1; i < input + 1; i++)
        {
            square_sum += i;
        }

        return square_sum * square_sum;
    }

    int computeSumOfSquaresTo(int input)
    {
        int sum_square = 0;

        for (int i = 1; i < input + 1; i++)
        {
            sum_square += i * i;
        }

        return sum_square;
    }

    int computeDifferenceOfSquares(int input)
    {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
