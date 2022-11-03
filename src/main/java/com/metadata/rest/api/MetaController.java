package com.metadata.rest.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

 //import static com.metadata.common.Constants.METASERVICE_API_V1;
import com.metadata.adapter.api.RestAdapterV1;
import com.metadata.rest.dto.MetadataModel;

@RestController()
@CrossOrigin(origins = "http://localhost:4200/",maxAge=3600)
@RequestMapping(path = "/api/v1/")
public class MetaController {
	
	private final RestAdapterV1 restAdapterV1;
	
	@Autowired
	public MetaController(final RestAdapterV1 restAdapterV1) {
		this.restAdapterV1 = restAdapterV1;
	}
	@GetMapping("metadata")
	public List<MetadataModel> getDetails() 
	{ 
		return this.restAdapterV1.getData(); 
	}
	
	@PostMapping("metadata")
	public ResponseEntity<Boolean> addData(@RequestBody MetadataModel meta)
	{
		boolean status = this.restAdapterV1.addData(meta);
		if(status) {
			return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);			
		} else {
			return new ResponseEntity<Boolean>(true, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@DeleteMapping("metadata/{id}")
	  public String deleteData(@PathVariable String id)
	  {
		  return this.restAdapterV1.deleteData(id);
	  }
	
	@GetMapping("metadata/{id}")
	public MetadataModel getDetailByID(@PathVariable String id) 
	{ 
		return this.restAdapterV1.getDetailByID(id); 
	}

	 

	
}
