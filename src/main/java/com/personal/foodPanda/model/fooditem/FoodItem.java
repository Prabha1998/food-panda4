package com.personal.foodPanda.model.fooditem;

import lombok.Getter;

@Getter
public class FoodItem {
    String name;
    FoodItemType foodItemType;
    FoodItemCategory foodItemCategory;
    FoodItemTheme foodItemTheme;
}
