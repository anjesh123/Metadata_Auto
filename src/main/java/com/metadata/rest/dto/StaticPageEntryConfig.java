package com.metadata.rest.dto;

public class StaticPageEntryConfig {
	 private String nameSpe;
	 private String titleSpe;
	 private String descriptionSpe;

	 private ConfigSpe configSpe ;

	public String getNameSpe() {
		return nameSpe;
	}

	public void setNameSpe(String nameSpe) {
		this.nameSpe = nameSpe;
	}

	public String getTitleSpe() {
		return titleSpe;
	}

	public void setTitleSpe(String titleSpe) {
		this.titleSpe = titleSpe;
	}

	public String getDescriptionSpe() {
		return descriptionSpe;
	}

	public void setDescriptionSpe(String descriptionSpe) {
		this.descriptionSpe = descriptionSpe;
	}

	public ConfigSpe getConfigSpe() {
		return configSpe;
	}

	public void setConfigSpe(ConfigSpe configSpe) {
		this.configSpe = configSpe;
	}

}
