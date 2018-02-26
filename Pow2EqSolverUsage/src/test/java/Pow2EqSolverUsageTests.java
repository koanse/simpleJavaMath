import org.junit.jupiter.api.Test;

public class Pow2EqSolverUsageTests {
    @Test
    void Pow2EqSolverUsageTest_TwoRoots() throws Exception {
        Pow2EqSolver solver = new Pow2EqSolver(1, -3, 2);
        Pow2EqSolverUsage solverUsage = new Pow2EqSolverUsage(solver);
        double max = solverUsage.solveUsage();
        org.junit.Assert.assertEquals(max, 2.0);
    }

    @Test
    void Pow2EqSolverUsageTest_OneRoot() throws Exception {
        Pow2EqSolver solver = new Pow2EqSolver(1, -2, 1);
        Pow2EqSolverUsage solverUsage = new Pow2EqSolverUsage(solver);
        double max = solverUsage.solveUsage();
        org.junit.Assert.assertEquals(max, 1.0);
    }

    @Test
    void Pow2EqSolverUsageTest_NoRoots() {
        Pow2EqSolver solver = new Pow2EqSolver(1, -2, 1);
        Pow2EqSolverUsage solverUsage = new Pow2EqSolverUsage(solver);
        double max = 0;
        try {
            max = solverUsage.solveUsage();
        } catch (Exception e) {
            org.junit.Assert.assertTrue(true);
            return;
        }
        org.junit.Assert.assertTrue(false);
    }
}
