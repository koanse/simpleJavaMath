public class Pow2EqSolver {
    public double a, b, c;
    public Pow2EqSolver(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] solve()
    {
        double d = b* b - 4*a*c;
        if (d < 0)
        {
            return new double[]{};
        }
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        return new double[] {x1, x2};
    }

}
