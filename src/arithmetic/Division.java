package arithmetic;
import exceptions.DivisionByZeroException;

public class Division {
	public static double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero");
        }
        return a / b;
    }

}
