package by.bsu.lab2.action;

import by.bsu.lab2.constans.ErrorConstans;
import by.bsu.lab2.constans.MatrixConstans;
import by.bsu.lab2.exceptions.MatrixIncorrectAfgumentsException;

import java.util.Arrays;

public class Matrix {

    private final int rows;

    private final int columns;

    private double[][] matrix;

    /**method to create matrix with given sizes
     * @param rows number
     * @param columns number*/
    public Matrix(final int rows, final int columns) throws MatrixIncorrectAfgumentsException {
        if (!Validator.isCorrectValueOfRowsAndColumns(rows, columns)) {
            throw new MatrixIncorrectAfgumentsException(ErrorConstans.INVALIDE_NUMBER);
        }
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    /**method to create matrix with given size
     * @param size for matrix*/
    public Matrix(final int size) throws MatrixIncorrectAfgumentsException {
        this(size, size);
    }
    /**method to create matrix with default size*/
    public Matrix() throws MatrixIncorrectAfgumentsException {
        this(MatrixConstans.DEF_SIZE);
    }

    /**method to create matrix from array
     * @param matrix to copy*/
    public Matrix(double[][] matrix) throws MatrixIncorrectAfgumentsException {
        this(matrix.length, matrix[0].length);
        this.matrix = matrix;
    }

    /**method getter for rows number
     * @return number of rows */
    public int getRows() {
        return rows;
    }

    /**method getter for columns number
     * @return number of columns */
    public int getColumns() {
        return columns;
    }

    /**method gets element by given indexes
     * @return element of matrix
     * @param row number
     * @param column number*/
    public double getElement(int row, int column) throws MatrixIncorrectAfgumentsException {
        if (!Validator.isCorrectIndexes(row, column, this.rows, this.columns)) {
            throw new MatrixIncorrectAfgumentsException(ErrorConstans.INVALIDE_INDEXES);
        }
        return this.matrix[row][column];
    }

    public void setElement(int row, int column, double numb) throws MatrixIncorrectAfgumentsException {
        if (!Validator.isCorrectIndexes(row, column, this.rows, this.columns)) {
            throw new MatrixIncorrectAfgumentsException(ErrorConstans.INVALIDE_INDEXES);
        }
        this.matrix[row][column] = numb;
    }

    /**method gets row by given number
     * @return array of elements
     * @param row to return */
    public double[] getRow(int row) throws MatrixIncorrectAfgumentsException {
        if (!Validator.isCorrectIndex(row, this.rows)) {
            throw new MatrixIncorrectAfgumentsException(ErrorConstans.INVALIDE_INDEX_ROW);
        }
        return this.matrix[row];
    }

    /**method gets column by given number
     * @return array of elements
     * @param column to return */
    public double[] getColumn(int column) throws MatrixIncorrectAfgumentsException {
        if (!Validator.isCorrectIndex(column, this.columns)) {
            throw new MatrixIncorrectAfgumentsException(ErrorConstans.INVALIDE_INDEX_COLUMN);
        }
        double[] columnArray = new double[this.rows];
        for (int i = 0; i < this.rows; i++) {
            columnArray[i] = this.matrix[i][column];
        }
        return columnArray;
    }

    /**method fill matrix by given element
     * @param element - given element
    */
    public void fill(int element) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                matrix[i][j] = element;
            }
        }
    }

    /**method checks if matrix contains element
     * @return true if element in matrix
     * @param element to check */
    public boolean contains(int element) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (matrix[i][j] == element) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", matrix=[" + Arrays.stream(matrix).reduce("", (acc, item) -> acc + Arrays.toString(item), (left, right) -> left + right) +
                "]}";

    }
}

