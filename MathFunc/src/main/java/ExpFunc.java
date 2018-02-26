public class ExpFunc implements IFuncXAB {
    double a, b, xMin, xMax;

    public ExpFunc(double a, double b, double xMin, double xMax) {
        this.a = a;
        this.b = b;
        this.xMin = xMin;
        this.xMax = xMax;
    }
    public double getF(double x) {
        return a * Math.exp(x) + b;
    }
    public double getA() {
        return xMin;
    }
    public double getB() {
        return xMax;
    }
}
