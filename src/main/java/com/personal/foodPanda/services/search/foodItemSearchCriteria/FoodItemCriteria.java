package com.personal.foodPanda.services.search.foodItemSearchCriteria;

import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.fooditem.FoodItem;
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
@EqualsAndHashCode
@AllArgsConstructor
public class FoodItemCriteria implements SearchCriteria {
    FoodItem foodItem;
    public List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog) {

        List<MenuCardEntry> menuCardEntries=new ArrayList<MenuCardEntry>();

        for (FoodOutlet foodOutlet:
                foodOutletCatalog.getList()) {

            FoodOuletMenuCard menuCard=foodOutlet.getMenuCard();

            for (MenuCardEntry entry:
                   foodOutlet.getMenuCard().getMenuCardEntryList()) {
                if(entry.getFoodItem()==foodItem){
                    menuCardEntries.add(entry);
                }

            }
        }
        return menuCardEntries;
    }
}
