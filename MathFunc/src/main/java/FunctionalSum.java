public class FunctionalSum implements IFunctional<IFuncXAB>{
    public IFuncXAB func;

    public double process(){
        double a = func.getA();
        double b = func.getB();
        return func.getF(a) + func.getF(b) + func.getF((a + b)/2);
    }
    public IFuncXAB getFunction(){
        return func;
    }
}
