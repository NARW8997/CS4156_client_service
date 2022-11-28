package com.cs4156.DrinkMoreWaterClient.controllers;
import com.cs4156.DrinkMoreWaterClient.controllers.utils.R;
import com.cs4156.DrinkMoreWaterClient.models.User;
import com.cs4156.DrinkMoreWaterClient.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public R getAll() {
        return new R(true, userService.list());
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, userService.getById(id));
    }

    @PostMapping
    public R insert(@RequestBody User user) {
        return new R(userService.save(user));
    }

    @PutMapping
    public R updateById(@RequestBody User user) {
        return new R(userService.updateById(user));
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        return new R(userService.removeById(id));
    }
}
