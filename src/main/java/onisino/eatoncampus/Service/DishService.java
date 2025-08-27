package onisino.eatoncampus.Service;

import onisino.eatoncampus.entity.Dish;
import java.util.List;

public interface DishService {
    List<Dish> SelectAllDish();

    List<Dish> SelectDishInStore(String storeId);
}
