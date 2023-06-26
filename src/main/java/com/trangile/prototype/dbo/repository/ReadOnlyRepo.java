package com.trangile.prototype.dbo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface ReadOnlyRepo<T, ID> extends Repository<T, ID> {
	 
	
	@Query(value = "SELECT COUNT(*) FROM RC_CHECK_ITEM_NUMBER AS i WHERE i.ItemNo = :itemNumber")
	long countItem(String itemNumber);
	
	@Query(value = "SELECT COUNT(*) FROM RC_CHECK_BATCH_NUMBER AS l WHERE l.LotNo = :lotNumber")
	long countLot(String lotNumber);
	
	@Query(value = "SELECT COUNT(*) FROM RC_CHECK_TNOPAL AS t WHERE t.TNOPAL = :tnopalNumber")
	long countTnoPAL(String tnopalNumber);
}
