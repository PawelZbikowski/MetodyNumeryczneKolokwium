package Zad2;

import java.util.ArrayList;
import java.util.List;

public class FirstOrderODESolver {
    private ODESingleStep odeSingleStep;
    private StepHandler stepHandler;

    public FirstOrderODESolver(ODESingleStep odeSingleStep) {
        this.odeSingleStep = odeSingleStep;
    }

    public void addStepHandler(StepHandler stepHandler){
        this.stepHandler = stepHandler;
    }

    public List<Double> integrate(FirstOrderODE ode, double tStart, double xStart, double tStop, int n){
        double h = (tStop-tStart)/n;
        double x = xStart;
        double t = tStart;
        double sigmaT = 0;
        List<Double> xAndSigmaT = new ArrayList<Double>();
        double logSigmaT = 0;

        for (int i = 0; i < n; i++) {
            if(stepHandler != null) stepHandler.handle(t,x);
            x = odeSingleStep.singleStep(ode,t,x,h);
            //sigmaT = 100*Math.abs((trueValue - x)/trueValue);
            t += h;
        }

        if(stepHandler != null) stepHandler.handle(t,x);
        xAndSigmaT.add(x);

        if(odeSingleStep instanceof RungeKuttyRK3)
            xAndSigmaT.add(3.*n); //koszt operacji

        return xAndSigmaT;
    }
}
