package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.nested_classes;

import java.util.AbstractMap;
import java.util.Map;

public class Equation {
    private double a;
    private double b;
    private double c;
    private static double fff = 0;

    public Solution33 resolve(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = new Discriminant33().calculate();
        return new Solution33();
    }

     class Solution33 {

    }

    public class Discriminant33 {
        double calculate() {
            Equation.this.c = 99;
            return b * b - 4 * a * c;
        }
    }

    private class SolutionResolver {
        double getFirstSolution() {
            return 0f;
        }

        double getSecondSolution() {
            return 0f;
        }
    }

    public static class SolutionResultPrinter {

        static class VV {

        }

        void printSolution(Solution33 solution33) {
            fff = 33;
            System.out.println("Print result");
        }

        Map.Entry entry = new AbstractMap.SimpleEntry("ss", "ss");
    }
}
