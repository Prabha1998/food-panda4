package com.personal.foodPanda.services.search;

import com.personal.foodPanda.model.FoodOutlet;
import com.personal.foodPanda.model.FoodPandaDatabase;

import java.util.Map;

public interface SearchCriteria {
    Map<FoodOutlet, Map> filterDatabase(FoodPandaDatabase database);
}
