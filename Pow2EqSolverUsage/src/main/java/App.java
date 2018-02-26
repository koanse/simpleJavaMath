public class App
{
    public static void main( String[] args ) throws Exception {
        System.out.println("Equation solver");

        Pow2EqSolver solver = new Pow2EqSolver(1, -3, 2);
        double[] arr = solver.solve();
        System.out.println(String.format(
                "x^2-3x+2=0, x1=%s, x2=%s", arr[0], arr[1]
        ));

        Pow2EqSolverUsage solverUsage = new Pow2EqSolverUsage(solver);
        double max = solverUsage.solveUsage();
        System.out.println(String.format(
                "x^2-3x+2=0, max root is x=%s", max
        ));
    }
}

