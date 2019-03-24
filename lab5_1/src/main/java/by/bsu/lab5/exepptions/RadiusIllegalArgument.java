package by.bsu.lab5.exepptions;

public class RadiusIllegalArgument extends  Exception {

    public RadiusIllegalArgument() {
        super();
    }

    public RadiusIllegalArgument(String message) {
        super(message);
    }

    public RadiusIllegalArgument(String message, Throwable throwable) {
        super(message, throwable);
    }

    public RadiusIllegalArgument(Throwable throwable) {
        super(throwable);
    }

}
