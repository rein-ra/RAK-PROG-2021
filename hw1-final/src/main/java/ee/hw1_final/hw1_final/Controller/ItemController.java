package ee.hw1_final.hw1_final.Controller;

import ee.hw1_final.hw1_final.model.Item;
import ee.hw1_final.hw1_final.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:3000")

public class ItemController {

    @Autowired
    ItemService itemService;
    @GetMapping("items")
    public List<Item> getItems(){
        return itemService.getItems();
    }
    @PostMapping("items")
    public String postItem(@RequestBody Item item){
        itemService.saveItem(item);
        return "Item edukalt lisatud!" + item.getName();
    }

}
