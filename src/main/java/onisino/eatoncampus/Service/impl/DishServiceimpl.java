package onisino.eatoncampus.Service.impl;

import jakarta.annotation.Resource;
import onisino.eatoncampus.Mapper.DishMapper;
import onisino.eatoncampus.Service.DishService;
import onisino.eatoncampus.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceimpl implements DishService {

    @Resource
    private DishMapper dishMapper;

    @Override
    public List<Dish> SelectAllDish(){
        return dishMapper.SelectAllDish();
    }

    @Override
    public List<Dish> SelectDishInStore(String storeId) {
        return dishMapper.SelectDishInStore(storeId);
    }
}