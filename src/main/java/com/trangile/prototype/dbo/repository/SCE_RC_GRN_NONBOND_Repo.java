package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN_NONBOND;

public interface SCE_RC_GRN_NONBOND_Repo extends JpaRepository<SCE_RC_GRN_NONBOND, Serializable> {

	
	@Query(value = "SELECT s FROM SCE_RC_GRN_NONBOND as s WHERE s.ItemNo = :itemNo")
	List<SCE_RC_GRN_NONBOND> fetchByItemNo(@Param("itemNo") String itemNo);
}
