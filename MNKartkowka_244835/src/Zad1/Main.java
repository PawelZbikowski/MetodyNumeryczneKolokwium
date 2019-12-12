package Zad1;

public class Main {

    public static void main(String[] args) {

        double er = 0.001;

        //Zad1.Bisection
        //BISECTION METHOD

        Bisection bisection1 = new Bisection(0,2, new Equation(),1);

        //FIXED POINT METHOD

        //Wyrażenie lambda
        FixedPointMethod fixedPointMethod1 = new FixedPointMethod(2, (h,r) -> (4./3.)*0.8 - Math.pow(h,2)*((3-h)/3),1);

        //METODA SIECZNYCH
        MetodaSiecznych metodaSiecznych1 = new MetodaSiecznych(2,1.8, new Equation());

    double bisekcja = bisection1.solver(er);
    double fixedPointMethod = fixedPointMethod1.solver(er);
    double metodaSiecznych = metodaSiecznych1.metodaSiecznychSolver(er);
    }
}
