package com.personal.foodPanda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
public class FoodOutletCatalog {
    private List<FoodOutlet> foodOutletList;
    private static FoodOutletCatalog ourInstance ;

    public static void initializeInstance(List<FoodOutlet> foodOutletList) {
        if(ourInstance==null){
            ourInstance=new FoodOutletCatalog(foodOutletList);
        }
    }

    public static FoodOutletCatalog getInstance() {
        return ourInstance;
    }

    private FoodOutletCatalog() {
    }

    public List<FoodOutlet> getList(){
        return Collections.unmodifiableList(foodOutletList);
    }

}
