package com.trangile.prototype.dbo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trangile.prototype.dbo.entity.LegInventoryEntity;

public interface LegInventoryRepo extends JpaRepository<LegInventoryEntity, java.io.Serializable> {
	
	
	@Query(value = "SELECT * FROM SCE_LEGRAND_INVENTORY_DUMP WHERE OnHand > 0 ORDER BY(Item)", nativeQuery = true)
	List<LegInventoryEntity> getAllRecords();
	
	
}
