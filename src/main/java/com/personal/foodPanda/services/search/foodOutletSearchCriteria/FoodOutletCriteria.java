package com.personal.foodPanda.services.search.foodOutletSearchCriteria;

import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.foodoutlet.FoodOuletMenuCard;
import com.personal.foodPanda.model.foodoutlet.FoodOutlet;
import com.personal.foodPanda.model.foodoutlet.FoodOutletCatalog;
import com.personal.foodPanda.model.foodoutlet.MenuCardEntry;
import com.personal.foodPanda.services.search.SearchCriteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@AllArgsConstructor
@EqualsAndHashCode

public class FoodOutletCriteria implements SearchCriteria {
    FoodOutlet foodOutlet;
    public List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog) {
        List<MenuCardEntry> menuCardEntries=new ArrayList<MenuCardEntry>();

        for (FoodOutlet foodOutlet:
                foodOutletCatalog.getList() ){
            if(foodOutlet==this.foodOutlet){
                menuCardEntries.addAll(foodOutlet.getMenuCard().getMenuCardEntryList());
            }
        }
        return menuCardEntries;
    }
}
