public class SinFunc implements IFuncXAB {
    double a, b, xMin, xMax;

    public SinFunc(double a, double b, double xMin, double xMax) {
        this.a = a;
        this.b = b;
        this.xMin = xMin;
        this.xMax = xMax;
    }
    public double getF(double x) {
        return a * Math.sin (b * x);
    }
    public double getA() {
        return xMin;
    }
    public double getB() {
        return xMax;
    }
}
