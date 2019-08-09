package ru.yusdm.stud.lesson_5_oop_abstract_interface_nested_classes.lesson.interfaces_2;

import java.io.Serializable;

public abstract class Atm implements Serializable{

    protected String bankName;
    protected int capacity;
    protected String currency;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
