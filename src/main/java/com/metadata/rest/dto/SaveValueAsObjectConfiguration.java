package com.metadata.rest.dto;

public class SaveValueAsObjectConfiguration {
	
	private String editableProperty;
    private StaticObjectProperties staticObjectProperties;
   
	public String getEditableProperty() {
		return editableProperty;
	}
	public void setEditableProperty(String editableProperty) {
		this.editableProperty = editableProperty;
	}
	public StaticObjectProperties getStaticObjectProperties() {
		return staticObjectProperties;
	}
	public void setStaticObjectProperties(StaticObjectProperties staticObjectProperties) {
		this.staticObjectProperties = staticObjectProperties;
	}
	}
