package com.metadata.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataModel {

//	@JsonProperty("metadataID")
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("metadata")  
	private String metadata;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	
	@Override
	public String toString() {
		return "[" + "id: "+ this.id + "metadata: " + this.metadata + "]";
	}
//	@Override
//	  public String toString() {
//	    return new StringJoiner(", ", "[", "]")
//	        .add("fileTypeId='" + id + "'")
//	        .add("metadata='" + metadata + "'")
//	        .toString();
//	  }
//	@JsonProperty("metadata")  Ac_to_Dhruv
//	private String metadata;
	
}
