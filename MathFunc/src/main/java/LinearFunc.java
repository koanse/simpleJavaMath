public class LinearFunc implements IFuncXAB {
    double a, b, xMin, xMax;

    public LinearFunc(double a, double b, double xMin, double xMax) {
        this.a = a;
        this.b = b;
        this.xMin = xMin;
        this.xMax = xMax;
    }
    public double getF(double x) {
        return a * x + b;
    }
    public double getA() {
        return xMin;
    }
    public double getB() {
        return xMax;
    }
}
