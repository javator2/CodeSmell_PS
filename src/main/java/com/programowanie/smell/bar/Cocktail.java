package com.programowanie.smell.bar;

public class Cocktail implements Beverage {
    private int price;

    @Override
    public int getPrice(){
        return price;
    }

    Cocktail withIngredient(IngredientUnit ingredient) {
        return  withIngredient(ingredient,1);
    }
    Cocktail withIngredient(IngredientUnit ingredient, double amount) {
        price+=(ingredient.getPrice()*amount);
        return this;
    }

    public boolean isAmountLimited(){
        return true;
    }
    @Override
    public boolean isEligableForStudentDiscount() {
        return false;
    }
}
