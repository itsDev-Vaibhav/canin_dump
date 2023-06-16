package com.trangile.prototype.dbo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;

public interface SCE_RC_SHIPMENT_Repo extends JpaRepository<SCE_RC_SHIPMENT, Serializable> {
	
	@Query(value = "SELECT r FROM SCE_RC_SHIPMENT as r WHERE r.ItemNo = :itemNo")
	List<SCE_RC_SHIPMENT> fetchByItemNo(@Param("itemNo") String itemNo);
}
