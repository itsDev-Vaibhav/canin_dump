package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trangile.prototype.dbo.entity.UCBInventoryEntity;

public interface UCBInventoryRepo extends JpaRepository<UCBInventoryEntity, Serializable>{
	
	@Query(value = "SELECT * FROM SCE_UCB_INVENTORY_DUMP", nativeQuery = true)
	List<UCBInventoryEntity> getAllRecords();
	
	
//	@Query(value = "SELECT i FROM InventoryEntity AS i WHERE i.Country = :country")
//	List<InventoryEntity> getAllRecordsByOwner(@Param("country") String country);
//
//	@Query(value = "SELECT COUNT(*) FROM InventoryEntity AS i WHERE i.Country = :country")
//	Long getCount(@Param("country") String country);
	
}
