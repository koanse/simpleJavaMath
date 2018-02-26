public class Pow2EqSolverUsage {
    public Pow2EqSolver Pow2EqSolver;
    public Pow2EqSolverUsage(Pow2EqSolver Pow2EqSolver)
    {
        this.Pow2EqSolver = Pow2EqSolver;
    }

    public double solveUsage() throws Exception {
        if (Pow2EqSolver == null)
        {
            throw new Exception("Solver not initialized");
        }

        double[] arr = Pow2EqSolver.solve();
        if (arr.length == 0)
        {
            throw new Exception("Irrational decision");
        }

        return Math.max(arr[0], arr[1]);
    }

}
