package ee.hw1_final.hw1_final.Repository;

import ee.hw1_final.hw1_final.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
