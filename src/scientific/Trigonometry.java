package scientific;

public class Trigonometry {
	public static double sin(double a) {
        return Math.sin(Math.toDegrees(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
    public static double cot(double a) {
        return 1.0 / Math.tan(Math.toRadians(a));
    }
    
    public static double cosec(double a) {
        return 1.0 / Math.sin(Math.toRadians(a));
    }
    
    public static double sec(double a) {
        return 1.0 / Math.cos(Math.toRadians(a));
    }
}
