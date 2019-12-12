package Zad2;

public class RungeKuttyRK3 implements ODESingleStep{
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double k1 = ode.f(t,x);
        double xMid = x + k1*(h/2);
        double k2 = ode.f(t + h/2,xMid);
        xMid = x - h*k1+ 2*h*k2;
        double k3 = ode.f(t + h, xMid);
        double nachylenie = (1./6.)*(k1 + 4*k2 + k3);
        double xEnd = x + h*nachylenie;
        return xEnd;
    }
}
