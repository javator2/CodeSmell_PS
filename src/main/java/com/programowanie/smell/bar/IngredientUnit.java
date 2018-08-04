package com.programowanie.smell.bar;

enum IngredientUnit {
RUM(65),
GRENADINE(10),
LIME_JUICE(10),
GREEN_STUFF(10),
TONIC_WATER(20),
GIN(85);

    private int price;

    IngredientUnit(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}
