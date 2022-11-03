package com.metadata.rest.dto;

public class InputSpe {
	
	private String nameInputSpe;
	private SaveValueAsObjectConfiguration  saveValueAsObjectConfiguration;
	private boolean defaultValue ;
	private String hint;
	private String type;
	
	public String getNameInputSpe() {
		return nameInputSpe;
	}
	
	public void setNameInputSpe(String nameInputSpe) {
		this.nameInputSpe = nameInputSpe;
	}
	
	public SaveValueAsObjectConfiguration getSaveValueAsObjectConfiguration() {
		return saveValueAsObjectConfiguration;
	}
	public void setSaveValueAsObjectConfiguration(SaveValueAsObjectConfiguration saveValueAsObjectConfiguration) {
		this.saveValueAsObjectConfiguration = saveValueAsObjectConfiguration;
	}
	public boolean isDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(boolean defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
