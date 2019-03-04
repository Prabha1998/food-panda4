package com.personal.foodPanda.model.foodoutlet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FoodOutlet {

    String name;
    FoodOutletType type;
    //Map<FoodItem,Map<ExtraIngredient,Integer>> extraIngredientRateCard;
    FoodOutletAddress foodOutletAddress;
    FoodOuletMenuCard menuCard;
}
