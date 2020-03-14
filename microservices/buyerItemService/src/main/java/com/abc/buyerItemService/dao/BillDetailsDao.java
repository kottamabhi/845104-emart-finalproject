package com.abc.buyerItemService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abc.buyerItemService.dao.entity.BillDetailsEntity;

@Repository
public interface BillDetailsDao extends JpaRepository<BillDetailsEntity,Integer> {

	
	//BillDetailsEntity save(BillDetailsEntity billDetailsEntity);
}
