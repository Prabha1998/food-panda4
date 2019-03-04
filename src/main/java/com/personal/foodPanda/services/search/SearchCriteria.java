package com.personal.foodPanda.services.search;

import com.personal.foodPanda.model.foodoutlet.FoodOutlet;
import com.personal.foodPanda.model.FoodPandaDatabase;
import com.personal.foodPanda.model.foodoutlet.FoodOutletCatalog;
import com.personal.foodPanda.model.foodoutlet.MenuCardEntry;

import java.util.List;
import java.util.Map;

public interface SearchCriteria {
    List<MenuCardEntry> meet(FoodOutletCatalog foodOutletCatalog);
}
