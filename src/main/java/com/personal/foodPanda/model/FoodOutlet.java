package com.personal.foodPanda.model;

import lombok.Getter;

import java.util.Map;

@Getter
public class FoodOutlet {

    String name;
    FoodOutletType type;
    Map< Theme,Map<FoodItemCategory,Map<FoodItem,Integer>>> menuCard;
    //Map<FoodItem,Map<ExtraIngredient,Integer>> extraIngredientRateCard;
    FoodOutletAddress foodOutletAddress;
}
