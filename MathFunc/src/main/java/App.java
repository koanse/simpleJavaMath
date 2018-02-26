public class App
{
    public static void main( String[] args ) throws Exception {
        System.out.println("Functions");

        LinearFunc linFunc = new LinearFunc(1, 2, -10, 20);
        FunctionalSum sumFunctional = new FunctionalSum();
        sumFunctional.func = linFunc;
        double sum = sumFunctional.process();
        System.out.println(String.format(
                "f(x)=x+2, f(-10)+f(20)+f(5)=%s", sum
        ));

        FunctionalIntegral integralFunctional = new FunctionalIntegral(linFunc, -1, 1);
        sumFunctional.func = linFunc;
        try {
            sum = integralFunctional.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(String.format(
                "f(x)=x+2, integral f(x) from -5 to 5 =%s", sum
        ));
    }
}