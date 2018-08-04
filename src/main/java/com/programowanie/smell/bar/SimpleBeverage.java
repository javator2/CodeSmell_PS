package com.programowanie.smell.bar;

public class SimpleBeverage implements Beverage {

    private int price;

    SimpleBeverage(int price) {
    this.price=price;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public boolean isEligableForStudentDiscount() {
        return true;
    }

    @Override
    public boolean isAmountLimited() {
        return false;
    }
}
