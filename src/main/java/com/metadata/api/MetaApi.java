package com.metadata.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metadata.dto.MetaRequestDto;
import com.metadata.entities.Meta;
import com.metadata.service.MetaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/",maxAge=3600)
public class MetaApi {
	@Autowired
	private MetaService metaservice;
	
	@GetMapping("/metadata")
	public List<Meta> getDetails()
	  {
		  return this.metaservice.getData();
	  }
	@PostMapping("/metadata")
	public Meta addData(@RequestBody MetaRequestDto meta)
	{
		return this.metaservice.addData(meta);
	}
	
}
