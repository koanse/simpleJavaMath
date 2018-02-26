import org.junit.jupiter.api.Test;

public class Pow2EqSolverTests {
    @Test
    void Pow2EqSolverTest_TwoRoots() {
        Pow2EqSolver solver = new Pow2EqSolver(1, -3, 2);
        double[] arr = solver.solve();
        double min = Math.min(arr[0], arr[1]);
        double max = Math.max(arr[0], arr[1]);
        org.junit.Assert.assertEquals(min, 1.0);
        org.junit.Assert.assertEquals(max, 2.0);
    }

    @Test
    void Pow2EqSolverTest_OneRoot() {
        Pow2EqSolver solver = new Pow2EqSolver(1, -2, 1);
        double[] arr = solver.solve();
        double min = Math.min(arr[0], arr[1]);
        double max = Math.max(arr[0], arr[1]);
        org.junit.Assert.assertEquals(min, 1.0);
        org.junit.Assert.assertEquals(max, 1.0);
    }

    @Test
    void Pow2EqSolverTest_NoRoots() {
        Pow2EqSolver solver = new Pow2EqSolver(1, -3, 2);
        double[] arr = solver.solve();
        org.junit.Assert.assertEquals(arr.length, 0);
    }
}
