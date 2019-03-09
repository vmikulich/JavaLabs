package by.bsu.lab2.action;


import by.bsu.lab2.exceptions.MatrixIncorrectAfgumentsException;

import java.util.Arrays;

public class TaskSolver {

    /** this method work with matrix according to task 9
     * @return matrix counting according to task 9
     * @param matrix - origin matrix
     * */
    public static Matrix getChangedMatrix(Matrix matrix) throws MatrixIncorrectAfgumentsException{

        for (int i = 0; i < matrix.getRows(); i++) {
            double averageOfRow = getAverageOfRow(matrix.getRow(i));
            for (int j = 0; j < matrix.getColumns(); j++) {
                matrix.setElement(i, j, matrix.getElement(i, j) - averageOfRow);
            }
        }
        return matrix;
    }


    /**this method counting average value of elements of row
     * @return average value
     * @param row array
     * */
    public static double getAverageOfRow(double[] row) {
        return Arrays.stream(row).average().getAsDouble();
    }
}
