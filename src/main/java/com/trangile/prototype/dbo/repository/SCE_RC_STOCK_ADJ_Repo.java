package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;

public interface SCE_RC_STOCK_ADJ_Repo extends JpaRepository<SCE_RC_STOCK_ADJ, Serializable>{
	
	
	@Query(value = "SELECT j FROM SCE_RC_STOCK_ADJ as j WHERE j.ItemNo = :itemNo")
	List<SCE_RC_GRN> fetchByItemNo(@Param("itemNo") Double itemNo);

}
