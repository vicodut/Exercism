/**
 * Created by ysiguman on 26/06/17.
 */
public class Matrix {
    private String matrix;
    Matrix(String matrix)
    {
        this.matrix = matrix;
    }
    int getRowsCount()
    {
        String[] matrixTab = matrix.split("\n");
        return matrixTab.length;
    }
    int getColumnsCount()
    {
        String[] matrixTab = matrix.split("\n")[0].split(" ");
        return matrixTab.length;
    }
    int[] getRow(int index)
    {
        String[] matrixTab = matrix.split("\n")[index].split(" ");
        int[] test = new int[matrixTab.length];

        for (int i = 0; i < matrixTab.length; i++)
        {
            test[i] = Integer.parseInt(matrixTab[i]);
        }

        return test;
    }
    int[] getColumn(int index)
    {
        String[] matrixTab = matrix.split("\n");
        int[] test = new int[matrixTab.length];

        for (int i = 0; i < matrixTab.length; i++)
        {
            test[i] = Integer.parseInt(matrixTab[i].split(" ")[index]);
        }

        return test;
    }
}
