package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.interfaces_2;

public class GoodBankAtm
        extends Atm implements MoneyGivable, WholeDayWorkable {

    @Override
    public void giveMoney() {
        System.out.println(WindowConstants.DO_NOTHING_ON_CLOSE);
        System.out.println("Take cash with koef ");
    }
}
