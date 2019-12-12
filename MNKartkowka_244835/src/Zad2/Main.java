package Zad2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        final double trueValue = 75.33896;


        FirstOrderODESolver solver1 = new FirstOrderODESolver(new RungeKuttyRK3());

        SaveAllStepHandler saveAllStepHandler = new SaveAllStepHandler();
        solver1.addStepHandler(saveAllStepHandler);

        List<Double> xEnd1 = solver1.integrate((t, x) -> 0.026*(1-(x/12E9))*x, 0,2.555E9,50,10);

        System.out.println("t = " + saveAllStepHandler.getT());
        System.out.println("x = " + saveAllStepHandler.getX());
        System.out.println("xEnd1 = " + xEnd1);


    }
}
