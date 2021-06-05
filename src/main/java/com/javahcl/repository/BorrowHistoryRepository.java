package com.javahcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javahcl.entity.BorrowHistory;

public interface BorrowHistoryRepository extends JpaRepository<BorrowHistory, Integer> {

	BorrowHistory findByUuId(int uuid);
	
	

}
