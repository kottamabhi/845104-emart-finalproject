package com.abc.buyerItemService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abc.buyerItemService.dao.entity.ItemEntity;

@Repository
public interface ItemDao extends JpaRepository<ItemEntity,Integer>{

}
