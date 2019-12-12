package Zad1;

public class Equation implements Function{
    @Override
    public double f(double h, double r) {
        return (4./3.)*0.8 - Math.pow(h,2)*((3-h)/3);
    }
}
