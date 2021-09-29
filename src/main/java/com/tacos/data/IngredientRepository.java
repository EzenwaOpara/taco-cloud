package com.tacos.data;

/*
 * Created by Benjamin
 * On 9/29/2021 - 11:43 PM
 */

import com.tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
