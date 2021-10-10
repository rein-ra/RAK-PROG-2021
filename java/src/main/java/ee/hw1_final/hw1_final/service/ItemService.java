package ee.hw1_final.hw1_final.service;

import ee.hw1_final.hw1_final.Repository.ItemRepository;
import ee.hw1_final.hw1_final.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    public void saveItem(Item item) {
        itemRepository.save(item);
    }
}
