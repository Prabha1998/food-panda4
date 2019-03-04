package com.personal.foodPanda.model.foodoutlet;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
public class FoodOutletCatalog {
    private List<FoodOutlet> foodOutletList;
    private static FoodOutletCatalog foodOutletCatalog ;

    public static void initializeInstance(List<FoodOutlet> foodOutletList) {
        if(foodOutletCatalog==null){
            foodOutletCatalog=new FoodOutletCatalog(foodOutletList);
        }
    }

    public static FoodOutletCatalog getInstance() {
        return foodOutletCatalog;
    }

    private FoodOutletCatalog(List<FoodOutlet> foodOutletList) {
        this.foodOutletList=foodOutletList;
    }


    public List<FoodOutlet> getList(){
        return Collections.unmodifiableList(foodOutletList);
    }

}
