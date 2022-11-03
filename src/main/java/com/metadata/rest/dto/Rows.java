package com.metadata.rest.dto;

public class Rows {
	private String hint;
	private String name;
	private String placeholder;
	private String type;
	private Validations validations;
	
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaceholder() {
		return placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Validations getValidations() {
		return validations;
	}
	public void setValidations(Validations validations) {
		this.validations = validations;
	}
}
