package com.cs4156.DrinkMoreWaterClient.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private Integer reviewId;
    private String content;
    private Integer restId;
    private Integer userId;
}
