package Zad1;

public class FixedPointMethod {

    private double x0;
    private Function function;
    private double r;

    public FixedPointMethod(double x0, Function function, double r) {
        this.x0 = x0;
        this.function = function;
        this.r = r;
    }

    public double solver(double er){
        double x1 = 0;
        double epsilonA = 1;
        double epsilonT = 0;
        int iteracja = 0;
        System.out.println("Metoda punktu stałego:");
        while (epsilonA > er) {
            x1 = function.f(x0,r) + x0;
            epsilonA = Math.abs((x1-x0)/x1)*100;
            iteracja++;
            System.out.println("Iteracja: " + iteracja + ", x(iteracja): " + x0 + ", x(iteracja + 1): " + x1 + ", epsilonA: " + epsilonA + " %");
            System.out.println();
            x0 = x1;
        }
        return x1;
    }

}
