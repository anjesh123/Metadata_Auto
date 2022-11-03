package com.metadata.adapter.api;

import java.util.List;

//import org.springframework.web.bind.annotation.PathVariable;

//import org.springframework.web.bind.annotation.PathVariable;

import com.metadata.rest.dto.MetadataModel;

public interface RestAdapterV1 {

	List<MetadataModel> getData();

	boolean addData(MetadataModel meta);
	
	String deleteData(String id);
	
	MetadataModel getDetailByID(String id);
	
       
 }
 