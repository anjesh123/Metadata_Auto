package com.metadata.rest.dto;

import java.util.List;

public class MetadataObject {
	private Integer id;
	private String metadataName;
	private String ipackName ;
	private int version;
	
	private List<MetadataSection> section;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMetadataName() {
		return metadataName;
	}
	public void setMetadataName(String metadataName) {
		this.metadataName = metadataName;
	}
	public String getIpackName() {
		return ipackName;
	}
	public void setIpackName(String ipackName) {
		this.ipackName = ipackName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public List<MetadataSection> getSection() {
		return section;
	}
	public void setSection(List<MetadataSection> section) {
		this.section = section;
	}
	
	
}
