package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;

public interface SCE_RC_GRN_Repo extends JpaRepository<SCE_RC_GRN, Serializable> {
	
	@Query(value = "SELECT * FROM SCE_RC_GRN_DATA WHERE SCE_RC_GRN_DATA.ItemNo = :itemNo", nativeQuery = true)
	List<SCE_RC_GRN> resultByItem(@Param("itemNo") String itemNo);
	
	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.LotNo = :lotNo")
	List<SCE_RC_GRN> findAllByLotNo(@Param("lotNo") String lotNo);

	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.TNOPAL = :tnopal")
	List<SCE_RC_GRN> findAllByTNOPAL(@Param("tnopal") String tnopal);
	
	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.ItemNo = :itemNo AND s.LotNo = :lotNo")
	List<SCE_RC_GRN> findAllByItemANDLotNo(@Param("itemNo") String itemNo, @Param("lotNo") String lotNo);
	
	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.ItemNo = :itemNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_GRN> findAllByItemANDTNOPAL(@Param("itemNo") String itemNo, @Param("tnopal") String tnopal);

	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.LotNo = :lotNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_GRN> findAllByLotNoANDTNOPAL(@Param("lotNo") String lotNo, @Param("tnopal") String tnopal);

	@Query(value = "SELECT s FROM SCE_RC_GRN AS s WHERE s.ItemNo = :itemNo AND s.LotNo = :lotNo AND s.TNOPAL = :tnopal")
	List<SCE_RC_GRN> findAllByItemANDLotNoANDTNOPAL(@Param("itemNo") String itemNo, @Param("lotNo") String lotNo, @Param("tnopal") String tnopal);
}