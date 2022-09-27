package com.metadata.service;

import java.util.List;

import com.metadata.dto.MetaRequestDto;
import com.metadata.entities.Meta;

public interface MetaService {
	List<Meta> getData();
	
	Meta addData(MetaRequestDto meta);
	
}
