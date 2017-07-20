/**
 * Created by ysiguman on 16/07/17.
 */
public class PascalsTriangleGenerator {
    int[][] generateTriangle (int input) {
        if (input < 0)
            throw new IllegalArgumentException();

        int[][] tab = new int[input][];

        if (input == 0)
            return tab;

        tab[0] = new int[1];
        tab[0][0] = 1;

        for (int i = 1; i < input; i++)
        {
            tab[i] = new int[i + 1];
            for (int j = 0; j < tab[i].length; j++)
            {
                if (j == 0 || j == i)
                {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j];
                }
            }
        }

        return tab;
    }
}
