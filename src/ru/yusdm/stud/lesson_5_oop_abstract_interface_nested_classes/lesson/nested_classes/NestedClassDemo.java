package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.nested_classes;

public class NestedClassDemo {
    public static void main(String[] args) {
        Equation equation = new Equation();
        Equation.Discriminant33 d = equation.new Discriminant33();

        Equation.Solution33 solution = equation.resolve(1, 2, 3);

        Equation.SolutionResultPrinter resultPrinter = new Equation.SolutionResultPrinter();
        resultPrinter.printSolution(solution);

        Equation.SolutionResultPrinter.VV vv = new Equation.SolutionResultPrinter.VV();
    }
}
