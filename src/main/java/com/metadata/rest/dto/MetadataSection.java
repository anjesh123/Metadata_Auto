package com.metadata.rest.dto;

//import java.util.List;

public class MetadataSection {
	
	private String name;
	private String title;
	private String description;
	
//	private List<MetadataSteps> steps;
	private MetadataStaticConfig staticconfig;
	
	private ApiDisplayConfig apiDisplayConfig;
	
	private StaticPageEntryConfig staticPageEntryConfig;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MetadataStaticConfig getStaticconfig() {
		return staticconfig;
	}
	public void setStaticconfig(MetadataStaticConfig staticconfig) {
		this.staticconfig = staticconfig;
	}
	public ApiDisplayConfig getApiDisplayConfig() {
		return apiDisplayConfig;
	}
	public void setApiDisplayConfig(ApiDisplayConfig apiDisplayConfig) {
		this.apiDisplayConfig = apiDisplayConfig;
	}
	public StaticPageEntryConfig getStaticPageEntryConfig() {
		return staticPageEntryConfig;
	}
	public void setStaticPageEntryConfig(StaticPageEntryConfig staticPageEntryConfig) {
		this.staticPageEntryConfig = staticPageEntryConfig;
	}
	
	
}
