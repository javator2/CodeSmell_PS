package com.programowanie.smell.bar;

import java.util.HashMap;

class Menu {
    static final String ONE_BEER = "hansa";
    static final String ONE_CIDER = "grans";
    static final String A_PROPER_CIDER = "strongbow";
    static final String GT = "gt";
    static final String BACARDI_SPECIAL = "bacardi_special";

    private final HashMap<String, Beverage> menu;

    Menu() {

        this.menu = new HashMap<>();
        menu.put(ONE_BEER, new SimpleBeverage(74));
        menu.put(ONE_CIDER, new SimpleBeverage(103));
        menu.put(A_PROPER_CIDER, new SimpleBeverage(110));
        menu.put(GT, new Cocktail()
                .withIngredient(IngredientUnit.GIN)
                .withIngredient(IngredientUnit.TONIC_WATER)
                .withIngredient(IngredientUnit.GREEN_STUFF));
        menu.put(BACARDI_SPECIAL, new Cocktail()
                .withIngredient(IngredientUnit.GIN, 0.5)
                .withIngredient(IngredientUnit.GRENADINE)
                .withIngredient(IngredientUnit.LIME_JUICE)
                .withIngredient(IngredientUnit.RUM));
    }

    HashMap<String, Beverage> getMenu() {
        return menu;
    }
}
