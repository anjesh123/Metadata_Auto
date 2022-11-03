package com.metadata.core.service.api;

import java.util.List;

import org.springframework.stereotype.Service;

import com.metadata.core.entities.MetaDO;
import com.metadata.rest.dto.MetadataModel;
@Service
public interface MetaService {
	
	List<MetaDO> getData();
	
	MetaDO addData(MetaDO requestmodel);
	
	String deleteData(String id);
	
	MetaDO getDetailByID(String id);

}
