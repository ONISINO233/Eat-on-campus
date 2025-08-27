package onisino.eatoncampus.Service.impl;

import jakarta.annotation.Resource;
import onisino.eatoncampus.Mapper.StoreMapper;
import onisino.eatoncampus.Service.StoreService;
import onisino.eatoncampus.entity.Store;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoreServiceimpl implements StoreService {

    @Resource
    StoreMapper mapper;
    @Override
    public List<Store> selectAllStore() {
        return mapper.SelectAllStore();
    }

}