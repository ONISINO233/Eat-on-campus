package onisino.eatoncampus.controller;

import jakarta.annotation.Resource;
import onisino.eatoncampus.Service.StoreService;
import onisino.eatoncampus.entity.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Resource
    StoreService storeService;

    @GetMapping("/selectAll")
    public List<Store> selectAllStore(){
        return storeService.selectAllStore();
    }

}