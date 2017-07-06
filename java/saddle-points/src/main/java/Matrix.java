import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    static private List<List<Integer>> matrix;
    static private Set<MatrixCoordinate> saddlePoints;

    Matrix(List<List<Integer>> matrix) {
        Matrix.matrix = matrix;
        saddlePoints = new HashSet<>();
        setSaddlePoints();
    }

    Set<MatrixCoordinate> getSaddlePoints () {
        return saddlePoints;
    }

    private static void setSaddlePoints()
    {
        Integer max = 0;

        for(int i = 0; i < matrix.size(); i++)
        {
            max = matrix.get(i).get(0);

            for(int j = 0; j < matrix.get(i).size(); j++)
            {
                if(max < matrix.get(i).get(j))
                    max = matrix.get(i).get(j);
            }

            if(isSaddle(i, matrix.get(i).indexOf(max)))
                saddlePoints.add(new MatrixCoordinate(i, matrix.get(i).indexOf(max)));
        }
    }

    private static boolean isSaddle(int y, int x)
    {
        for (List<Integer> aMatrix : matrix) {
            if (aMatrix.get(x) < matrix.get(y).get(x))
                return false;
        }
        return true;
    }
}
