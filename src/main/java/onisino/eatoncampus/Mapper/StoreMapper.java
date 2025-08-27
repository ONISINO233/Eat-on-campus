package onisino.eatoncampus.Mapper;

import onisino.eatoncampus.entity.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {
    List<Store> SelectAllStore();
}