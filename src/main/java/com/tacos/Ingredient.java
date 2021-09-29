package com.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/*
 * Created by Benjamin
 * On 9/28/2021 - 12:41 PM
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
