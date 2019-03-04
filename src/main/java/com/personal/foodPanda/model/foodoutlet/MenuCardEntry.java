package com.personal.foodPanda.model.foodoutlet;

import com.personal.foodPanda.model.fooditem.FoodItem;
import com.personal.foodPanda.model.fooditem.FoodItemCategory;
import com.personal.foodPanda.model.fooditem.FoodItemTheme;
import com.personal.foodPanda.model.fooditem.FoodItemType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuCardEntry {

    String belongTo;
    FoodItem foodItem;
//    FoodItemType foodItemType;
//    FoodItemCategory foodItemCategory;
    int foodItemRate;
}
