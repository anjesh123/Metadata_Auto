package com.metadata.core.entities;
//import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "meta_info")
public class MetaDO {
	@Id
	private String id;
	@Column(name = "metadata", nullable = true, length = 80000)
	private String metadata;
	
	public MetaDO() {
		
	}
	public MetaDO(String metadata, String id) {
		this.id = id;
		this.metadata = metadata;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
			this.id = id;
	}
	
	public String getMetadata() {
		return this.metadata;
	}
	
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	
	@Override
	public String toString() {
		return "Meta [id= " + this.id + ", metadata= " + this.metadata + "]";
	}
}
