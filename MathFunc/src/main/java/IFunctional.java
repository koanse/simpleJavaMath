public interface IFunctional<Func> {
    double process() throws Exception;
    Func getFunction();
}
