package com.personal.foodPanda.services.search.foodOutletSearchCriteria;

import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.foodoutlet.FoodOutlet;
import com.personal.foodPanda.model.foodoutlet.FoodOutletCatalog;
import com.personal.foodPanda.model.foodoutlet.FoodOutletType;
import com.personal.foodPanda.model.foodoutlet.MenuCardEntry;
import com.personal.foodPanda.services.search.SearchCriteria;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@AllArgsConstructor

public class FoodOutletTypeCriteria implements SearchCriteria {
    FoodOutletType foodOutletType;
    public List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog) {

        List<MenuCardEntry> menuCardEntryList=new ArrayList<MenuCardEntry>();
        for (FoodOutlet foodOutlet:
             foodOutletCatalog.getList()) {
            if(foodOutletType==foodOutlet.getType()){
                menuCardEntryList.addAll(foodOutlet.getMenuCard().getMenuCardEntryList());
            }
        }
        return menuCardEntryList;
    }
}
