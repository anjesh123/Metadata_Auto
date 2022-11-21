package com.metadata.adapter.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.metadata.adapter.api.RestAdapterV1;
import com.metadata.common.JsonUtil;
import com.metadata.core.entities.MetaDO;
import com.metadata.core.service.api.MetaService;
import com.metadata.rest.dto.MetadataModel;
//import com.metadata.rest.dto.MetadataObject;

@Component
public class RestAdapterV1Impl implements RestAdapterV1{
	private final MetaService metaService;
	
	@Autowired
	public RestAdapterV1Impl(final MetaService metaService) {
		this.metaService = metaService;
	}

	@Override
	public List<MetadataModel> getData() {
		List<MetaDO> lst = this.metaService.getData();
		List<MetadataModel> resulList = new ArrayList<>();
		for (MetaDO meta : lst) {
			resulList.add(metaToMetaDataModel(meta));
		}
		return resulList;
	}
	
	@Override
	public boolean addData(MetadataModel meta) {
//		String str=null;
//			try {
//				str = JsonUtil.convertObjectToJsonString(meta.getMetadata());
//			} catch (JsonProcessingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
		
		//String str=Objects.toString(meta.getMetadata(), "");
		
		MetaDO dao = new MetaDO(meta.getMetadata(), meta.getId().toString());
			MetaDO metado =this.metaService.addData(dao);
			if(metado != null)
			   return true;
			else
				return false;
		
		
	}
	
//	@Override                                         
//	public boolean addData(MetadataModel meta) {   // Ac to Dhruv
//		
//		String str=Objects.toString(meta.getMetadata(), "");
//		
//		MetaDO dao = new MetaDO(str, meta.getId().toString());
//			MetaDO metado =this.metaService.addData(dao);
//			if(metado != null)
//			   return true;
//			else
//				return false;
//		
//		
//	}
	
	@Override
	public String deleteData(String id) {
		boolean status= this.metaService.deleteData(id) != null;
		if(status==true)
		{
			return "Success....data deleted";
		}
		else
		{
			return "fail......not deleted";
		}
	}
	@Override
	public MetadataModel getDetailByID(String id) {
		MetaDO tmp = this.metaService.getDetailByID(id);
		return metaToMetaDataModel(tmp);
	}
	
	private MetadataModel metaToMetaDataModel(MetaDO in) {
		MetadataModel out = new MetadataModel();
		out.setId(in.getId());
		out.setMetadata(in.getMetadata());
		
//		try {
//			out.setMetadata(JsonUtil.convertJsonStringToObject(in.getMetadata(),MetadataObject.class));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return out;
		
	}

	

	
	
	
}
