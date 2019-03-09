package by.bsu.lab2;


import by.bsu.lab2.action.Matrix;
import by.bsu.lab2.action.TaskSolver;
import by.bsu.lab2.exceptions.MatrixIncorrectAfgumentsException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {

    double[] arr1;
    double[] arr2;
    double[][] arr3;
//    double[][] arr4;
    Matrix matrix1;
    Matrix matrix2;

    @Before
    public void initialization() throws MatrixIncorrectAfgumentsException {
        arr1 = new double[]{1, 2, 3};
        arr2 = new double[]{1.2, 4.4, 2.5, 5.3};
        arr3 = new double[][]{{1,2,3}, {-1,-2,-3}, {4,5,6}};
//        arr4 = new double[][]{{1.2,4.4,2.5,5.3}, {2.3,5.5,3.6,6.3}, {3.4,6.6,4.7,7.4}};
        matrix1 = new Matrix(arr3);
//        matrix2 = new Matrix(arr4);
    }

    @Test
    public void getAverageOfRow() {
        double expected1 = 2.0;
        double expected2 = 3.35;
        assertEquals(expected1, TaskSolver.getAverageOfRow(arr1), 0);
        assertEquals(expected2, TaskSolver.getAverageOfRow(arr2), 0);
    }

    @Test
    public void getChangedMatrix() throws MatrixIncorrectAfgumentsException {
        double[][] expectedMatrix1 = new double[][]{{-1.0,0.0,1.0}, {1.0,0.0,-1.0}, {-1.0,0.0,1.0}};
        Matrix expected1 = new Matrix(expectedMatrix1);
        Matrix result1 = TaskSolver.getChangedMatrix(matrix1);
//        double[][] expectedMatrix2 = new double[][]{{-2.15,1.05,-0.85,1.95}, {-2.125,1.075,-0.825,1.875}, {-2.125,1.075,-0.825, 1.875}};
//        Matrix expected2 = new Matrix(expectedMatrix2);
//        Matrix result2 = TaskSolver.getChangedMatrix(matrix2);
        for (int i = 0; i < expected1.getRows(); i++) {
            for (int j = 0; j < expected1.getColumns(); j++) {
                assertEquals(expected1.getElement(i, j), result1.getElement(i, j), 0);
            }
        }
//        for (int i = 0; i < expected2.getRows(); i++) {
//            for (int j = 0; j < expected2.getColumns(); j++) {
//                assertEquals(expected2.getElement(i, j), result2.getElement(i, j), 0);
//            }
//        }
    }
}
