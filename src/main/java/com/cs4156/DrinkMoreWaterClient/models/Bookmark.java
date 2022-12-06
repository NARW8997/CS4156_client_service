package com.cs4156.DrinkMoreWaterClient.models;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {
    private Integer markId;
    private Integer userId;
    private Integer restId;
}
