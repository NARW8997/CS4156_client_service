package com.cs4156.DrinkMoreWaterClient.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer id;
    private String sex;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
}
