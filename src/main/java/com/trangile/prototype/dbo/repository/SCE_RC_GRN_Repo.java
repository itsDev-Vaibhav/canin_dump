package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;

public interface SCE_RC_GRN_Repo extends JpaRepository<SCE_RC_GRN, Serializable> {
	
	@Query(value = "SELECT s FROM SCE_RC_GRN as s WHERE s.ItemNo = :itemNo")
	List<SCE_RC_GRN> fetchByItemNo(@Param("itemNo") String itemNo);
}
