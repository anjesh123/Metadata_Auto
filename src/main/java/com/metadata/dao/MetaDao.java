package com.metadata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metadata.entities.Meta;

@Repository
public interface MetaDao extends JpaRepository<Meta, String>{
	
}
