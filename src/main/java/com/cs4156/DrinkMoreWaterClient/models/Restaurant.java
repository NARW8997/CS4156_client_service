package com.cs4156.DrinkMoreWaterClient.models;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    protected Integer restId;
    protected String restLocation;
    protected String restName;
    protected Integer restLikes;
    protected Integer restDislikes;
    protected String restNumber;
    protected String restSize;
    protected Integer restOwnerId;
}