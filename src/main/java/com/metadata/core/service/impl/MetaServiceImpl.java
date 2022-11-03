package com.metadata.core.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metadata.core.dao.MetaRepository;
import com.metadata.core.entities.MetaDO;
import com.metadata.core.service.api.MetaService;
import com.metadata.rest.dto.MetadataModel;

@Service
public class MetaServiceImpl implements MetaService {
	@Autowired
	private MetaRepository metadao;

	@Override
	public List<MetaDO> getData() {
		return metadao.findAll();
	}

@Override
	public MetaDO addData(MetaDO requestmodel) {
		//Meta meta =new Meta(metarequest.getName());
		return metadao.save(requestmodel);
		}

@Override
	public String deleteData(String id) {
		 metadao.deleteById(id);	
		 return "true";
	}

@Override
	public MetaDO getDetailByID(String id) {
		return metadao.findById(id).get();
}

}
