public class DivFunc implements IFuncXAB {
    double a, b, c, d, xMin, xMax;

    public DivFunc(double a, double b, double c, double d, double xMin, double xMax) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.xMin = xMin;
        this.xMax = xMax;
    }
    public double getF(double x) {
        return (a * x + b) / (c * x + d);
    }
    public double getA() {
        return xMin;
    }
    public double getB() {
        return xMax;
    }
}
