package Zad1;

public class Bisection {

    private double xl;
    private double xu;
    private Function function;
    private double r;

    public Bisection(double xl, double xu, Function function, double r) {
        this.xl = xl;
        this.xu = xu;
        this.function = function;
        this.r = r;
    }

    public double solver(double er){
        double xr = 0;
        double functionXr;
        double xrOld = 0;
        double epsilonA = 1;
        double epsilonT = 0;
        int iteracja = 0;
        System.out.println("Bisekcja: ");
        while (epsilonA > er){
            if((function.f(xl,r) * function.f(xu,r)) < 0){
                iteracja++;
                xr = (xl + xu)/2;
//                epsilonT = Math.abs(((0.56714329 - xr)/ 0.56714329)*100);
            if (xrOld != 0) {
                    epsilonA = Math.abs((xr - xrOld)/xr)*100;
                }
                functionXr = function.f(xr,r);
                if(functionXr == 0) {
                    return xr;
                }
                if (functionXr != 0) {
                    System.out.println("Iteracja: " + iteracja + ", xl = " + xl + ", xu = " + xu + ", xr = " + xr +
                            ", epsilon A = " + epsilonA + " %" + ", epsilon T: " + epsilonT + " %");
                    System.out.println();
                    if ((function.f(xl,r) * functionXr) < 0)
                        xu = xr;
                    else if ((function.f(xu,r) * functionXr) < 0)
                        xl = xr;
                }
                xrOld = xr;
            }
        }
        return xr;
    }
}
