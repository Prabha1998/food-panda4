package com.personal.foodPanda.services.admin;

import com.personal.foodPanda.model.foodoutlet.*;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FoodSourceCatalogManager implements InitializeDatabase,AddToCatalog,DeleteFromCatalog{
    List<FoodOutlet> foodOutlets;
    FoodOutletCatalog foodOutletCatalog;


    public void initializeDatabase(){
         FoodOutletCatalog.initializeInstance(foodOutlets);
         foodOutletCatalog=FoodOutletCatalog.getInstance();
    }

    public void addToCatalog(FoodOutlet newFoodOutlet){
       foodOutletCatalog.getFoodOutletList().add(newFoodOutlet);
    }


    public void deleteFromCatalog(FoodOutlet foodOutlet)
    {
        foodOutletCatalog.getFoodOutletList().remove(foodOutlet);
    }
}
