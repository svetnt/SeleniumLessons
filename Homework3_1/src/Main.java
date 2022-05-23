public class Main {
    public static void main(String[] args) {
        Solver solverTwoRots = new Solver(2, 5, -3);
        solverTwoRots.solve();
        solverTwoRots.printResult();

        Solver solverOneRoot = new Solver(1, 6, 9);
        solverOneRoot.solve();
        solverOneRoot.printResult();

        Solver solverNoRoot = new Solver(1, 2, 17);
        solverNoRoot.solve();
        solverNoRoot.printResult();

        Solver solverZeros = new Solver(0, 0, 0);
        solverZeros.solve();
        solverZeros.printResult();

        Solver solverZeroA = new Solver(0, 2, 2);
        solverZeroA.solve();
        solverZeroA.printResult();

        Solver solverZeroAB = new Solver(0, 0, 2);
        solverZeroAB.solve();
        solverZeroAB.printResult();
    }
}
