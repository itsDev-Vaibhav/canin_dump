package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;

public interface SCE_RC_SHIPMENT_Repo extends JpaRepository<SCE_RC_SHIPMENT, Serializable> {
	
	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.ItemNo = :itemNo")
	List<SCE_RC_SHIPMENT> findAllByItem(@Param("itemNo") String itemNo);
	
	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.LotNo = :lotNo")
	List<SCE_RC_SHIPMENT> findAllByLotNo(@Param("lotNo") String lotNo);

	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.TNOPAL = :tnopal")
	List<SCE_RC_SHIPMENT> findAllByTNOPAL(@Param("tnopal") String tnopal);
	
	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.ItemNo = :itemNo AND s.LotNo = :lotNo")
	List<SCE_RC_SHIPMENT> findAllByItemANDLotNo(@Param("itemNo") String itemNo, @Param("lotNo") String lotNo);
	
	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.ItemNo = :itemNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_SHIPMENT> findAllByItemANDTNOPAL(@Param("itemNo") String itemNo, @Param("tnopal") String tnopal);

	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.LotNo = :lotNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_SHIPMENT> findAllByLotNoANDTNOPAL(@Param("lotNo") String lotNo, @Param("tnopal") String tnopal);

	@Query(value = "SELECT s FROM SCE_RC_SHIPMENT AS s WHERE s.ItemNo = :itemNo AND s.LotNo = :lotNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_SHIPMENT> findAllByItemANDLotNoANDTNOPAL(@Param("itemNo") String itemNo, @Param("lotNo") String lotNo, @Param("tnopal") String tnopal);
}
