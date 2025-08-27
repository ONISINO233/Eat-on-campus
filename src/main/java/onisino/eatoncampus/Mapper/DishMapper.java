package onisino.eatoncampus.Mapper;

import onisino.eatoncampus.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishMapper {
    List<Dish> SelectAllDish();
    List<Dish> SelectDishInStore(String storeId);
}
