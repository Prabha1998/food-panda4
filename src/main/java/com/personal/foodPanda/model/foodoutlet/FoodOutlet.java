package com.personal.foodPanda.model.foodoutlet;

import com.personal.foodPanda.model.fooditem.FoodItem;
import com.personal.foodPanda.model.fooditem.FoodItemCategory;
import com.personal.foodPanda.model.fooditem.Theme;
import lombok.Getter;

import java.util.Map;

@Getter
public class FoodOutlet {

    String name;
    FoodOutletType type;
    Map<Theme,Map<FoodItemCategory,Map<FoodItem,Integer>>> menuCard;
    //Map<FoodItem,Map<ExtraIngredient,Integer>> extraIngredientRateCard;
    FoodOutletAddress foodOutletAddress;
}
