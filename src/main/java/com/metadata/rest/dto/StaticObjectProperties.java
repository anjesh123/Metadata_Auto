package com.metadata.rest.dto;

public class StaticObjectProperties {
	
	private String nameSop ;
	private boolean userPrompted;
	private boolean parameterType;
	
	public String getNameSop() {
		return nameSop;
	}
	public void setNameSop(String nameSop) {
		this.nameSop = nameSop;
	}
	public boolean isUserPrompted() {
		return userPrompted;
	}
	public void setUserPrompted(boolean userPrompted) {
		this.userPrompted = userPrompted;
	}
	public boolean isParameterType() {
		return parameterType;
	}
	public void setParameterType(boolean parameterType) {
		this.parameterType = parameterType;
	}
}
