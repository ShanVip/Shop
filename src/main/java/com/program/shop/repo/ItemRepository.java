package com.program.shop.repo;

import com.program.shop.modeles.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
