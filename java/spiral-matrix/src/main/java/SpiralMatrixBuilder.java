/**
 * Created by ysiguman on 24/09/17.
 */
public class SpiralMatrixBuilder {
    public SpiralMatrixBuilder() {
    }

    public int[][] buildMatrixOfSize(int size) {
        int[][] tab = new int[size][];
        int count = 1;
        int i, j;

        for (i = 0; i < size; i++) {
            tab[i] = new int[size];
        }


        for (int n = 0; n < (size + 1) / 2; n++) {
            for (i = 0; i <= size - 1 - (n * 2); i++) {
                tab[n][n + i] = count++;
            }
            i--;

            for (j = 1; j <= size - 1 - (n * 2); j++) {
                tab[n + j][n + i] = count++;
            }
            j--;

            for (i = --i; i > 0; i--) {
                tab[n + j][n + i] = count++;
            }

            for (j = j; j > 0; j--) {
                tab[n + j][n] = count++;
            }
        }

        return tab;
    }
}
