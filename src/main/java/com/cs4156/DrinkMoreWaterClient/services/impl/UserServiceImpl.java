package com.cs4156.DrinkMoreWaterClient.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cs4156.DrinkMoreWaterClient.mapper.UserMapper;
import com.cs4156.DrinkMoreWaterClient.models.User;
import com.cs4156.DrinkMoreWaterClient.services.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
