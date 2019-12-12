package Zad1;

public class MetodaSiecznych {

    private double xiMinusOne;
    private double xi;
    private Function function;
    private double r;

    public MetodaSiecznych(double xiMinusOne, double xi, Function function) {
        this.xiMinusOne = xiMinusOne;
        this.xi = xi;
        this.function = function;
        this.r = r;
    }

    public double metodaSiecznychSolver(double er){
        double xiPlusOne = 0;
        double epsilonA = 1;
        double epsilonT = 0;
        int iteracja = 0;
        System.out.println("Metoda siecznych: ");
        while (epsilonA > er){
            xiPlusOne = xi - ((function.f(xi,r)*(xiMinusOne - xi))/(function.f(xiMinusOne,r) - function.f(xi,r)));
            epsilonA = Math.abs((xiPlusOne-xi)/xiPlusOne)*100;
            iteracja++;
            System.out.println("Iteracja: " + iteracja + ", x(iteracja - 1): " + xiMinusOne + ", x(iteracja): " + xi + ", x(iteracja + 1): " + xiPlusOne + ", epsilonA: " + epsilonA + " %");
            System.out.println();
            xiMinusOne = xi;
            xi = xiPlusOne;
        }
        return xiPlusOne;
    }

}
