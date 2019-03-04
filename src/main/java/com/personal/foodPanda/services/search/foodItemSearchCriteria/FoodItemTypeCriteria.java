package com.personal.foodPanda.services.search.foodItemSearchCriteria;

import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.fooditem.FoodItemType;
import com.personal.foodPanda.model.foodoutlet.FoodOuletMenuCard;
import com.personal.foodPanda.model.foodoutlet.FoodOutlet;
import com.personal.foodPanda.model.foodoutlet.FoodOutletCatalog;
import com.personal.foodPanda.model.foodoutlet.MenuCardEntry;
import com.personal.foodPanda.services.search.SearchCriteria;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@EqualsAndHashCode
public class FoodItemTypeCriteria implements SearchCriteria {

    FoodItemType foodItemType;

    public List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog) {
        List<MenuCardEntry> menuCardEntries=new ArrayList<MenuCardEntry>();

        for (FoodOutlet foodOutlet:
                foodOutletCatalog.getList()) {

            FoodOuletMenuCard menuCard=foodOutlet.getMenuCard();

            for (MenuCardEntry entry:
                    foodOutlet.getMenuCard().getMenuCardEntryList()) {
                if(entry.getFoodItem().getFoodItemType()==foodItemType){
                    menuCardEntries.add(entry);
                }

            }
        }
        return menuCardEntries;
    }
}
