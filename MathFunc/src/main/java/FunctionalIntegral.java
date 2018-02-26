public class FunctionalIntegral implements IFunctional<IFuncXAB>{
    public IFuncXAB func;
    public double xMin, xMax;

    public FunctionalIntegral(IFuncXAB func, double xMin, double xMax)
    {
        this.xMin = xMin;
        this.xMax = xMax;
        this.func = func;
    }

    public double process() throws Exception {
        double a = func.getA();
        double b = func.getB();

        if (xMin < a || xMax < a || xMin > b || xMax >b)
        {
            throw new Exception("Illegal interval");
        }

        int stepCount = 100;
        double step = (xMax - xMin) / stepCount;
        double sum = 0;

        for (int i = 0; i < stepCount; i++)
        {
            double x = xMin + step / 2 + step * i;
            sum += func.getF(x) * step;
        }
        return sum;
    }
    public IFuncXAB getFunction(){
        return func;
    }
}
