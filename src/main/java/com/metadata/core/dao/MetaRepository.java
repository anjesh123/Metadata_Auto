package com.metadata.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metadata.core.entities.MetaDO;

@Repository
public interface MetaRepository extends JpaRepository<MetaDO, String>{

//	public MetadataResponse getMetadata(String metadataId) {
//		
//		
//		
//	}
}
