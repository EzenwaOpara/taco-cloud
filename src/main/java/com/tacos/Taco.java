package com.tacos;

/*
 * Created by Benjamin
 * On 9/28/2021 - 4:58 PM
 */


import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    @NotBlank
    @Size(min = 3, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;

    @FutureOrPresent
    private Date createdAt;
}
