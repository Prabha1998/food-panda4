package com.personal.foodPanda.services.search.foodItemSearchCriteria;

import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.fooditem.FoodItem;
import com.personal.foodPanda.model.fooditem.FoodItemCategory;
import com.personal.foodPanda.model.foodoutlet.FoodOuletMenuCard;
import com.personal.foodPanda.model.foodoutlet.FoodOutlet;
import com.personal.foodPanda.model.foodoutlet.FoodOutletCatalog;
import com.personal.foodPanda.model.foodoutlet.MenuCardEntry;
import com.personal.foodPanda.services.search.SearchCriteria;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@AllArgsConstructor
public class FoodItemCategoryCriteria implements SearchCriteria {
    FoodItemCategory foodItemCategory;


    public List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog) {

        List<MenuCardEntry> menuCardEntries=new ArrayList<MenuCardEntry>();

        for (FoodOutlet foodOutlet:
             foodOutletCatalog.getList()) {
            FoodOuletMenuCard menuCard=foodOutlet.getMenuCard();
            for (MenuCardEntry entry:
                    menuCardEntries) {
               if(entry.getFoodItem().getFoodItemCategory()==foodItemCategory){
                   menuCardEntries.add(entry);
               }

            }
        }
        return menuCardEntries;
    }
}
