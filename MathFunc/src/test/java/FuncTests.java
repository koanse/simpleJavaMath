import org.junit.jupiter.api.Test;

public class FuncTests {
    @Test
    void LinearFuncSumTest() {
        LinearFunc linFunc = new LinearFunc(1,2, -10, 20);
        FunctionalSum sumFunctional = new FunctionalSum();
        sumFunctional.func = linFunc;
        double sum = sumFunctional.process();
        org.junit.Assert.assertEquals(sum, 21);
    }

    @Test
    void SinFuncIntegralTest() throws Exception {
        SinFunc sinFunc = new SinFunc(1,1, 0, 3.14);
        FunctionalIntegral sumFunctional = new FunctionalIntegral(sinFunc, 0, 3.14);
        double sum = sumFunctional.process();
        org.junit.Assert.assertTrue(Math.abs(sum - 2) < 0.05);
    }

    @Test
    void DivFuncIntegralTest() throws Exception {
        DivFunc divFunc = new DivFunc(1,1, 1,1, 0, 1);
        FunctionalIntegral sumFunctional = new FunctionalIntegral(divFunc, 0, 1);
        double sum = sumFunctional.process();
        org.junit.Assert.assertTrue(Math.abs(sum - 1) < 0.05);
    }

    @Test
    void ExpFuncIntegralTest() throws Exception {
        ExpFunc expFunc = new ExpFunc(1,0, 0, 1);
        FunctionalIntegral sumFunctional = new FunctionalIntegral(expFunc, 0, 1);
        double sum = sumFunctional.process();
        org.junit.Assert.assertTrue(Math.abs(sum - 1.72) < 0.05);
    }
}
