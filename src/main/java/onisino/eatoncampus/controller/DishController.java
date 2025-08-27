package onisino.eatoncampus.controller;


import jakarta.annotation.Resource;
import onisino.eatoncampus.Service.DishService;
import onisino.eatoncampus.entity.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {

    @Resource
    private DishService dishService;

    @GetMapping("/selectAll")
    public List<Dish> selectAllDish(){
        return dishService.SelectAllDish();
    }

    @GetMapping("/store/{storeId}")
    public List<Dish> getDishesByStore(@PathVariable String storeId) {
        return dishService.SelectDishInStore(storeId);
    }

}
