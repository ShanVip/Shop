package com.program.Shop.repo;

import com.program.Shop.modeles.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
