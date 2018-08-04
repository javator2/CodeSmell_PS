package com.programowanie.smell.bar;
class Pub {

     private Menu menu = new Menu();

     private static final int STUDENT_DISCOUNT = 10;
     private static final int MAX_NUMBER_OF_DRINKS = 2;

     int computeCost(String drink, boolean student, int amount) {
        if (!menu.getMenu().containsKey(drink)) {
            throw new RuntimeException("No such drink exist");
        }

        final Beverage beverage = menu.getMenu().get(drink);

        if (amount > MAX_NUMBER_OF_DRINKS && beverage.isAmountLimited()) {
            throw new RuntimeException("Too many");
        }

        int price = (beverage.getPrice() * amount);

        if (student && beverage.isEligableForStudentDiscount()) {
            return price - (price / STUDENT_DISCOUNT);
        }

        return price;
    }
}


