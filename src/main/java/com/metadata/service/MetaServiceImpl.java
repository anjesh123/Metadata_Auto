package com.metadata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metadata.dao.MetaDao;
import com.metadata.entities.Meta;
import com.metadata.dto.MetaRequestDto;

@Service
public class MetaServiceImpl implements MetaService {
	@Autowired
	private MetaDao metadao;

	@Override
	public List<Meta> getData() {
		return metadao.findAll();
	}

	@Override
	public Meta addData(MetaRequestDto metarequest) {
		Meta meta =new Meta(metarequest.getName());
		metadao.save(meta);
		return meta;
	}
	
	

}
