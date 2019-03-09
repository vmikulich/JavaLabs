package by.bsu.lab2.exceptions;

public class MatrixIncorrectAfgumentsException extends  Exception{

    public MatrixIncorrectAfgumentsException() {
        super();
    }

    public MatrixIncorrectAfgumentsException(String message) {
        super(message);
    }

    public MatrixIncorrectAfgumentsException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public MatrixIncorrectAfgumentsException(Throwable throwable) {
        super(throwable);
    }

}
