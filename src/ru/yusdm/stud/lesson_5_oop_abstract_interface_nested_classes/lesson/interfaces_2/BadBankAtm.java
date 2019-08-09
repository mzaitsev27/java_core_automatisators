package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.interfaces_2;

public class BadBankAtm extends Atm implements MoneyGivable {

    @Override
    public void giveMoney() {
        System.out.println("Take cash with koef " + BAD_RATE);
    }

}
