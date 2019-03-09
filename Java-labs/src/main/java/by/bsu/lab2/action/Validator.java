package by.bsu.lab2.action;

public class Validator {

    public static boolean isCorrectValueOfRowsAndColumns(int rows, int columns) {
        return rows > 0 && columns > 0;
    }

    public static boolean isCorrectIndexes(int row, int column, int matrixRows, int matrixColumns) {
        return row >= 0 && row < matrixRows && column < matrixColumns && column >= 0;
    }

    public static boolean isCorrectIndex(int index, int matrixIndex) {
        return index >= 0 && index < matrixIndex;
    }
}
